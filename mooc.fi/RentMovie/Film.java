package MOOCpack7;

public class Film {
    private String name;
    private int age;

    public Film(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String filmName(){
        return name;
    }
    public int filmRating(){
        return age;
    }

}
