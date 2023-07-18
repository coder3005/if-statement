/* Simple if Statement...! */
import java.util.Scanner;
class Simple
{
    public static void main(String[] args) {

        int age;
        System.out.println("Enter Your Age..!");
        Scanner r=new Scanner(System.in);
        age=r.nextInt();
        if(age>=18)
        {
            System.out.println("Eligible for votes..!");
        }

        System.out.print("Thank You..!");
    }
}
