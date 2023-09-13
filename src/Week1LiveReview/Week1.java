package Week1LiveReview;

public class Week1 {
    public static void main(String[] args){

        System.out.println("Over the weekend, this is my plan " +
                "\n hello this is a new line" +
                "\n I am goin to practice java");
        System.out.println("I am going to cook");
        //TODO: Practice more printing
        //to access TODO comments, go to view -> tool windows -> ToDO.
        //todo put together as one word will change comment color, and organize them into reminder.

        //escape sequences:
        System.out.println("I don't like \"Java\" \n just kidding. I like java. " +
                "\n I am just practicing my \t \"escape sequences\"");

        //the following is ane example of how java is NOT spcae sensitive:
        System.out.println();
        System.
                out.  /*java is not space senstive.
                it does not care what line the code is broken into,
                as long as it is in the right order */
                println("1234")
        ;
        //semi colon closes the statement
        //it is better to have codes together though, formatted correctly. less confusing
        System.out.println();
        System.err.println("Shopping list:" +
                "\n\t-Milk" +
                "\n\t-Eggs" +
                "\n\t-Butter" +
                "\n\t-brownie mix");

    } //whenever you click near a bracket, it will highlight both corresponding brackets
}
