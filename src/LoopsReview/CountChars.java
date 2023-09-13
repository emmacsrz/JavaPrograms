package LoopsReview;

public class CountChars {
    public static void main(String[] args) {
        //count characters in a string:
String str = "aabbbcbcbdd";
String result = "";

        for (int i = 0 ; i <str.length(); i++){
            if (result.contains(""+str.charAt(i))){
                continue;
            }
            int count = 0;
            for (int j = 0; j <str.length(); j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            result+=""+count + str.charAt(i);

        }//outer loop end
        System.out.println(result);

        System.out.println(countLetters("aabbbccddkkdk"));
    }



    //turn it into a method:
    public static String countLetters(String str1){
        String result ="";
        for(int i = 0; i<str1.length(); i++){
            if (result.contains(""+str1.charAt(i))){
                continue;
            }
            int count =0;
            for (int j = 0; j<str1.length(); j++){
                if (str1.charAt(i)== str1.charAt(j)){
                    count++;
                }
            }
            result += ""+count+ str1.charAt(i);
        }
        return result;
    }
}
