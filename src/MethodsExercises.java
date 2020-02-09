import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        getInteger(0,10);
//        factorial();
        rollDice();
    }
//        System.out.println(addition(3,5));
//        System.out.println(subtraction(3,5));
//        System.out.println(multiplication(3,5));
//        System.out.println(division(3,5));
//        System.out.println(modulus(3,5));
//
//        System.out.println(getInteger(7,22));
//    }

    public static double addition(int a, int b){
        return a+b;
    }
    public static double subtraction(int a, int b){
        return a-b;
    }
    public static double multiplication(int a, int b){
        return a*b;
    }
    public static double division(int a, int b){
        return a/b;
    }
    public static double modulus(int a, int b){
        return a%b;
    }

    public static int getInteger(int min, int max){
        int answer;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Enter a number between " +min+" and "+max+": ");
            answer = scan.nextInt();
        } while(answer<min||answer>max);
        return answer;
    }

    public static void factorial(){
    int base = getInteger(1,10);
    long fact = 1;
    for(int i=base; i>1; i--){
        fact *=i;
        System.out.println(fact+" times "+i+" equals "+fact*i+".");
    }
    System.out.println("The factorial of "+base+" is equal to "+fact+".");
    }

    public static int rollDice(){
        int answer;
        Scanner scan = new Scanner(System.in);
        System.out.println("You are rolling two dice. How many sides should they have?");
        answer = scan.nextInt();
        Random rand = new Random();
        System.out.println("Are you ready to roll the dice?");
        String continueRolling = scan.next();

        while(continueRolling.contains("y")) {
            int dice1 = rand.nextInt(answer) + 1;
            int dice2 = rand.nextInt(answer) + 1;
            int diceTotal = dice1 + dice2;
            System.out.println("Your two dice return the value " + dice1 + " and " + dice2 + ", for a total of " + diceTotal + ". Would you like to re-roll?");
//            String continueRolling = new String(String.valueOf(System.in));
            continueRolling = scan.next();
        }
        return 0;
    }

//    public static void factorial() {
//        int base = getInteger(1,10);
//        long fact = 1;
//        String output = "! = ";
//        System.out.printf("1%s\n");
//        for(int i=1;i<base;i++){
//            fact *=i;
//            System.out.printf(""+i+);
//        }
//    }
}
