package com.mycompany.ex56;
import javax.swing.JOptionPane;

public class Ex56
{
    public static void main(String[] args)
    {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        if (num % 3 == 0)
            JOptionPane.showMessageDialog(null, "O número é múltiplo de 3.");
        else
            JOptionPane.showMessageDialog(null, "O número não é múltiplo de 3.");
    }
}