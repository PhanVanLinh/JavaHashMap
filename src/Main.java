import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Double> hashMap = new HashMap<>();

        hashMap.put("A", 1d);
        hashMap.put("B", 2d);
        hashMap.put("C", 3d);
        hashMap.put("D", 4d);
        hashMap.put("E", 5d);

        System.out.println(hashMap.get("C"));
        System.out.println("========");

        for (Map.Entry<String, Double> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();

            System.out.println(key +" -> "+value);
        }

        System.out.println("========");
        for (String key : hashMap.keySet()) {
            Double value = hashMap.get(key);

            System.out.println(key +" -> "+value);
        }
    }
}
