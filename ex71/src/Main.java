import java.util.Date;
public class Main {
    public static void main(String[] args) {

        Customer c1 = new Customer("Kim Ngan", true, "Premium");
        Customer c2 = new Customer("Quynh Nhi", true, "Silver");
        System.out.println(c1.getToString());
        System.out.println(c2.getToString());

        Visit v1 = new Visit(c1, new Date());
        System.out.println(v1.getToString());

        v1.setProductExpense(4.5);
        v1.setServiceExpense(8.5);
        v1.setProductExpense(1.5);
        System.out.println(v1.getToString());
        System.out.println("Total expense made by " + v1.getCustomerName() + " = " + v1.getTotalExpense());

    }
}