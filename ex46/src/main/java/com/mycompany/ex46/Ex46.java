package com.mycompany.ex46;
import javax.swing.JOptionPane;

public class Ex46
{
    public static void main(String[] args)
    {
        double p = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da aplicação mensal: "));
        double i = Double.parseDouble(JOptionPane.showInputDialog("Digite a taxa: "));
        double n = Double.parseDouble(JOptionPane.showInputDialog("Digite o total de meses: "));
        if (p <= 0 || i <= 0 || n <= 0)
            JOptionPane.showMessageDialog(null, "Valor(es) inválido(s).");
        else
        {
            double va = Math.pow(p * (1 + (i / 100)), (n - 1)) / i; 
            JOptionPane.showMessageDialog(null, String.format("Valor acumulado: %.2f", va));
        }
    }
}