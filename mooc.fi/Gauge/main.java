package MOOCpack8;

public class main {
    public static void main(String[] args) {
        Gauge g = new Gauge();

        while (!g.full()){
            System.out.println("not full!"+g.varValue());
            g.increase();
        }

    }

}
