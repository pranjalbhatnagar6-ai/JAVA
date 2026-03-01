import java.util.Scanner;

public class If_else{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. :");
        int num = sc.nextInt();
        String ans;
        ans = (num % 2 == 0) ? "even" :"odd";
        System.out.println(ans);
    }
}