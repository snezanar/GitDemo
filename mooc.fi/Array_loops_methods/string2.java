package MOOC_String;

public class s2 {
    public static void main(String[] args) {
        //split-method of the String class.The split method returns an array of the resulting sub-parts.
        //In the example below, the string has been split around a space.
        String text = "first second third fourth";
        String[] pieces = text.split(" ");
        System.out.println(pieces[0]);
        System.out.println(pieces[1]);
        System.out.println(pieces[2]);
        System.out.println(pieces[3]);

        System.out.println();

        for (int i = 0; i < pieces.length; i++) System.out.println(pieces[i]);
    }
}

