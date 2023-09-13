package LoopsReview;

public class CountLettersPractice {
    public static void main(String[] args) {
String str = "emmaemmaemma";
String result ="";

        for (int i = 0; i <str.length(); i++) {
            int frequency=0;
            if (result.contains(""+str.charAt(i))) {
                continue;
            }
            result+=str.charAt(i);
            for (int j = 0; j <str.length(); j++){
                if (str.charAt(i) == str.charAt(j)) {
                    frequency++;
                }
            }
            result += frequency;
        }


        System.out.println(result);


        }
    }

