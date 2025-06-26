import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silemt";
        System.out.println(isAnagram(str1,str2));

    }
    static boolean isAnagram(String str1, String str2){
        if(str1.length()!= str2.length()) return false;
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
      return  Arrays.equals(s1,s2);

    }
}
