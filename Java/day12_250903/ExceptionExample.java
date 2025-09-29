package Java.day12_250903;

public class ExceptionExample extends Exception{
    public ExceptionExample(){
        super("점수는 0 ~ 100 사이의 값이어야 합니다.");
    }

    public ExceptionExample(String message){
        super(message);
    }
}
