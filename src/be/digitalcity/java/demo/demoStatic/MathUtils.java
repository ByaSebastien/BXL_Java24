package be.digitalcity.java.demo.demoStatic;

public class MathUtils {

    public static class SubClass {

        public static void addition(int a, int b) {
            int c = a + b;
            System.out.println(c);
        }

        public static void subtraction(int a, int b) {
            int c = a - b;
            System.out.println(c);
        }

        public static void multiplication(int a, int b) {
            int c = a * b;
            System.out.println(c);
        }

        public static void division(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("Division by zero");
            }
            int c = a / b;
            System.out.println(c);
        }
    }

    public class Test{

    }
}
