package com.mycompany.ex37;
import javax.swing.JOptionPane;

public class Ex37
{
    public static void main(String[] args)
    {
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor gasto: "));
        if (valor <= 0)
            JOptionPane.showMessageDialog(null, "Valor inválido.");
        else
        {
            JOptionPane.showMessageDialog(null, "Valor com gorjeta: " + (valor * 1.10));
            
        }
    }
}