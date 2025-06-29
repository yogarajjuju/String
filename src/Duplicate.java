import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
        String str = "programming";
        Set<Character> seen = new HashSet<>();
        Set<Character> duplicate = new HashSet<>();
        for( char ch : str.toCharArray()){
            if(!seen.add(ch)){
                duplicate.add(ch);
            }
        }
        System.out.println(duplicate);


    }
}
