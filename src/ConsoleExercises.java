import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f%n.", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();

        System.out.println("You entered integer: --> \"" + userInput + "\" <--");

        System.out.print("Enter 3 words: ");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();

        System.out.println("You entered these words: --> \"" + firstWord + " " + secondWord + " " + thirdWord + "\" <--");

        System.out.print("Enter a sentence: ");
        String userSentence = scanner.nextLine();

        System.out.println("You entered the sentence: --> \""+ userSentence+"\" <--");

//        Scanner scan = new Scanner(System.in);
//        scanner.useDelimiter("\n");
//        System.out.print("\nEnter the width: ");
//        String sWidth = scan.nextLine();
//        double width = Double.parseDouble(sWidth);
//        System.out.print("Enter the length: ");
//        String sLength = scan.nextLine();
//        double length = Double.parseDouble(sLength);
//        System.out.printf("The dimensions are %f by %f. The perimeter is %f and the area is %f.\n",
//                length, width, 2*(length*width), length*width);

        scanner.useDelimiter("\n");
        System.out.print("\nHey! Yo, enter the width: ");
        double width = scanner.nextFloat();
        System.out.print("Enter the length: ");
        double length = scanner.nextFloat();
        System.out.printf("The dimensions are %f by %f. The perimeter is %f and the area is %f.\n",
                length, width, 2*(length+width), length*width);
    }
}
