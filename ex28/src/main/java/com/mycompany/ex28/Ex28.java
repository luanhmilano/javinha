package com.mycompany.ex28;
import javax.swing.JOptionPane;

public class Ex28
{
    public static void main(String[] args)
    {
        int raz = Integer.parseInt(JOptionPane.showInputDialog("Digite a razão da PG: "));
        int termo = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° termo da sequência: "));
        if (raz == 0 || termo == 0)
            JOptionPane.showMessageDialog(null, "Valor(es) inválido(s).");
        else
        {
            int termo5 = 0;
            for (int i = 0; i < 4; i++)
            {
                termo5 = raz * termo;
                termo = termo5;
            }
            JOptionPane.showMessageDialog(null, "5° Termo da PG: " + termo5);
        }
    }
}