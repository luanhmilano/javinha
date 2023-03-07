package com.mycompany.ex04;
import javax.swing.JOptionPane;

public class Ex04
{
    public static void main(String[] args) 
    {
       var nome = JOptionPane.showInputDialog("Digite seu nome: ");
       var end = JOptionPane.showInputDialog("Digite seu endereço: ");
       var tel = JOptionPane.showInputDialog("Digite seu telefone: ");
       
       JOptionPane.showMessageDialog(null, "Nome: " + nome);
       JOptionPane.showMessageDialog(null, "Endereço: " + end);
       JOptionPane.showMessageDialog(null, "Telefone: " + tel);
    }
}