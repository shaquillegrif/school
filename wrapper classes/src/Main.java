public class Main {
    public static void main(String[] args) {


        // Autoboxing
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;


        // Unboxing

        int x = a;
        double y = b;
        char w = c;
        boolean z = d;

        String a1 = Integer.toString(123);
        String a2 = Double.toString(3.14);
        String a3 = Character.toString('@');
        String a4 = Boolean.toString(false);


        String xn = a1 + a2 + a3 + a4;
        System.out.println(xn);

    }
}
