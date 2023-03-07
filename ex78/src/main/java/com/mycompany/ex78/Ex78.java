package com.mycompany.ex78;
import javax.swing.JOptionPane;

public class Ex78
{
    public static void main(String[] args)
    {
        var nome = JOptionPane.showInputDialog("Digite o nome do cliente: ");
        double conta = Double.parseDouble(JOptionPane.showInputDialog("Digite a conta do cliente: "));
        var x = nome.toUpperCase();
        var i = x.charAt(0);
        if (conta <= 0)
            JOptionPane.showMessageDialog(null, "Valor da conta inválido.");
        else
        {
            if (i == 'A' || i == 'D' || i == 'M' || i == 'S')
                JOptionPane.showMessageDialog(null, "Valor da conta com desconto: " + (conta * 0.70));
            else
                JOptionPane.showMessageDialog(null, "Que pena. Nesta semana o desconto não é para o seu nome, mas continue a nos prestigiar que sua vez chegará");
        }
    }
}