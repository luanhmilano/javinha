package com.mycompany.ex39;
import javax.swing.JOptionPane;

public class Ex39
{
    public static void main(String[] args) 
    {
        double deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito: "));
        double taxa = Double.parseDouble(JOptionPane.showInputDialog("Digite a taxa de juros: "));
        if (deposito < 0 || taxa < 0)
            JOptionPane.showMessageDialog(null, "Valor(es) inválido(s).");
        else
        {
            double rend = deposito * (taxa / 100);
            JOptionPane.showMessageDialog(null, "Rendimento: " + rend);
            JOptionPane.showMessageDialog(null, "Montante final: " + (deposito + rend));
        }
    }
}