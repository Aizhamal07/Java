import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTask {

    public static void main(String[] args) {

        String str = "kkkubaaa";

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }else {
                map.put(str.charAt(i), 1);
            }
        }
        System.out.println(map);


    }
}
