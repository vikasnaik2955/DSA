package Collection.src.main.java.org.fd.java8;

public class AbstractChildClass extends AbstractClass{

    @Override
    public void pay(){
        super.pay();
        balance = 100;
        System.out.println("Child Class");

        System.out.println(balance);    


    }

    public static void main(String[] args) {
        AbstractClass ab = new AbstractChildClass();
        ab.pay();
    }
}
