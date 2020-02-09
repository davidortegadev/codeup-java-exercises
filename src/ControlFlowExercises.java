import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }
//
//        int j = 100;
//        do {
//            System.out.println(j);
//            j -= 5;
//        } while (j >= -10);
//
//        long k = 2;
//        do {
//            System.out.println(k);
//            k *= k;
//        } while (k <= 1000000);
//
//        for (int l = 0; l <= 100; l++) {
//            if (l % 15 == 0) {
//                System.out.println("FizzBuzz! " + l);
//            } else if (l % 5 == 0) {
//                System.out.println("Buzz! " + l);
//            } else if (l % 3 == 0) {
//                System.out.println("Fizz! " + l);
//            } else {
//                System.out.println(l);
//            }
//        }
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a number: ");
//        int num = scanner.nextInt();
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//        for (int m = 1; m <= num; m++) {
//            System.out.printf("%-6d | %-7d | %d\n", m, (int) Math.pow(m, 2), (int) Math.pow(m, 3));
//        }

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter a grade between 0 to 100.");
        int grade = scanner1.nextInt();
        if (grade>=90){System.out.println("A");}
        else if (grade>=80){System.out.println("B");}
        else if (grade>=70){System.out.println("C");}
        else if (grade>=60){System.out.println("D");}
        else {System.out.println("F");}

    }
}