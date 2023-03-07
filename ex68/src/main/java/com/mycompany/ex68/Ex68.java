package com.mycompany.ex68;
import javax.swing.JOptionPane;

public class Ex68 
{
   public static void main (String[] args)
   {
      var nome = JOptionPane.showInputDialog("Digite o nome: ");
      double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1° nota: "));
      double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2° nota: "));
      if ((n1 < 0) || (n2 < 0))
           JOptionPane.showMessageDialog(null, "Valor(es) inválido(s)");
      else
      {
           double media = (n1 + n2) / 2;
           JOptionPane.showMessageDialog(null, "Nome: " + nome);
           JOptionPane.showMessageDialog(null, "Média: " + media);
           if (media >= 7)
                JOptionPane.showMessageDialog(null, "Aluno aprovado");
           else if (media < 4)
                JOptionPane.showMessageDialog(null, "Aluno reprovado");
           else
                JOptionPane.showMessageDialog(null, "Aluno de recuperação");
      }
   }
}