package LoopsReview;

public class RemoveDuplicatesReverse {
    public static void main(String[] args) {
        //remove duplicates AND reverse the string:

        String str = "aaabbbcccdddeeffjfjkk";
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);

            if (result.contains("" + ch)) {
                continue;
            }
            result += ch;

        }
        System.out.println(result);
    }
}
