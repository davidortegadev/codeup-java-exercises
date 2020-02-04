public class Person {
    private String name;

    public Person(String name){
//        this.name=name;
        this.setName(name);
    }

    public String getname(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.printf("Hello, my name is %s", this.name);
    }

    public static void main(String[] args){
        Person a = new Person("Elmo");
        a.sayHello();

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1 == person2);
    }

}
