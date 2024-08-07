package be.digitalcity.java.demo.demoAnnotation;

@CoolClass(value = "André")
public class Bird {

    private int id;
    private String name;

    @CoolClass
    public Bird() {
    }

    @Override
    public String toString() {
        return "Bird{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
