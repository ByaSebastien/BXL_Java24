package be.digitalcity.java.demo.exceptions;

public class MyCustomException extends RuntimeException{

    public MyCustomException() {
        super("Default message custom Exception");
    }

    public MyCustomException(String message) {
        super(message);
    }
}
