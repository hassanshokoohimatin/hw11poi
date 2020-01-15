package ir.sunsor.impls;

import ir.sunsor.interfaces.ConstructObject;
import ir.sunsor.objects.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConstructPerson implements ConstructObject<List<Person>> {
    public List<Person> construct() {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<Person>();
        System.out.println("People Information...");
        String command = "1";
        while(Integer.parseInt(command) != 0) {
            System.out.println("id : ");
            String id = scanner.next();
            System.out.println("first name : ");
            String firstName = scanner.next();
            System.out.println("last name : ");
            String lastName = scanner.next();
            System.out.println("phone number : ");
            String phoneNumber = scanner.next();
            Person person = new Person(id, firstName, lastName, phoneNumber);
            people.add(person);
            System.out.println("do you want to add some other?......\n1.yes\n2.no");
            command = scanner.next();
            if (command.equals("1") || command.equalsIgnoreCase("yes") )
                command = "1";
            else
                command = "0";
        }
        return people;
    }
}
