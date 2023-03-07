package com.mycompany.ex50;
import javax.swing.JOptionPane;

public class Ex50 
{
    public static void main(String[] args)
    {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        if (num < 0)
            JOptionPane.showMessageDialog(null, "Valor absoluto: " + Math.abs(num));
        else
            JOptionPane.showMessageDialog(null, "Inverso do número: " + 1 + "/" + num);
    }
}