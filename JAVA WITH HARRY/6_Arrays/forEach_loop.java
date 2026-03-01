public class forEach_loop{
    public static void main(String[] args){
        int[] marks = {90,48,58,29,43,50};
        // System.out.println(marks[0]);
        //Displaying the array using(for loop)
        // for(int i=0;i<marks.length;i++){
        //     System.out.println(marks[i]);
        // }

        //in reverse
        for(int i=marks.length -1;i>=0;i--){
            System.out.println(marks[i]);
        }
        //forEach Loop
        System.out.println("print using for each loop");
        for(int element: marks){
            System.out.println(element);
        }
    }

}