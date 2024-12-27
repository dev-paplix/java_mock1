public class Tolls {
    private static int yesterday = 1;
    int tomorrow = 10;
    public static void main(String[] args) {
        Tolls tolls = new Tolls();
        int today = 20, tomorrow = 40;
        // The following line will vompilr with the amount of tomorrow outsite and the output is 31
        System.out.println(today + tolls.tomorrow + tolls.yesterday);
        // The following line will vompilr with the amount of tomorrow inside and the output is 61
        System.out.println(today + tomorrow + tolls.yesterday);
    }
}
