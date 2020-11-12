package MoocOOP4;

public class MAin {
    public static void main(String[] args) {
        AmusementPark ap = new AmusementPark("balerina", 110);
        Person p1 = new Person("Matt", 40);
        Person p2 = new Person("Jasper", 60);
        System.out.println(ap);
        p1.setHigh(80);
        p2.setHigh(180);
        System.out.println(ap.provera(p1));
        System.out.println(ap.provera(p2));
        System.out.println(ap);

        if (ap.provera(p1)) System.out.println(p1.getName() + " may enter the ride");
        else System.out.println(p1.getName() + " may not enter the ride");

        p1.setWeigh(50);
        System.out.println(p1.getName() + " is weighted: " + p1.getWeigh());

        HealthStation hs = new HealthStation();
        hs.feed(p1);
        System.out.println(p1.getName() + " is now weighted: " + p1.getWeigh());

    }
}
