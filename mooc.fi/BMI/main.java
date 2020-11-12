package MOOCpack0;

public class main {
    public static void main(String[] args) {
        Person per1 = new Person("Ada");
        Person per2 = new Person("Mia");
        per1.printPerson();
        per2.printPerson();
        System.out.println("");

        per1.growOlder(); //1
        per1.growOlder();
        per1.growOlder();
        per1.growOlder();
        per1.growOlder();
        per1.growOlder(); //6 ==>>5
        per2.growOlder();

        per1.printPerson();
        per2.printPerson();
        System.out.println("");

        per1.decrement(); //4
        per1.decrement(); //3
        per2.decrement();//0
        per2.decrement();//0
        per1.printPerson(); //void method
        per2.printPerson();
        System.out.println("Ada is " + per1.returnAge()); // int-return method
        System.out.println("Mia is " + per2.returnAge());
        int sum = per1.returnAge() + per2.returnAge();
        System.out.println("sum: " + sum);
        System.out.println(" ");

        if (per1.isOfLegalAge()) {            //PRINT PERDON (VOID)
            System.out.println("legal age! ");
            per1.printPerson();
        } else {                             // OR GET METHOD (int):
            System.out.println("underage! " + per1.getName());

        }
        System.out.println(" ");
        per1.setHeight(180);
        per1.setWeight(86);
        System.out.println(per1.getName()+" bmi is "+per1.BMI());
    }
}
