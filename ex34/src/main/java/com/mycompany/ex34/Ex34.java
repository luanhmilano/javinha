package com.mycompany.ex34;
import javax.swing.JOptionPane;

public class Ex34
{
    public static void main(String[] args)
    {
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da prestação: "));
        double taxa = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da taxa: "));
        int tempo = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do tempo (meses): "));
        if (valor < 0 || taxa < 0 || tempo < 0)
            JOptionPane.showMessageDialog(null, "Valor(es) inválido(s).");
        else
        {
            double prest = valor + (valor * (taxa / 100) * tempo);
            JOptionPane.showMessageDialog(null, String.format("Valor da prestação com juros: %.2f", prest));
        }
    }
}