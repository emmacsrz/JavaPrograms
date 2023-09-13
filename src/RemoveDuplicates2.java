import java.util.Scanner;
public class RemoveDuplicates2 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = "aabbccdddee";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch=str.charAt(i);

            if(result.contains(""+ ch)){
                continue;
            }
            result+= ch;

        }
        System.out.println(result);



    }
}
