package MoocOOP4;

public class AmusementPark {
    private String name;
    private int minHigh;
    private int count;

    public AmusementPark(String name, int minHigh) {
        this.name = name;
        this.minHigh = minHigh;
        this.count=0;
    }

    public boolean provera(Person person){
        if (person.getHigh()<this.minHigh) return false;
        else {
            this.count++;
            return true;
        }

    }


    public int getMinHigh() {
        return minHigh;
    }

    public void setMinHigh(int minHigh) {
        this.minHigh = minHigh;
    }

    public String toString(){
        return this.name +" allows min high: "+this.minHigh + " , numb of visitors: "+this.count;
    }
}
