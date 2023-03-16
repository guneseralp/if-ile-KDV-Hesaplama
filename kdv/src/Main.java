import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        double kdv,kdvPrice,kdvAmount;

        System.out.print("Enter The Amount: ");
        double amount = input.nextDouble();
        if (amount<1000 && 0<amount){
            kdv=0.18;
            kdvPrice = amount * kdv;
            kdvAmount= kdvPrice + amount;
            System.out.println("Amount: "+ amount);
            System.out.println("KDV Price: "+ kdvPrice);
            System.out.println("Amount With KDV Price: " + kdvAmount);
        } else if (amount>=1000) {
            kdv=0.8;
            kdvPrice = amount * kdv;
            kdvAmount= kdvPrice + amount;
            System.out.println("Amount: "+ amount);
            System.out.println("KDV Price: "+ kdvPrice);
            System.out.println("Amount With KDV Price: " + kdvAmount);
        }




    }
}