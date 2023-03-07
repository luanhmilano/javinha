package com.mycompany.ex54;
import javax.swing.JOptionPane;

public class Ex54 
{
    public static void main(String[] args)
    {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        int soma = n1 + n2;
        if (soma > 20)
            JOptionPane.showMessageDialog(null, "Novo número: " + (soma + 8));
        else
            JOptionPane.showMessageDialog(null, "Novo número: " + (soma - 5));
    }
}