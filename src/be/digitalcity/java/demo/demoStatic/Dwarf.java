package be.digitalcity.java.demo.demoStatic;

public class Dwarf {
    private static int currentId = 1;
    private int id;
    private String name;

    public Dwarf(String name) {
        this.id = currentId++;
        this.name = name;
    }

    public static void talk(){
//        System.out.println(this.name + " : Hey ho");
    }

    @Override
    public String toString() {
        return "Dwarf{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
