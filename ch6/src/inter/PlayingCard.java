package inter;

public interface PlayingCard {
    public static final int SPADE = 4;
    final int DIAMOND = 3; // public static final int DIAMOND = 3; 과 같이 생략가능
    static int HEART = 2;  // public static final int HEART = 2; 과 같이 생략가능
    int CLOVER = 1;        // public static final int CLOVER = 1;
    
    public abstract String getCardNumber(); //메소드 앞은 항상 public abstract(생략가능)
    String getCardKind(); // public abstract String getCardKind(); 과 같이 생략가능

    
}
