package MOOCpack1;

public class Main {
    public static void main(String[] args) {
        Whistle duckWhistle= new Whistle("kva kvaa");
        Whistle roosterWhistle= new Whistle("peeef");
        duckWhistle.printSound();
        roosterWhistle.printSound();
        duckWhistle.printSound();
    }
}
