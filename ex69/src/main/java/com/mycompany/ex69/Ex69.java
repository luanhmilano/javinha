package com.mycompany.ex69;
import javax.swing.JOptionPane;

public class Ex69 
{
   public static void main (String[] args)
   {
      double sal = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário: "));
      if (sal <= 600)
      {
           JOptionPane.showMessageDialog(null, "Isento do INSS");
      }
      else if ((sal > 600) && (sal < 1200))
      {
           JOptionPane.showMessageDialog(null, "Desconto do INSS: " + (sal * 0.20));
      }
      else if ((sal > 1200) && (sal < 2000))
      {
           JOptionPane.showMessageDialog(null, "Desconto do INSS: " + (sal * 0.25));
      }
      else
      {
           JOptionPane.showMessageDialog(null, "Desconto do INSS: " + (sal * 0.30));
       }
   } 
}