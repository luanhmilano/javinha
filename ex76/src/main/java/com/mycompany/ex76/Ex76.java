package com.mycompany.ex76;
import javax.swing.JOptionPane;

public class Ex76 
{
    public static void main(String[] args)
    {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do coeficiente A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do coeficiente B: "));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do coeficiente C: "));
        double delta = Math.pow(b, 2) - (4 * a * c);
        double x1;
        double x2;
        if (delta < 0)
            JOptionPane.showMessageDialog(null, "Não há raízes reais.");
        else if (delta == 0)
            JOptionPane.showMessageDialog(null, "Não é equação do 2° grau.");
        else
        {
            x1 = ((-b) + Math.sqrt(delta)) / 2 * a;
            x2 = ((-b) - Math.sqrt(delta)) / 2 * a;
            JOptionPane.showMessageDialog(null, "Raízes: " + x1 + " e" + x2);
        }
    }
}