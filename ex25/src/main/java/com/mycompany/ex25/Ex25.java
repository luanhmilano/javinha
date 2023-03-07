package com.mycompany.ex25;
import javax.swing.JOptionPane;

public class Ex25 
{
    public static void main(String[] args) 
    {
        double p1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1° nota: "));
        double p2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2° nota: "));
        if (p1 < 0 || p2 < 0)
            JOptionPane.showMessageDialog(null, "Nota(s) inválida(s).");
        else
        {
            double media = (p1 + p2) / 2;
            JOptionPane.showMessageDialog(null, "Média final: " + media);
            JOptionPane.showMessageDialog(null, "Média final arredondada: " + Math.round(media));
        }    
    }
}