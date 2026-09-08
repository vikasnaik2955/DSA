package Collection.src.main.java.org.fd.java8;

public class UPIPayment implements Payment{

    public static void main(String[] args) {
        Payment p = ()-> System.out.println("UPI Done");
        p.pay();
    }

    @Override
    public void pay() {
        System.out.println("UPI payment");
    }
}
