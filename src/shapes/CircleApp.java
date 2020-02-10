package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] arg){
        Input input = new Input();
        do{
            double radius = input.getDouble("Enter a radius as a double: ");
            Circle circle = new Circle(radius);
            System.out.println("The area of your circle is: "+circle.getArea());
            System.out.println("The circumference of your circle is: "+circle.getCircumference());
        } while(input.yesNo("Create another circle?"));

    }
}
