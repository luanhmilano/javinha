package com.mycompany.ex23;
import javax.swing.JOptionPane;

public class Ex23
{
    public static void main(String[] args)
    {
        double base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo: "));
        double alt = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo: "));
        if (base <= 0 || alt <= 0)
            JOptionPane.showMessageDialog(null, "Dado(s) inválido(s).");
        else
        {
            double area = (base * alt) / 2;
            JOptionPane.showMessageDialog(null, String.format("Área do triângulo: %.2f", area));
        }
    }
}