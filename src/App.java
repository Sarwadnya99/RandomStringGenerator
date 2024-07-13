package src;

public class App {
    public static void main(String[] args) {
        StringGenerator stringGenerator = new StringGenerator();
        System.out.println(stringGenerator.getRandomString(40));
    }
}
