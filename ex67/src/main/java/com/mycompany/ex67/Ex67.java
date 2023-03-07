package com.mycompany.ex67;
import javax.swing.JOptionPane;

public class Ex67 
{
   public static void main (String[] args)
   {
      int lado1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° lado: "));
      int lado2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° lado: "));
      int lado3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3° lado: "));
      if ((lado1 == lado2) && (lado2 == lado3))
      {
           JOptionPane.showMessageDialog(null, "Triângulo equilátero.");
      }
      else if ((lado1 != lado2) && (lado2 != lado3) && (lado1 != lado3))
      {
           JOptionPane.showMessageDialog(null, "Triângulo escaleno.");
      }
      else
      {
           JOptionPane.showMessageDialog(null, "Triângulo isósceles.");
       }
   } 
}