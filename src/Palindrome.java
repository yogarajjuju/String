import java.util.*;
class Palindrome{
    public static void main(String[] args) {
        String ch = "abac";
        System.out.println(ispalin(ch));



    }
    static Boolean ispalin(String ch){
        int start = 0;
        int end = ch.length()-1;
        while(start<end){
            if(ch.charAt(start)!=ch.charAt(end)){
                return  false;

            } else{
                start++;
                end--;
            }
        }
        return true;
    }
}