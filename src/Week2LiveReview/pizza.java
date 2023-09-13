package Week2LiveReview;

public class pizza {
    public static void main(String[] args) {
        String type = "cheese";
        int slices = 10;
        int people = 2;

        String summary = "We ordered a " + type + " pizza with " + slices + " slices. " + people + " people ate " +(slices/people) + " slices each so there were " + (slices % people) + " slices left.";
        System.out.println(summary);




    }
}
