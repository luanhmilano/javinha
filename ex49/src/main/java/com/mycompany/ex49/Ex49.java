package com.mycompany.ex49;
import javax.swing.JOptionPane;

public class Ex49
{
    public static void main(String[] args)
    {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        if (num > 20)
            JOptionPane.showMessageDialog(null, "Metade: " + num / 2);
    }
}