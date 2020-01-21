package part4;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        final String FILE = "save.dat";
        Person person = new Person();
        person.setName("Ivan");
        person.setSurname("Petrov");
        person.setPatronymic("Sergeyevich");
        person.setBirthDate("27.08.1999");
        person.setAddress(new Address("Kyiv", "Kreshatic"));
        person.setAge(20);

        ObjectOutputStream stream = new ObjectOutputStream(
                new FileOutputStream(FILE));

        stream.writeObject(person);
        System.out.println("I have written:");
        System.out.println(person.toString());
        stream.close();

        ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream(FILE));

        Person savedPerson = (Person) inputStream.readObject();
        System.out.println("I have read:");
        System.out.println(savedPerson.toString());
    }
}
