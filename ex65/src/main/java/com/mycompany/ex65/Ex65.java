package com.mycompany.ex65;
import javax.swing.JOptionPane;

public class Ex65
{
    public static void main(String[] args)
    {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número: "));
        if ((a > b) && (a > c))
        {
            if (b > c)
                JOptionPane.showMessageDialog(null,  a + " - " + b + " - " + c);
            else
                JOptionPane.showMessageDialog(null,  a + " - " + c + " - " + b);
        }
        else if ((b > a) && (b > c))
        {
            if (a > c)
                JOptionPane.showMessageDialog(null,  b + " - " + a + " - " + c);
            else
                JOptionPane.showMessageDialog(null,  b + " - " + c + " - " + a);
        }
        else if ((c > a) && (c > b))
        {
            if (a > b)
                JOptionPane.showMessageDialog(null,  c + " - " + a + " - " + b);
            else
                JOptionPane.showMessageDialog(null,  c + " - " + b + " - " + a);
        }
    }
}