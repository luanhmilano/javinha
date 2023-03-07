package com.mycompany.ex16;
import javax.swing.JOptionPane;

public class Ex16
{
    public static void main(String[] args)
    {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 3 dígitos: "));
        if (num < 100 || num > 999) 
            JOptionPane.showMessageDialog(null, "Valor inválido.");
        else
        {
            int c = num / 100;
            int d = (num % 100) / 10;
            int u = (num % 100) % 10;
            JOptionPane.showMessageDialog(null, "Número digitado: " + c + d + u);
            JOptionPane.showMessageDialog(null, "Número digitado ao contrário: " + u + d + c);
        }
    }
}