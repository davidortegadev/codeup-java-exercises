public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        int myFavoriteNumber = 4;
        System.out.println(myFavoriteNumber);
        String myString = "c";
        System.out.println(myString);
        float myNumber = 132;
        System.out.println(myNumber);

        String theNumberThree = "three";
        Object o = theNumberThree;
        int three = (int) o;

//        int x = 4;
//        x+=5;

//        int x = 3;
//        int y = 4;
//        y *= x;

        int x = 10;
        int y = 2;

        x /=y;
        y-=x;

    }
}