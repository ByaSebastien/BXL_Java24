package be.digitalcity.java.demo.exceptions;

public class DemoException {

    public static void main(String[] args) {

        MyClass myClass = new MyClass();
        try{
            System.out.println(myClass.division(5,0));
            myClass.sayHello("Toto");
            System.out.println("Succeed");
        }catch (ArithmeticException e) {
            System.out.println("Failed " + e.getMessage());
        }catch (Exception e){
            System.out.println("Failed");
        }
        System.out.println("Finished");
    }
}
