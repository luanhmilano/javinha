package com.mycompany.ex79;
import javax.swing.JOptionPane;

public class Ex79 
{
    public static void main(String[] args)
    {
        double saldo = Integer.parseInt(JOptionPane.showInputDialog("Digite o saldo médio: "));
        JOptionPane.showMessageDialog(null, "Saldo médio: " + saldo);
        if (saldo >= 0 && saldo <= 500)
            JOptionPane.showMessageDialog(null, "Nenhum crédito.");
        else if (saldo > 500 && saldo <= 1000)
            JOptionPane.showMessageDialog(null, "Crédito: " + (saldo * 0.30));
        else if (saldo > 1000 && saldo <= 3000)
            JOptionPane.showMessageDialog(null, "Crédito: " + (saldo * 0.40));
        else if (saldo > 3000)
            JOptionPane.showMessageDialog(null, "Crédito: " + (saldo * 0.50));
        else
            JOptionPane.showMessageDialog(null, "Valor de saldo inválido.");
    }
}