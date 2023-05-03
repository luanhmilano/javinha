package com.mycompany.banco;
import javax.swing.JOptionPane;

public class Banco
{
    public static void main(String[] args)
    {
        ContaPoupanca cp = new ContaPoupanca();
        ChequeEspecial ce = new ChequeEspecial();
        String flag1, flag2, flag3, flag4;
        flag1 = "S";
        flag3 = "S";
        flag4 = "S";
        
        while (flag1.charAt(0) != 'N' && flag1.charAt(0) != 'n')
        {
            flag2 = JOptionPane.showInputDialog("Criar conta poupança (P) ou cheque especial (E)?: ");
            switch (flag2.charAt(0)) {
                case 'P', 'p' ->
                    
                {
                    cp.setCliente(JOptionPane.showInputDialog("Digite o nome do cliente: "));
                    cp.setNumeroConta(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta: ")));
                    cp.setSaldo(Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo inicial: ")));
                    cp.setDiaRendimento(Integer.parseInt(JOptionPane.showInputDialog("Digite o total de dias de rendimento da poupança: ")));
                    cp.calcularNovoSaldo(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da taxa da poupança: ")));
                    JOptionPane.showMessageDialog(null, String.format("Cliente: %s%nNúmero: %d%nSaldo: %.2f", cp.getCliente(), cp.getNumeroConta(), cp.getSaldo()));
                    while (flag3.charAt(0) != 'N' && flag3.charAt(0) != 'n')
                    {
                        cp.depositar(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do depósito: ")));
                        cp.sacar(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do saque: ")));
                        JOptionPane.showMessageDialog(null, String.format("Cliente: %s%nNúmero: %d%nSaldo: %.2f", cp.getCliente(), cp.getNumeroConta(), cp.getSaldo()));
                        flag3 = JOptionPane.showInputDialog("Fazer mais operações?(S/N):");
                    }
                }
                case 'E', 'e' ->
                {
                    ce.setCliente(JOptionPane.showInputDialog("Digite o nome do cliente: "));
                    ce.setNumeroConta(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta: ")));
                    ce.setSaldo(Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo inicial: ")));
                    ce.setLimite(Float.parseFloat(JOptionPane.showInputDialog("Digite o limite do cheque especial: ")));
                    JOptionPane.showMessageDialog(null, String.format("Cliente: %s%nNúmero: %d%nSaldo: %.2f%nLimite do CE: %.2f", ce.getCliente(), ce.getNumeroConta(), ce.getSaldo(), ce.getLimite()));
                    while (flag4.charAt(0) != 'N' && flag4.charAt(0) != 'n')
                    {
                        ce.depositar(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do depósito: ")));
                        ce.sacar(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do saque: ")));
                        JOptionPane.showMessageDialog(null, String.format("Cliente: %s%nNúmero: %d%nSaldo: %.2f", ce.getCliente(), ce.getNumeroConta(), ce.getSaldo()));
                        flag4 = JOptionPane.showInputDialog("Fazer mais operações?(S/N):");
                    }
                }
                default -> JOptionPane.showMessageDialog(null, "Valor digitado inválido.");
            }
            flag1 = JOptionPane.showInputDialog("Repetir o processo?(S/N): ");
        }
        JOptionPane.showMessageDialog(null, "Fim do programa.");
    }
}
