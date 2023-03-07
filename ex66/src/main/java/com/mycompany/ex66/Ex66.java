package com.mycompany.ex66;
import javax.swing.JOptionPane;

public class Ex66 
{
   public static void main (String[] args)
   {
      int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° número: "));
      int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° número: "));
      int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3° número: "));
      int maior;
      int medio;
      int menor;
      if ((n1 > n2) && (n1 > n3))
      {
           if (n2 > n3)
           {
                maior = n1;
                medio = n2;
                menor = n3;
                JOptionPane.showMessageDialog(null, String.format("Menor: %d %nIntermediário: %d %nMaior: %d", menor, medio, maior));
           }
           else 
           {
                maior = n1;
                medio = n3;
                menor = n2;
                JOptionPane.showMessageDialog(null, String.format("Menor: %d %nIntermediário: %d %nMaior: %d", menor, medio, maior));
           }
      }
      else if ((n2 > n1) && (n2 > n3))
      {
           if (n1 > n3)
           {
                maior = n2;
                medio = n1;
                menor = n3;
                JOptionPane.showMessageDialog(null, String.format("Menor: %d %nIntermediário: %d %nMaior: %d", menor, medio, maior));
           }
           else
           {
                maior = n2;
                medio = n3;
                menor = n1;
                JOptionPane.showMessageDialog(null, String.format("Menor: %d %nIntermediário: %d %nMaior: %d", menor, medio, maior));
           }
      }
      else if ((n3 > n1) && (n3 > n2))
      {
           if (n1 > n2)
           {
                maior = n3;
                medio = n1;
                menor = n2;
                JOptionPane.showMessageDialog(null, String.format("Menor: %d %nIntermediário: %d %nMaior: %d", menor, medio, maior));
           }
           else
           {
                maior = n3;
                medio = n2;
                menor = n1;
                JOptionPane.showMessageDialog(null, String.format("Menor: %d %nIntermediário: %d %nMaior: %d", menor, medio, maior));
           }
      }
      else
      {
           JOptionPane.showMessageDialog(null, "Números são iguais");
       }
   } 
}