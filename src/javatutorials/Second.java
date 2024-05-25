package javatutorials;

import java.util.Arrays;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int c[]={1,32,42,43,4};
		        int d[]=c;
		        
		        System.out.println(c);
		        System.out.println(Arrays.toString(c));
		        d[1]=4332;
		        System.out.println(Arrays.toString(c));
		        int a = 10;
		        int b = 10;

		        // Using unary operators
		        System.out.println("Postincrement : " + ((a++))); 
	
		        System.out.println("Preincrement : " + (++a));
		        System.out.println("Preincrement : " + (++a));
		        System.out.println("Preincrement : " + (++a));

		        System.out.println("Postdecrement : " + (b--));
		        System.out.println("Predecrement : " + (--b));
		        System.out.println("Predecrement : " + (--b));
		        System.out.println("Predecrement : " + (--b));
		        System.out.println("Predecrement : " + (--b));
		        
		    }

	}


