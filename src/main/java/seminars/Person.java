package seminars;

import java.io.*;
import java.util.Objects;

public class Person implements Serializable {

    String firstName;
    String lastName;

    int age;

    public Person (String firstName,String lastName,int age){
        this.age=age;
        this.firstName=firstName;
        this.lastName=lastName;

    }

    public void serializeInfo(){
        try(FileOutputStream fileOut = new FileOutputStream("C:\\Users\\user\\IdeaProjects\\Spring\\sem1\\save.json");
            ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            out.writeObject(this);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deserializeInfo(){
        try(FileInputStream fileIn = new FileInputStream("C:\\Users\\user\\IdeaProjects\\Spring\\sem1\\save.json");
            ObjectInputStream in = new ObjectInputStream(fileIn)) {

            Person person = (Person) in.readObject();
            System.out.println(person.toString());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age && Objects.equals(firstName, person.firstName)
                && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
