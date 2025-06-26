import java.util.Arrays;

public class Word_Count {
    public static void main(String[] args) {
        String str = "Hello world this is Java";
        String [] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);


    }
}
