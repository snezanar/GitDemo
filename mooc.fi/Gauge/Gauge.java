package MOOCpack8;

public class Gauge {
    private int value;

    public Gauge() { //constructor without parameters !!!
        this.value =0; // (sets the initial value of the meter variable to 0)
    }
    public void increase(){
        value++;
    }
    public void decrease(){
        value--;
    }
    public int varValue(){
    return value;
    }
    public boolean full(){
        if(value==5) {
            System.out.println("now is full!");
            return true;
        }
        return false;
    }

}
