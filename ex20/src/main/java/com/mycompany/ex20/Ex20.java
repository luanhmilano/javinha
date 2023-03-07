package com.mycompany.ex20;
import javax.swing.JOptionPane;

public class Ex20
{
    public static void main(String[] args)
    {
        int r = Integer.parseInt(JOptionPane.showInputDialog("Digite o raio do círculo: "));
        if (r <= 0)
            JOptionPane.showMessageDialog(null, "Valor inválido.");
        else
        {
            double area = Math.PI * Math.pow(r, 2);
            double perimetro = 2 * Math.PI * r;
            JOptionPane.showMessageDialog(null, String.format("Valor da área: %.2f", area));
            JOptionPane.showMessageDialog(null, String.format("Valor do perímetro: %.2f", perimetro));
        }
    }
}