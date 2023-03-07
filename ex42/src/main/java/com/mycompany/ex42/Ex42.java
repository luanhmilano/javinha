package com.mycompany.ex42;
import javax.swing.JOptionPane;

public class Ex42 
{
    public static void main(String[] args)
    {
        int peso = Integer.parseInt(JOptionPane.showInputDialog("Digite o peso: "));
        if (peso <= 0)
            JOptionPane.showMessageDialog(null, "Valor de peso inválido.");
        else
        {
            double npeso = (peso * 1000) * 1.12;
            JOptionPane.showMessageDialog(null, "Peso da pessoa em gramas: " + (peso * 1000));
            JOptionPane.showMessageDialog(null, "Peso da pessoa que engordou: " + npeso);
        }
    }
}