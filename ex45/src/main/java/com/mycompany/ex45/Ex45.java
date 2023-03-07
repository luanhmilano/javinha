package com.mycompany.ex45;
import javax.swing.JOptionPane;

public class Ex45
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de lados: "));
        if (n < 0)
            JOptionPane.showMessageDialog(null, "Número de lados inválido.");
        else
        {
            double nd = n * (n - 3) / 2;
            JOptionPane.showMessageDialog(null, "Número de diagonais diferentes: " + nd);
        }
    }
}