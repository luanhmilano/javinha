package com.mycompany.ex26;
import javax.swing.JOptionPane;

public class Ex26 
{
    public static void main(String[] args)
    {
        double ca = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do cateto adjacente: "));
        double co = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do cateto oposto: "));
        if (ca <= 0 || co <= 0)
            JOptionPane.showMessageDialog(null, "Valor(es) Inválido(s).");
        else
        {
            double hip = Math.sqrt(Math.pow(ca, 2) + Math.pow(co, 2));
            JOptionPane.showMessageDialog(null, "Valor da hipotenusa: " + hip);
        }
    }
}