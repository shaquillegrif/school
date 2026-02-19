import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 0.50);
        map.put("orange", 0.70);
        map.put("pear", 0.60);
        map.put("grape", 0.80);
        map.put("banana", 0.90);
        map.put("pineapple", 1.00);

//        map.remove("apple");

        System.out.println(map);
        System.out.println(map.get("apple"));

        System.out.println(map.containsKey("orange"));

        if(map.containsKey("pear")) {
            System.out.println(map.get("pear"));
        }
        else{
            System.out.println("key not found");
        }

        System.out.println(map.containsValue(1.00));

        System.out.println(map.size());

        for(String key : map.keySet()){
            System.out.println(key + ": $" + map.get(key));
        }
    }
}
