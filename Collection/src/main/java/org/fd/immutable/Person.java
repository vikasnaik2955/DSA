package Collection.src.main.java.org.fd.immutable;

import java.util.ArrayList;
import java.util.List;

public class Person {



        private String name;
        private List<String> degrees;

    public Person(String name, List<String> degrees) {
        this.name = name;
        this.degrees = degrees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getDegrees() {
        return degrees;
    }

    public void setDegrees(List<String> degrees) {
        this.degrees = degrees;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", degrees=" + degrees +
                '}';
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("B.Tech");

        Person p  = new Person("Vikas", list);

        list.add("MBA");
        System.out.println(p.toString());
    }

    // Constructor

        // Getters

        // Setters

}
