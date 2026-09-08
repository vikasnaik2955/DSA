package Collection.src.main.java.org.fd.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStudentByName {

    private int id;
    private String firstName;
    private int age;

    public SortStudentByName(int id, String firstName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "SortStudentByName{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {

        List<SortStudentByName> students = Arrays.asList(
                new SortStudentByName(1, "Rahul", 21),
                new SortStudentByName(2, "Amit", 22),
                new SortStudentByName(3, "Vikas", 26),
                new SortStudentByName(4, "Ankit", 23),
                new SortStudentByName(4, "Ankit", 22)
        );

        //students.sort((s1, s2) -> s1.getFirstName().compareTo(s2.getFirstName()));
        students.sort(Comparator.comparing(SortStudentByName::getFirstName).thenComparing(SortStudentByName::getAge));
        students.forEach(System.out::println);
    }
}
