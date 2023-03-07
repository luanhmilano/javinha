package com.mycompany.ex57;
import javax.swing.JOptionPane;

public class Ex57
{
    public static void main(String[] args)
    {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        if (num % 10 == 0)
        {
            if ((num % 5 == 0) && (num % 2 == 0))
            {
                JOptionPane.showMessageDialog(null, "O número é divisível por 10, por 5 e por 2.");
            }
            else if ((num % 5 == 0) && (num % 2 != 0))
            {
                JOptionPane.showMessageDialog(null, "O número é divisível por 10 e por 5.");
            }
            else if ((num % 2 == 0) && (num % 5 != 0))
            {
                JOptionPane.showMessageDialog(null, "O número é divisível por 10 e por 2.");
            }
        }
        else if (num % 5 == 0)
        {
            JOptionPane.showMessageDialog(null, "O número é divisível por 5.");
        }
        else if (num % 2 == 0)
            JOptionPane.showMessageDialog(null, "O número é divisível por 2");
        else
            JOptionPane.showMessageDialog(null, "O número NÃO é divisível por 10, nem por 5, nem por 2.");
    }
}