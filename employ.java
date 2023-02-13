import java.sql.SQLOutput;
import java.util.Scanner;

public class employ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the basic pay");
        double basicPay=sc.nextInt();
      double HRA =0;
       double DA=0;
        if(basicPay>5000){
             HRA+=(0.1)*(basicPay);
           DA+=(0.2)*(basicPay);
            System.out.println("HRA : " + HRA + " " + "DA : " +DA);

        }
        else if(basicPay<5000) {
          HRA += (0.2) * (basicPay);
            DA += (0.3) * (basicPay);
            System.out.println("HRA : " + HRA + " " + "DA : " +DA);
        }
        System.out.println(" Basic pay :" + basicPay + " " + "HRA : "  + HRA + " " + "DA : " + DA + " ");
        }
    }

