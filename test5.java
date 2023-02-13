import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter speed : ");
        int speed=sc.nextInt();
        System.out.println("Today is birthday :");
        boolean isbirthday=sc.nextBoolean();
        if(isbirthday==true){
            speed-=5;

        }
        if(speed>80){
            System.out.println("High Ticket");
        }else if(speed>=60){
            System.out.println("Mid Ticket");
        }else{
            System.out.println("No Ticket");
        }
    }
}
