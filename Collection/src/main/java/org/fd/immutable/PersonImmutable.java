package Collection.src.main.java.org.fd.immutable;

import java.util.ArrayList;
import java.util.List;

public final class PersonImmutable {

    private final String name;
    private final List<String> degrees;

    public PersonImmutable(String name, List<String> degrees) {
        this.name = name;
        this.degrees = new ArrayList<>(degrees);
    }

    public String getName() {
        return name;
    }

    public List<String> getDegrees() {
        return new ArrayList<>(degrees);
    }

    @Override
    public String toString() {
        return "PersonImmutable{" +
                "name='" + name + '\'' +
                ", degrees=" + degrees +
                '}';
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("B.Tech");

        PersonImmutable p  = new PersonImmutable("Vikas", list);

        list.add("MBA");
        System.out.println(p.toString());
    }
}
