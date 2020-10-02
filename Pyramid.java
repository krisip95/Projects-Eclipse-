package edu.smg;

import java.util.Scanner;
 
public class Pyramid {
 
 public static void main(String[] args) {
 
  System.out.print("Enter the number of lines:");
  Scanner input = new Scanner(System.in);
   
  //get the total number of lines n.
  int n = input.nextInt();
   
  //Loop through the lines from 1 to n
  for (int i = 1; i <= n; i++) {
   // printing spaces, 2 at a time from j=1 to j= n-i 
   for (int j = 1; j <= (n - i); j++) {
    System.out.print("  ");
   }
    
   for (int j = i; j >= 1; j--) {
    System.out.print(j + " ");
   }
    
   for (int j = 2; j <= i; j++) {
    System.out.print(j + " ");
   }
   System.out.println();
 
  }
 
 }
 
}