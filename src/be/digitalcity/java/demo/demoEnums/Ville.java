package be.digitalcity.java.demo.demoEnums;

public enum Ville {
    LIEGE("4000") ,
    BRUXELLES("1000") ,
    LLN("1250");

    public final String codePostal;

    Ville(String cp){
        this.codePostal = cp;
    }

    public void show(){
        System.out.println(this.toString() + " : " + this.codePostal);
    }
}

