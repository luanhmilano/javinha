package com.mycompany.ex61;
import javax.swing.JOptionPane;

public class Ex61
{
    public static void main(String[] args)
    {
        int ano_nasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento: "));
        int ano_atual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
        while (ano_nasc < 0)
        {
            JOptionPane.showMessageDialog(null, "Data de nascimento inválida.");
            ano_nasc = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor válido: "));
        }
        if (ano_nasc > ano_atual)
        {
            JOptionPane.showMessageDialog(null, "O ano de nascimento não pode ser maior que o ano atual.");
        }
        else
            JOptionPane.showMessageDialog(null, "Idade: " + (ano_atual - ano_nasc));
    }
}