public class Main {
    public static void main(String[] args) {

        String name = "umbakai li";

        int lenght  = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf(" ");
        int lastIndex = name.lastIndexOf("i");

        //name = name.toUpperCase();
        //name = name.trim();
        //name = name.replace("i", "k");


        System.out.println(lenght);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name);

        if (name.isEmpty()){
            System.out.println("Name is empty");
        }
        else {
            System.out.println("Name is "+name);
        }
        if (name.contains(" ")){
            System.out.println("Name contains spaces");
        }
        else {
            System.out.println("your name does not contain spaces");
        }
        if(name.equalsIgnoreCase("password")){
            System.out.println("your name cant be password");
        }
        else {
            System.out.println("Hello "+name);
        }
    }
}
