package board.util;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

// upload.jsp 에서 했던 작업
public class BoardUploadUtils {
	
	public Map<String, String> uploadFile(HttpServletRequest request){
		
		Map<String, String> formData = new HashMap();
		
		// 현재 request에 file upload 요청이 들어있는지 확인
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);

		if(isMultipart){
			DiskFileItemFactory factory = new DiskFileItemFactory();
			
			// Create a new file upload handler
			ServletFileUpload upload = new ServletFileUpload(factory);
			
			try {
				// Parse the request(request를 파일형식으로 변환해서 담음)
				List<FileItem> items = upload.parseRequest(request);
				
				Iterator<FileItem> iter = items.iterator();
				
			    String name = null, value = null;
				
				while (iter.hasNext()) {
				    FileItem item = iter.next();
					
				    // 필드명 가져오기
				    name = item.getFieldName();
				    // 일반요소일때 - writeForm 에서 name, password, content, title
				    if (item.isFormField()) {
				        value = item.getString("utf-8");
				        
				        formData.put(name, value);
				    } else { // 파일요소일때				    	
				        value = item.getName();
				        
				     // 파일 저장
				        if(!name.isEmpty() && item.getSize() > 0){ // 파일명이 비어있거나 파일크기가 0보다 클 경우
				        	String path = "c:\\upload";	
				        	
				        	// 고유값 생성
				        	UUID uuid = UUID.randomUUID();
				        	
				        	File f = new File(path+"\\"+uuid.toString()+"_"+value); // c:\\upload//test.html
				        	
				        	formData.put(name, f.getName());
				        	
				        	item.write(f); // 파일저장코드
				        	
				        	
				        }
				    }
				}
			} catch (Exception e) {
				e.printStackTrace();
			}			
		}
		return formData;
	}
}