import java.util.Scanner;
public class input{
    public static void main(String[] args){
        System.out.println("Taking input from user");
        Scanner sc = new Scanner(System.in); //input lene ke liye Scanner object
        // System.out.print("Enter num 1 : ");
        // int a = sc.nextInt();
        // System.out.print("Enter num 2 : ");
        // int b = sc.nextInt();
        // int sum = a + b;
        // System.out.println("sum : "+sum);

        String str = sc.next();
        System.out.println(str);
        
    }
}