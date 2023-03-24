package io;

import java.io.File;
import java.util.Iterator;

public class FileEx3 {
	// 삭제된 파일 개수를 저장하는 변수 deletedFiles
	static int deletedFiles = 0;
	
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("사용법 : java FileEx3 디렉토리명");
			System.exit(0);
		}
		
		// 현재 작업 디렉토리 가져오기
		String currDir = System.getProperty("user.dir");
		System.out.println(currDir);
		
		File dir = new File(currDir); 
		String ext = "."+args[0]; // ".bak"
		
		delete(dir, ext);	//ext : .txt	
		System.out.println(deletedFiles + "개의 파일이 삭제되었습니다.");
	}	
	
	public static void delete(File dir, String ext) {
		// 파일정보를 가져와서 파일배열에 담기
		File[] files = dir.listFiles();
		
		for (int i = 0; i < files.length; i++) {
			if(files[i].isDirectory()) {
				// 재귀호출 : 자신의 메소드를 호출
				delete(files[i], ext);
			}else {
				String fileName = files[i].getAbsolutePath();
				
				if(fileName.endsWith(ext)) {
					System.out.println(fileName);
					// delete() 파일삭제
					if(files[i].delete()) {
						System.out.println(" - 삭제 성공");
						deletedFiles++;
					}else {
						System.out.println(" - 삭제 실패");
					}
				}
			}
		}
	}

}
