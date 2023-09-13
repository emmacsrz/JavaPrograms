package LoopsReview;

public class CountingCharacters2 {
    public static void main(String[] args) {


        String str = "aabbccddeeff";
        String result = "";//empty result variable


        for (int i = 0; i < str.length(); i++) {
            int count =0; //outer loop,
            if(result.contains(""+str.charAt(i))){ //removes duplicates
                continue;
            }
            result += str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)){
                    count++;
                }

            }
            result += count;

        }
        System.out.println(result);





    }
}
