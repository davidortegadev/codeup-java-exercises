public class Person {
    private String name;

    public String getName() {
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void sayHello(String name) {
        System.out.printf("Hello, my name is %s", name);
    }

    public static void main(String[] args) {
        sayHello("bob");

    }


}
