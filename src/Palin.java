import java.util.*;
public class Palin {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(ispalin(str));
    }
    static boolean ispalin(String str){
        int start=0;
        int end = str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;


            } else{
                start++;
                end--;
            }

        }
        return true;
    }
}

