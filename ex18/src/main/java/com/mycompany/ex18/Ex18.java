package com.mycompany.ex18;
import javax.swing.JOptionPane;

public class Ex18 
{
    public static void main(String[] args) 
    {
        var nome = JOptionPane.showInputDialog("Digite um nome: ");
        var x = nome.charAt(nome.length() - 1);
        JOptionPane.showMessageDialog(null, String.format("Nome: %s %nPrimeiro caractere: %s %n"
                + "Último caractere: %s %nDo primeiro ao terceiro: %s %nQuarto caractere: %s %n"
                + "Todos menos o primeiro e os dois últimos: %s", nome, nome.charAt(0), x, nome.substring(0, 3), nome.charAt(3), nome.substring(1, nome.length()-2)));
        
    }
}