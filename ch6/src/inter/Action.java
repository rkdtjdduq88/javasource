package inter;

public interface Action {
    void work();
}
//Action action = new Action(); 불가능
//구현 클래스를 만들어야 함 ==> 익명 클래스 사용
//Action2 클래스를 또 만들어 구현할 필요없이 한번만 필요할 경우에 씀