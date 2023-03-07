package com.mycompany.ex24;
import javax.swing.JOptionPane;

public class Ex24
{
    public static void main(String[] args) 
    {
        double dmaior = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da diagonal maior do losango: "));
        double dmenor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da diagonal menor do losango: "));
        if (dmaior <= 0 || dmenor <= 0)
            JOptionPane.showMessageDialog(null, "Dado(s) inválido(s).");
        else
        {
            double area = (dmaior * dmenor) / 2;
            JOptionPane.showMessageDialog(null, String.format("Área do losango: %.2f", area));
        }
    }
}