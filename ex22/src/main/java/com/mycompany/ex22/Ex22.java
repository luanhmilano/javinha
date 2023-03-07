package com.mycompany.ex22;
import javax.swing.JOptionPane;

public class Ex22
{
    public static void main(String[] args)
    {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado B: "));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado C: "));
        double diag = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        JOptionPane.showMessageDialog(null, String.format("Diagonal do paralelepípedo: %.2f", diag));
    }
}