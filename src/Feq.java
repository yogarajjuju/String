import java.util.*;
public class Feq {
    public static void main(String[] args) {
        String str ="banana";
       freq(str);
    }
    static void freq(String str){
        int [] fer = new int[256];
        str=str.toLowerCase();
        for(int i =0; i<str.length();i++){
            fer[str.charAt(i)]++;
        }
        for(int i = 0; i<fer.length;i++){
            if(fer[i]>0){
                System.out.println((char)i+ ": " + fer[i]);
            }

        }





    }
}
