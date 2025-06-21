import java.util.*;

public class ReverseWord {
    public static void main(String[] args) {
        String str = "hello world";
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for(String word:words){
                StringBuilder sb= new StringBuilder(word);
                result.append(sb.reverse().append(" "));

        }
        System.out.println(result.toString().trim());
    }
}

