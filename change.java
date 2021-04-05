import java.util.Scanner;
public class change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so tien");
        double vnd =23000;
        double usd;
        usd =sc.nextDouble();
        double quydoi = usd*23000;
        System.out.println("gia tien vnd"+quydoi);
    }
}
