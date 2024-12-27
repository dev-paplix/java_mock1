

public class Rematerialize {
    public static void main(String[] args) {
        int dog = 11;
        int cat = 3;
        int partA = dog / cat;
        System.out.println(partA);
        int partB = dog % cat;
        System.out.println(partB);
        int newDog = partB + partA * cat;
        System.out.println(newDog);
    }
}
