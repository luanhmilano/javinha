package com.mycompany.ex62;
import javax.swing.JOptionPane;

public class Ex62
{
    public static void main(String[] args)
    {
        var nome = JOptionPane.showInputDialog("Digite o nome: ");
        var sexo = JOptionPane.showInputDialog("Digite o sexo (M/F): ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
        if (sexo.equals("f") || sexo.equals("F"))
        {
            if (idade < 25)
                JOptionPane.showMessageDialog(null, nome + ": ACEITA, para a vaga de recepcionista.");
            else
                JOptionPane.showMessageDialog(null, nome + ": NÃO ACEITA.");
        }
        else
            JOptionPane.showMessageDialog(null, nome + ": NÃO ACEITO, procure um canteiro de obras.");
    }
}