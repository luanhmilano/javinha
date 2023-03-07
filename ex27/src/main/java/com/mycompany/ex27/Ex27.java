package com.mycompany.ex27;
import javax.swing.JOptionPane;

public class Ex27 
{
    public static void main(String[] args)
    {
        int raz = Integer.parseInt(JOptionPane.showInputDialog("Digite a razão da PA: "));
        int termo = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° termo da PA: "));
        int termo10 = termo + (9 * raz);
        JOptionPane.showMessageDialog(null, "10° termo da PA: " + termo10);
    }
}