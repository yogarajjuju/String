import java.util.*;
public class Vowels {
    public static void main(String[] args) {
        String ch ="hello";
        int count = 0;
        for(int i=0; i<ch.length();i++){
            char c=ch.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
                count++;
            }
        }
        System.out.println(count);

    }
}
