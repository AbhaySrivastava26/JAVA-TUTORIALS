package javatutorials;

import java.util.Scanner;

public class varialbles
{
    public static void main(String args[])
    {
         
    	
//    	Scanner sc =new Scanner(System.in);
//      	System.out.println("ENTER THE VALUE");
//    	String s=sc.next();
//    	System.out.println("ENTER THE CHARACTER"+s);
//    	System.out.println("ENTER THE VALUE");
//    	String b=sc.nextLine();
//    	System.out.println("ENTER THE CHARACTER"+b);
////    	
//    	Scanner obj = new Scanner(System.in);
//        String name;
//        int rollno;
//        float marks;
//
//        System.out.println("Enter your name");
//
//        // taking string input
//        name = obj.nextLine();
//        System.out.println("Enter your rollno");
//
//        // taking integer input
//        rollno = obj.nextInt();
//        System.out.println("Enter your marks");
//
//        // taking float input
//        marks = obj.nextFloat();
//      
//        // printing the output
//        System.out.println("Name=" + name);
//        System.out.println("Rollno=" + rollno);
//        System.out.println("Marks=" + marks);
    	
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter an integer & a String");
 
        // Using nextInt() to parse integer values
        int a = scn.nextInt();
 
        // Using nextLine() to parse string values
        String b = scn.nextLine();
 
        // Display name and age entered above
        System.out.printf(a+""+b);
    }
}
