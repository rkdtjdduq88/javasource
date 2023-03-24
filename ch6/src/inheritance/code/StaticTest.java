package inheritance.code;

public class StaticTest {
    static int width = 200; //멤버변수 앞
    static int height = 120; //멤버변수 앞
   
    static {
    	//static 초기화 블럭
    	try {
			Class.forName("");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    static int max(int a, int  b) { //메소드 앞
    	return a > b ? a: b;
    }
}
