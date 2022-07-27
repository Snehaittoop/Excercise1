import java.util.Scanner;

public class Palidrome {


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter num" );
        int num= input.nextInt();
        int rev=0,dig;
        int temp=num;

        while(num!=0){
            dig=num%10;
            rev=rev*10+dig;
            num /=10;

        }
        if(temp==rev){
            System.out.println("palidrome");
        }
        else {
            System.out.println("not palidrome");
        }
    }
}
