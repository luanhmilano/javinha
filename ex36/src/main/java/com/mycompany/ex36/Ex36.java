package com.mycompany.ex36;
import javax.swing.JOptionPane;

public class Ex36 
{
    public static void main(String[] args) 
    {
        double num = Double.parseDouble(JOptionPane.showInputDialog("Digite o numerador da fração: "));
        double den = Double.parseDouble(JOptionPane.showInputDialog("Digite o denominador da fração: "));
        if (den == 0)
            JOptionPane.showMessageDialog(null, "Valor inválido para o denominador!");
        else
        {
            double fra = num / den;
            JOptionPane.showMessageDialog(null, String.format("Fração em número decimal: %.2f", fra));
        }
    }
}