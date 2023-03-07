package com.mycompany.ex63;
import javax.swing.JOptionPane;

public class Ex63
{
    public static void main(String[] args) 
    {
        var sig = JOptionPane.showInputDialog("Digite a sigla do estado: ");
        switch (sig) {
            case "mg", "MG" -> JOptionPane.showMessageDialog(null, "Mineiro(a).");
            case "rj", "RJ" -> JOptionPane.showMessageDialog(null, "Carioca.");
            case "sp", "SP" -> JOptionPane.showMessageDialog(null, "Paulista.");
            default -> JOptionPane.showMessageDialog(null, "Outros estados.");
        }
    }
}