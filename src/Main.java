import person.Dancer;
import person.Person;
import person.Programmer;
import person.Singer;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.walk();

        Person []person1 = {
            new Programmer(),
                new Dancer(),
                new Singer()
        };
        for (Person person2 : person1){
            person2.walk();
        }

    }
}