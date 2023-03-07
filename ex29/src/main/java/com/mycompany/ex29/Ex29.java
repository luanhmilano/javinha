package com.mycompany.ex29;
import javax.swing.JOptionPane;

public class Ex29
{
    public static void main(String[] args)
    {
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: "));
        if (valor <= 0)
            JOptionPane.showMessageDialog(null, "Valor inválido.");
        else
        {
            double nvalor = valor * 0.91;
            JOptionPane.showMessageDialog(null, String.format("Valor com desconto: %.2f ", nvalor));
        }
    }
}