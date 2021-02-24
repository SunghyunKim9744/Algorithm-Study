package Day05.직사각형별찍기;

import java.util.Scanner;

public class Sh {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // (213.51ms, 49MB) - > (437.37ms, 53MB)
//        for(int i=0; i<b; i++) {
//        	for(int j=0; j<a; j++)
//        		System.out.print("*");
//        	System.out.println();
//        }
        
        // (208.63ms, 48.3MB) - > (267.41ms, 49.6MB)
        StringBuilder width = new StringBuilder();
        for(int i=0; i<a; i++)
        	width.append("*");
        
        for(int i=0; i<b; i++) 
        	System.out.println(width.toString());
        	
        
        	

	}

}
