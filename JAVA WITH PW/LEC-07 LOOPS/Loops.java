import java.util.Scanner;

public class Loops{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = 0;

        while (num <= n){
            System.out.println(num);
            num++;
        }
    }
}