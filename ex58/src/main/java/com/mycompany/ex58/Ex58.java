package com.mycompany.ex58;
import javax.swing.JOptionPane;

public class Ex58
{
    public static void main(String[] args)
    {
        double sal = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário: "));
        double prest = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da prestação: "));
        if (prest > (sal * 0.30))
            JOptionPane.showMessageDialog(null, "NÃO é possível realizar o empréstimo.");
        else
            JOptionPane.showMessageDialog(null, "É possível realizar o empréstimo.");
    }
}