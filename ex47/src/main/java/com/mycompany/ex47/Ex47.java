package com.mycompany.ex47;
import javax.swing.JOptionPane;

public class Ex47 
{
    public static void main(String[] args)
    {
        int fitas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de fitas: "));
        int aluguel = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do aluguel: "));
        if (fitas <= 0 || aluguel <= 0)
            JOptionPane.showMessageDialog(null, "Valor inválido.");
        else
        {
            double faturamento = ((fitas / 3) * aluguel) * 12;
            double multa = (fitas / 10) * (aluguel * 1.10) - (fitas / 10) * aluguel;
            double fim = fitas - (fitas * 0.02) + (fitas * 0.10);
            fim = Math.round(fim);
            JOptionPane.showMessageDialog(null, String.format("Faturamento anual: %.2f %nValor ganho com multas: %.2f %nFitas ao final do ano: %.2f", faturamento, multa, fim));
        }
    }
}