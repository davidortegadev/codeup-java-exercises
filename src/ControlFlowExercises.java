public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while(i<=15){
//            System.out.println(i);
//            i++;
//        }

//        int j = 100;
//        do{
//            System.out.println(j);
//            j-=5;
//        } while(j >= -10);

//        long k = 2;
//        do{
//            System.out.println(k);
//            k*=k;
//        } while(k<=1000000);

        for(int l = 0; l<=100; l++) {
            if(l%15==0){
                System.out.println("FizzBuzz! " + l);
            } else if (l%5==0){
                System.out.println("Buzz! "+ l);
            } else if (l%3==0){
                System.out.println("Fizz! "+ l);
            } else {
                System.out.println(l);
            }
        }

    }
}