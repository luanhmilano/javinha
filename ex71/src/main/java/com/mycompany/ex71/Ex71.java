package com.mycompany.ex71;
import javax.swing.JOptionPane;

public class Ex71 
{
    public static void main(String[] args)
    {
        var nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
        var x = nome.toUpperCase();
        var i = x.charAt(0);
        switch (i)
        {
            case 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K' -> JOptionPane.showMessageDialog(null, "O aluno fará a prova na sala 101.");
            case 'L', 'M', 'N' -> JOptionPane.showMessageDialog(null, "O aluno fará a prova na sala 102.");
            case 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' -> JOptionPane.showMessageDialog(null, "O aluno fará a prova na sala 103.");
            default -> JOptionPane.showMessageDialog(null, "Valor inválido.");
        }
    }
}