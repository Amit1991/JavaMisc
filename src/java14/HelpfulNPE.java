package java14;

public class HelpfulNPE {

    public static void main(String[] args) {

        String name = null;

        /* This will produce exception along with
            Cannot invoke "String.toUpperCase()" because "name" is null
            as additional comment, making NPE detailed and more helpful.
         */
        System.out.println(name.toUpperCase());

        int[] arr = null;

        /* This will produce exception along with
            Cannot read the array length because "arr" is null
            as additional comment, making NPE detailed and more helpful.
         */
        System.err.println(arr.length);
    }
}
