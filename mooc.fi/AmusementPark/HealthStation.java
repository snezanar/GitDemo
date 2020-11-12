package MoocOOP4;

public class HealthStation {

    private Object weigh;

    public void feed(Person person){
        this.weigh = person.getWeigh() +5;
    }
}
