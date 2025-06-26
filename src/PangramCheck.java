import java.util.Locale;

public class PangramCheck {
    public static void main(String[] args) {
        String str = "the quick brown fox jumps over the lazy dog";
        System.out.println(isPangram(str));
    }

    static boolean isPangram(String str) {
        boolean[] letters = new boolean[26];
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
                    if(ch>='a'&& ch<='z'){
                        letters[ch - 'a'] = true;
                    }
        }
        for( boolean present:letters){
            if(!present){
                return false;
            }
        }
        return true;
    }
}
