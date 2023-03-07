package com.mycompany.ex43;
import javax.swing.JOptionPane;

public class Ex43 
{
    public static void main(String[] args) 
    {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 0 a 60: "));
        JOptionPane.showMessageDialog(null, "Sucessor: " + ((num + 1) % 61));
    }
}