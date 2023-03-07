package com.mycompany.ex17;
import javax.swing.JOptionPane;

public class Ex17
{
    public static void main(String[] args) 
    {
        double sal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário mínimmo atual: "));
        int kw = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de quilowatts consumido: "));
        if (sal <= 0 || kw <= 0)
            JOptionPane.showMessageDialog(null, "Valor(es) inválido.");
        else
        {
            double set = sal / 7;
            double x = (set * kw) / 100;
            double valorkw = x / kw;
            double xdesc = x * 0.90;
            JOptionPane.showMessageDialog(null, String.format("Valor em reais de cada quilowatt: %.2f", valorkw));
            JOptionPane.showMessageDialog(null, String.format("Valor a ser pago: %.2f", x));
            JOptionPane.showMessageDialog(null, String.format("Valor com desconto: %.2f", xdesc));
        }
    }
}