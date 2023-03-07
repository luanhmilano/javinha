package com.mycompany.ex55;
import javax.swing.JOptionPane;

public class Ex55 
{
    public static void main(String[] args) 
    {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        if (num < 0)
            JOptionPane.showMessageDialog(null, "Número ao quadrado: " + Math.pow(num, 2));
        else
            JOptionPane.showMessageDialog(null, "Raiz quadrada: " + Math.sqrt(num));
    }
}