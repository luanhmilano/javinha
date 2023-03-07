package com.mycompany.ex30;
import javax.swing.JOptionPane;

public class Ex30
{
    public static void main(String[] args)
    {
        double ha = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora/aula: "));
        int ad = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de aulas dadas no mês: "));
        double inss = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual do INSS: "));
        if (inss <= 0 || ad < 0 || ha < 0)
            JOptionPane.showMessageDialog(null, "Valor(es) inválido(s).");
        else
        {
            double sal = (ha * ad) - ((ha * ad) * inss / 100);
            JOptionPane.showMessageDialog(null, String.format("Salário líquido: %.2f", sal));
        }
    }
}