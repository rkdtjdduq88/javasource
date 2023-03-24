package ch6;

public class Square {
    //정사각형 넓이 구하기
	//속성 - 한 변
	//가로,세로
	int sidelength;
	

	public Square(int sidelength) {
		super();
		this.sidelength = sidelength;
	}


	//기능
	//넓이 구하기
	int getArea() {
		return sidelength * sidelength;
	}
}
