import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
        Person[] people = {
                new Person("Dave"),
                new Person("Bob"),
                new Person("Bill")
        };
        personArray(people);
        Person[] newPeople = addPerson(people, new Person("Will"));
        personArray(newPeople);
    }
    public static void personArray(Person[] people){
        for(int i=0;i<people.length;i++){
            System.out.println(people[i].getName());
        }
    }

    public static Person[] addPerson (Person[] people, Person inputPerson){
        Person[] returnPeople = Arrays.copyOf(people, people.length+1);
        returnPeople[people.length]=inputPerson;
        return returnPeople;
    }
}
