public class main{
    public static void main(String[] args){
        /*Classroom of 500 students - You have to store marks of these 500 students You have 2 options:
        1. Create 500 variables 
        2. Use Array(recommended)*/
        // There are 3 main ways to create an array in java
        // 1. Declaration and then memory allocation
        // int[] marks = new int[5];
        // 2. Declaration and memory allocation
        // int [] marks;
        // marks = new int[5];
        //intialization
        // marks[0] = 100;
        // marks[1] = 60;
        // marks[2] = 70;
        // marks[3] = 90;
        // marks[4] = 86;
        // 3. Declaration, memory allocation and initialization together
        int [] marks = {98,45,79,99,80};
        // marks[5] = 90; //give error due no space allot in memory
        System.out.println(marks[0]);
    }
}