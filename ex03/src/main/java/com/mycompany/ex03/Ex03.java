package com.mycompany.ex03;
import javax.swing.JOptionPane;

public class Ex03
{
    public static void main(String[] args)
    {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        JOptionPane.showMessageDialog(null, "O sucessor de " + num + " é: " + (num + 1));
        JOptionPane.showMessageDialog(null, "O antecessor de " + num + " é: " + (num - 1));
    }
}