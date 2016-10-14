//********************************************************************
//  PalindromeTester.java
//
//  Demonstrates the use of nested while loops.
//********************************************************************

import java.util.Scanner;
import java.io.*;

public class palindromeTester
{
   //-----------------------------------------------------------------
   //  Tests strings to see if they are palindromes.
   //-----------------------------------------------------------------
   public static void main (String[] args) throws IOException
   {
      String str;
      int left, right;
      File f = new File("palindrome.txt");
      Scanner scan = new Scanner (f);
      try{
      while (scan.hasNext()) 
      {
         str = scan.nextLine();
         System.out.println("The potential palindrome is " + str);

         left = 0;
         right = str.length() - 1;

         while (str.charAt(left) == str.charAt(right) && left < right)
         {
            left++;
            right--;
         }

         System.out.println();

         if (left < right)
            System.out.println ("That string is NOT a palindrome.");
         else
            System.out.println ("That string IS a palindrome.");

         System.out.println();
      }
      System.out.println("done");
      } finally { scan.close();  }
      }
}