package com.mycompany.ex60;
import javax.swing.JOptionPane;

public class Ex60
{
    public static void main(String[] args)
    {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        if (num > 19 && num < 91)
            JOptionPane.showMessageDialog(null, "O número está entre 20 e 90.");
        else
            JOptionPane.showMessageDialog(null, "O número NÃO está entre 20 e 90.");
    }
}