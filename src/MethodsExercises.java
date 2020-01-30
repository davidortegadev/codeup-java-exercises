public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addition(3,5));
        System.out.println(subtraction(3,5));
        System.out.println(multiplication(3,5));
        System.out.println(division(3,5));
        System.out.println(modulus(3,5));
    }

    public static Integer addition(int a, int b){
        return a+b;
    }
    public static Integer subtraction(int a, int b){
        return a-b;
    }
    public static Integer multiplication(int a, int b){
        return a*b;
    }
    public static Integer division(int a, int b){
        return a/b;
    }
    public static Integer modulus(int a, int b){
        return a%b;
    }
}
