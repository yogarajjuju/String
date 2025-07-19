import java.util.*;
public class Feq {
    public static void main(String[] args) {

        HashMap<Character,Integer>map = new HashMap<>();
        String str ="coding";
        for (char ch :str.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
    }
}
