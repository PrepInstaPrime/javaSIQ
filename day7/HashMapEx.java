import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        // adding values 
        map.put("books",5);
        map.put("pen",10);
        System.out.println(map);
        System.out.println(map.get("books"));
        System.out.println(map.getOrDefault("pen",0));
        System.out.println(map.size());
        for(String key:map.keySet()){
            System.out.println(key+":"+map.get(key));
        }
    }
}
