package MOOCpack0;

//method that increments the age of the person by a year.
public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name) {
        this.name = name;
        this.age = 0;// If the programmer does not define a constructor for a class, Java automatically creates a default one for it.
        this.weight = 0;
        this.height = 0;
    }

    public void printPerson() {
        System.out.println("name: " + this.name + "; age: " + this.age);
    }

    public void growOlder() {
        if (this.age < 5) this.age++;
    }

    public void decrement() {
        if (age > 0) this.age--;
    }

    public int returnAge() { //method that returns the person's age.
        return this.age;
    }

    public String getName() {
        return name;
    }

    public boolean isOfLegalAge() {
        if (this.age < 18) {
            return false;
        }
        return true;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double BMI() {
        double heigthPerHunderd = this.height / 100;
        return this.weight / (heigthPerHunderd * heigthPerHunderd);
    }
}