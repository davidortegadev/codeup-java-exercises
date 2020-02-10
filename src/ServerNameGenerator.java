import java.util.Random;

public class ServerNameGenerator {
    public static String[] adjectives = {"bouncy", "fabulous", "evergreen","ambitious","generous","loyal","present","sad","thankful","violent"};
    public static String[] nouns = {"story","child","people","health","system","art","physics","strategy","newspaper","steak"};

    public static void main(String[] args) {
        System.out.println("Here is your server name:");
        System.out.println(returnRandom(adjectives) + "-" + returnRandom(nouns));
    }

    public static String returnRandom(String[] inputArr) {
        Random random = new Random();
        return inputArr[random.nextInt(inputArr.length - 1)];
    }

}