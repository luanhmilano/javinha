package com.mycompany.ex74;
import javax.swing.JOptionPane;

public class Ex74 
{
    public static void main(String[] args)
    {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do nadador: "));
        if (idade < 5)
            JOptionPane.showMessageDialog(null, "Valor inválido.");
        else
        {
            switch (idade)
            {
                case 5, 6, 7 -> JOptionPane.showMessageDialog(null, "Infantil A.");
                case 8, 9, 10 -> JOptionPane.showMessageDialog(null, "Infantil B.");
                case 11, 12, 13 -> JOptionPane.showMessageDialog(null, "Juvenil A.");
                case 14, 15, 16, 17 -> JOptionPane.showMessageDialog(null, "Juvenil B.");
                default -> JOptionPane.showMessageDialog(null, "Sênior.");
            }
        }
    }
}