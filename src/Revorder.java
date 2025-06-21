import java.util.*;
public class Revorder {
    public static void main(String[] args) {
        String str = "hello world mw";
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i = words.length-1;i>=0;i--){
            result.append(words[i]).append(" ");

        }
        System.out.println(result.toString().trim());
    }
}
