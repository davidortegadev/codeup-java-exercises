import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addition(3,5));
        System.out.println(subtraction(3,5));
        System.out.println(multiplication(3,5));
        System.out.println(division(3,5));
        System.out.println(modulus(3,5));

        System.out.println(getInteger(7,22));
    }

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
