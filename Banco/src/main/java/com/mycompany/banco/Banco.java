package com.mycompany.banco;
import javax.swing.JOptionPane;

public class Banco
{
    public static void main(String[] args)
    {
        ContaPoupanca cp1 = new ContaPoupanca(5);
        ContaBancaria c1 = new ContaBancaria();
        
        c1.setCliente(JOptionPane.showInputDialog("Digite o nome do cliente: "));
        c1.setNumeroConta(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta: ")));
        c1.setSaldo(Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo: ")));
        
        cp1.setCliente(JOptionPane.showInputDialog("Digite o nome do cliente: "));
        cp1.setNumeroConta(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta: ")));
        cp1.setSaldo(Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo: ")));
        float taxa = Float.parseFloat(JOptionPane.showInputDialog("Digite a taxa de rendimento: "));
        
        JOptionPane.showMessageDialog(null, String.format("Cliente: %s%nNúmero: %d%nSaldo inicial: %.2f", c1.getCliente(), c1.getNumeroConta(), c1.getSaldo()));
        JOptionPane.showMessageDialog(null, String.format("Cliente: %s%nNúmero: %d%nSaldo inicial: %.2f", cp1.getCliente(), cp1.getNumeroConta(), cp1.getSaldo()));
        
        float d = Float.parseFloat(JOptionPane.showInputDialog("1° - Digite o valor do depósito: "));
        c1.depositar(d);
        float s = Float.parseFloat(JOptionPane.showInputDialog("1° - Digite o valor do saque: "));
        c1.sacar(s);
        
        JOptionPane.showMessageDialog(null, String.format("Cliente: %s%nNúmero: %d%nSaldo atual: %.2f", c1.getCliente(), c1.getNumeroConta(), c1.getSaldo()));
        JOptionPane.showMessageDialog(null, String.format("Cliente: %s%nNúmero: %d%nSaldo atual: %.2f", cp1.getCliente(), cp1.getNumeroConta(), cp1.calcularNovoSaldo(taxa)));
        
        d = Float.parseFloat(JOptionPane.showInputDialog("2° - Digite o valor do depósito: "));
        cp1.depositar(d);
        s = Float.parseFloat(JOptionPane.showInputDialog("2° - Digite o valor do saque: "));
        cp1.sacar(s);
    }
}
