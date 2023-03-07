package com.mycompany.ex51;
import javax.swing.JOptionPane;

public class Ex51 
{
    public static void main(String[] args)
    {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        if (num % 2 != 0)
            JOptionPane.showMessageDialog(null, num + " é ÍMPAR.");
        else
            JOptionPane.showMessageDialog(null, num + " é PAR.");
    }
}