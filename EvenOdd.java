//********************************************************************
//  EvenOdd.java
//
//  Demonstrates the use of the JOptionPane class.
//********************************************************************

import javax.swing.JOptionPane;

public class EvenOdd
{
   //-----------------------------------------------------------------
   //  Determines if the value input by the user is even or odd.
   //  Uses multiple dialog boxes for user interaction.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      String numStr, result;
      int again;
      float num;

      do 
      {
         numStr = JOptionPane.showInputDialog ("Enter an integer: ");
         num = Float.parseFloat(numStr);

          result = "That number is " + ((num%2 == 0) ? "even" : "odd")
           + "\nSquare Root: " + Math.sqrt(num) + "\nAbsolute Value: " + Math.abs(num) + "\nSin: "  
           + Math.sin(num) + "\nCos: " + Math.cos(num) + "\nTan: " + Math.tan(num) + "\nFloor: "
           + Math.floor(num) + "\nCeil: " + Math.ceil(num);
         
         JOptionPane.showMessageDialog (null, result);
         again = JOptionPane.showConfirmDialog (null, "Do Another?");
      }
      while (again == JOptionPane.YES_OPTION);
   }
}
