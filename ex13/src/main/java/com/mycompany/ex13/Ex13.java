package com.mycompany.ex13;
import javax.swing.JOptionPane;

public class Ex13
{
    public static void main(String[] args) 
    {
        int base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do logaritmo: "));
        int logma = Integer.parseInt(JOptionPane.showInputDialog("Digite o logaritmando: ")); 
        if (base <= 0 || logma <= 0)
            JOptionPane.showMessageDialog(null, "Valor(es) inválido(s).");
        else
        {
            double log = Math.log10(logma) / Math.log10(base); 
            JOptionPane.showMessageDialog(null, "O logaritmo de " + logma + " na base " + base + " é igual a: " + log);
        }
    }
}