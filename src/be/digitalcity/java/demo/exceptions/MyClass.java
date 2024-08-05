package be.digitalcity.java.demo.exceptions;

public class MyClass {

    public int division(int a, int b) {
        if(b == 0){
            throw new ArithmeticException("Division by zero");
        }
        return a/b;
    }

    public void sayHello(String name) {
        if(name.equals("Roger")){
            throw new MyCustomException("On veut pas de roger");
        }
        System.out.println("Bonjour " + name);
    }
}
