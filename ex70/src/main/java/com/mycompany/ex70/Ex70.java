package com.mycompany.ex70;
import javax.swing.JOptionPane;

public class Ex70
{
   public static void main (String[] args)
   {
      double pc = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de compra do produto: "));
      double pv;
      while (pc <= 0)
           pc = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor válido: "));
      if (pc < 20)
      {
           pv = pc * 1.45;
           JOptionPane.showMessageDialog(null, "Valor de venda do produto: " + pv);
      }
      else
      {
           pv = pc * 1.30;
           JOptionPane.showMessageDialog(null, "Valor de venda do produto: " + pv);
       }
   } 
}