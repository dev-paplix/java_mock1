public class Pieces {
    public static void main(String[] info) {
        int flair = 15;

        //Argument 1
        if (flair >= 15 && flair < 37) {
            System.out.println("Not enough");
        }
        
        //Argument 2

        if (flair == 37) {
            System.out.println("Just Right");
        } else {
            System.out.println("Too many");
        }
    }
}
