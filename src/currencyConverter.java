
import java.util.Scanner;
import java.util.*;
import java.text.DecimalFormat;
public class currencyConverter {

    public static void main(String[] args) {
        double rupee, dollor, pound, code, euro, KWD;
        DecimalFormat f = new DecimalFormat("##.###");
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Pushit Currency converter Project");
        System.out.println("Enter Your Currency code");
        System.out.println("1. Rupee \n2. Dollor \n3. Pound \n4. Euro \n5. KWD");
        code = sc.nextInt();

        // For Rupee Currency
        if (code == 1) {
            System.out.println("\n Enter amount in ruppee");
            rupee = sc.nextDouble();

            // For Dollor value
            dollor = rupee * 131.62;
            System.out.println("Dollor: " + dollor);

            // For Pound Value
            pound = rupee * 160.15;
            System.out.println("Pound: " + pound);

            //For Euro Value
            euro = rupee * 141.42;
            System.out.println("Euro: " + euro);

            //for KWD value
            KWD = rupee * 430.21;
            System.out.println("KWD: " + KWD);
        }

        // For Dollor Currency
        if (code == 2) {
            System.out.println("\n Enter amount in dollor");
            dollor = sc.nextDouble();

            // for rupee value
            rupee = dollor * 82.74;
            System.out.println("Rupee: " + rupee);

            // for pound value
            pound = dollor * 0.82;
            System.out.println("Pound: " + pound);

            // for Euro value
            euro = dollor * 0.93;
            System.out.println("Euro: " + euro);

            // for KWD value
            KWD = dollor * 0.31;
            System.out.println("KWD: " + KWD);
        }

        // for Pound Currency
        if(code == 3){
            System.out.println("\n Enter your amount in pound");
            pound = sc.nextDouble();

            // for rupee value
            rupee = pound* 100.69;
            System.out.println("Rupee: "+rupee);

            // for dollor value
            dollor = pound * 1.22;
            System.out.println("Dollor: "+dollor);

            // for Euro value
            euro = pound* 1.13;
            System.out.println("Euro: "+euro);

            // for KWD value
            KWD = pound * 0.37;
            System.out.println("KWD: "+KWD);
        }

        // For Euro Currency
        if (code == 4){
            System.out.println("\n Enter Your amount in Euro");
            euro = sc.nextDouble();

            // for rupee value
            rupee = euro * 88.93;
            System.out.println("Rupee: "+rupee);

            // for dollor value
            dollor = euro * 1.08;
            System.out.println("Dollor: "+dollor);

            // for pound value
            pound = euro * 0.88;
            System.out.println("Pound: "+pound);

            // for KWD value
            KWD = euro * 0.33;
            System.out.println("KWD: "+KWD);
        }

        // For KWD Currency
        if(code == 5){
            System.out.println(" \n Enter Your amount in  Kuwaiti Dinar (KWD)");
            KWD = sc.nextDouble();

            //for rupee value
            rupee = KWD* 270.50;
            System.out.println("Rupee: "+rupee);

            //for dollor value
            dollor = KWD* 3.27;
            System.out.println("Dollor: "+dollor);

            //for pound value
            pound = KWD * 2.68;
            System.out.println("Pound: "+pound);

            // for Euro value
            euro = KWD * 3.04;
            System.out.println("Euro: "+euro);
        }

        if(code < 1 || code >=6){
            System.out.println(" \n Please Enter the valid number");
        }


    }
}