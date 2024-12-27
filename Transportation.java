public class Transportation {

    public static String travel(int distance) {
        return distance < 1000 ? "train" : "10";
        
    }

    public static void main(String[] args) {
        System.out.println(travel(500));
    }
    
}
