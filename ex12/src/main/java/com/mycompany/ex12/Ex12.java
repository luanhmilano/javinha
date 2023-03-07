package com.mycompany.ex12;
import javax.swing.JOptionPane;

public class Ex12
{
    public static void main(String[] args) 
    {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        if (x <= 0)
            JOptionPane.showMessageDialog(null, "Valor inválido.");
        else
        {
            double log = Math.log10(x);
            JOptionPane.showMessageDialog(null, String.format("O logaritmo de %d na base 10 é: %f", x, log));
        }
    }
}