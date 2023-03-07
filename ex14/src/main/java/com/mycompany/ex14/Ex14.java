package com.mycompany.ex14;
import javax.swing.JOptionPane;

public class Ex14 
{
    public static void main(String[] args) 
    {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        if (x < 0)
            JOptionPane.showMessageDialog(null, "Número inválido.");
        else
        {
            double quad = Math.pow(x, 2);
            double raiz = Math.sqrt(x);
            JOptionPane.showMessageDialog(null, String.format("Número: %d %nNúmero elevado ao quadrado: %.2f %nRaiz quadrada: %.3f", x, quad, raiz));
        }
    }
}