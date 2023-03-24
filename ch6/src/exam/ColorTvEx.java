package exam;
// ColorTv 는 Tv 를 상속받아서 작성

//IpTv 는 ColorTv 상속받아서 작성
public class ColorTvEx {
	public static void main(String[] args) {
		ColorTv myTv = new ColorTv(32, 1024);
		myTv.printProperty();
		
		//실행결과
		//32인치, 1024컬러
		
		IpTv ipTv = new IpTv(32,2048,"192.1.1.2");
		ipTv.printProperty(); // 나의 IpTv는 32인치, 2048컬러, 주소는 192.1.1.2 입니다
		
        
	}

}
