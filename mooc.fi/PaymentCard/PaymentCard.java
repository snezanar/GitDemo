package MoocOOP5;

public class PaymentCard {
    private double value;

    public PaymentCard(int value) {
        this.value = value;
    }

    public void addingMoney(double amount){
        this.value=this.value+amount;
    }
    public boolean takeMoney(double amount){
        if(this.value>=amount){
            this.value=this.value-amount;
            System.out.println("novi saldo je: ");
            return true;
        }else{
            System.out.println("nema dovoljno novca na racunu");
            return false;
        }
    }

    public double getValue() {
        return value;
    }
}
