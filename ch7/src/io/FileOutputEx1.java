package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class FileOutputEx1 {
	public static void main(String[] args) {
		// 키보드에서 입력을 받아들여 파일에 쓰기				
		// 조건 : 키보드에 q가 입력되기 전까지 계속 받아들이도록 한다.		
		//       Scanner, FileWriter/BufferedWriter 사용
		String content = null; //사용자 입력 내용 저장 변수
		
		try(Scanner sc = new Scanner(System.in);
			FileWriter fw = new FileWriter("c:\\temp\\output3.txt");
			BufferedWriter bw = new BufferedWriter(fw)) {
			
			System.out.println("파일에 저장할 데이터를 입력해 주세요");
			System.out.println("입력을 중단하려면 q를 입력해 주세요");
			
			// abc
			do {
				
				System.out.print(">> ");
				content = sc.nextLine(); // 사용자 입력을 저장하는 부분
				
				if(content.equals("q")) {
					bw.write(content);
					bw.newLine();					
				}
				
			} while (!content.equals("q"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
