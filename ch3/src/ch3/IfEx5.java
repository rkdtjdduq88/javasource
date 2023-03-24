package ch3;

import java.awt.print.PrinterGraphics;
import java.util.Scanner;

public class IfEx5 {
   public static void main(String[] args) {
//	   //중첩if
//	   if (condition) {
//		   if (condition) {
//			   
//		   }else {
//			   
//		   }
//	   }else {
//		   if (condition) {
//			   
//		   }
//	   }
//	   
//	   
	   //점수를 입력받아서 점수가 90 이상이라면 A 인데, 98이상이라면 A+, 94미만이라면 A-
	   //점수를 입력받아서 점수가 80 이상이라면 B 인데, 88이상이라면 B+, 84미만이라면 B-
	   //점수가 80미만이면 C
	   Scanner sc= new Scanner(System.in);
	   System.out.println("점수입력 >> ");
	   int score = Integer.parseInt(sc.nextLine());
	   char grade = ' ', opt='0';
	   
	   if(score>=90) {
		   grade='A';
		   if (score>=98) {
			   opt='+';
		   }else if(score <94){
			   opt='-';
		   }
	   }else if(score>=80) {
		   grade='B';
		   if (score>=88) {
			   opt='+';
		   }else if(score <84){
			   opt='-';
		   }
	   }else {
		   grade='C';
	   }
	   System.out.printf("당신의 학점은 %c%c", grade,opt);

}
}