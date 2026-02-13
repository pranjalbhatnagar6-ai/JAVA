import java.util.Scanner;
public class TakingInput{
    public static void main(String[] args){
        // for integer
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the no."); //print - Ussi line me print karne ke liye
        // int num_1 = sc.nextInt(); //int dtype - for integer value.
        // System.out.println("no. is : " + num_1); //println - next line me print karne ke liye.
        
        // for String
        System.out.print("Enter your name : ");
        // String name = sc.next(); //next - only print the word before space.
        String name = sc.nextLine(); //next - only print the word before space.
        System.out.print("The name is.... "+ name);

    }
}