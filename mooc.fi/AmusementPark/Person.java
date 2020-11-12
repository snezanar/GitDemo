package MoocOOP4;

public class Person {
    private int high;
    private int weigh;
    private String name;

    public Person(String name,int weigh) {
        this.name = name;
        this.weigh=weigh;
   }

    public int getHigh() {
        return high;
    }

    public String getName() {
        return name;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }

    public int getWeigh() {
        return weigh;
    }

    public void setHigh(int high) {
        this.high = high;
    }
}
