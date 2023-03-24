package io;

import java.io.File;
import java.io.IOException;

public class FileEx1 {
	public static void main(String[] args) throws IOException {
		// 자바에서 파일 다루기
		
		// \ => escape 문자(\t,\n,\b...)
		
		// File(String pathname)
		File file1 = new File("c:\\temp\\test1.txt");
		
		// File(String parent, String child)
		File file2 = new File("c:\\temp","test1.txt");
		
		// File(File parent, String child)
		File dir = new File("c:\\temp");
		File file3 = new File(dir, "test1.txt");
		
		// File(URI uri)
		
		
		// 주요메소드
		// getName() : 파일명 가져오기
		String fileName = file1.getName();
		// . 위치 찾기, subString 써서 test1
		int pos = fileName.lastIndexOf(".");		
		
		System.out.println("파일명 "+fileName); // test1.txt
		System.out.println("확장자를 제외한 파일명 "+fileName.substring(0, pos)); // test1
		System.out.println("확장자 "+fileName.substring(pos+1)); // txt
		
		// getPath()
		System.out.println("파일명을 포함한 파일의 경로 "+file1.getPath()); // c:\temp\test1.txt
		// getAbsolutePath() : 파일의 절대경로 , getCanonicalPath() : 파일의 정규경로
		System.out.println(file1.getAbsolutePath()); // c:\temp\test1.txt
		System.out.println(file1.getCanonicalPath()); // C:\temp\test1.txt
		// getParent()
		System.out.println("파일이 속해 있는 디렉토리 "+file1.getParent()); // c:\temp
		
		// File.pathSeparator : 운영체제에서 사용하는 경로 구분자(윈도우 : ; , 유닉스 : :(클론))
		System.out.println("File.pathSeparator "+File.pathSeparator); // ;
		System.out.println("File.pathSeparatorChar "+File.pathSeparatorChar); // ;
		// File.separator : 운영체제에서 사용하는 이름 구분자(윈도우 : \ , 유닉스 : /)
		System.out.println("File.separator "+File.separator); // \
		System.out.println("File.separatorChar "+File.separatorChar); // \
	}

}











