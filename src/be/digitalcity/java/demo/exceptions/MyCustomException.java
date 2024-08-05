package be.digitalcity.java.demo.exceptions;

public class MyCustomException extends RuntimeException{

    public MyCustomException() {
        super("Custom Exception");
    }

    public MyCustomException(String message) {
        super(message);
    }
}
