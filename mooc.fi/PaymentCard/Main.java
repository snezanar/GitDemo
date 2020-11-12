package MoocOOP5;

public class Main {
    public static void main(String[] args) {
        PaymentCard pc=new PaymentCard(100);
        System.out.println(pc.getValue());
        pc.addingMoney(100);
        System.out.println(pc.getValue());
        pc.takeMoney(200);
        System.out.println(pc.getValue());
    }
}
