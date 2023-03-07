package com.mycompany.ex02;
import javax.swing.JOptionPane;

public class Ex02 
{
    public static void main(String[] args) 
    {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        JOptionPane.showMessageDialog(null, "Os números digitados foram, respectivamente: " + n1 + " e " + n2);      
    }
}