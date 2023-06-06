package com.mycompany.empregado;

import javax.swing.JOptionPane;

public class ComissionadoExec
{
    public static void main(String[] args)
    {
        Comissionado c1 = new Comissionado();
        
        c1.setNome(JOptionPane.showInputDialog("Digite o nome do funcionário: "));
        c1.setSobrenome(JOptionPane.showInputDialog("Digite o sobrenome do funcionário: "));
        c1.setCpf(JOptionPane.showInputDialog("Digite o CPF do funcionário: "));
        c1.setTotalVenda(Double.parseDouble(JOptionPane.showInputDialog("Digite o total de vendas do funcionário: ")));
        c1.setTaxaComissao(Double.parseDouble(JOptionPane.showInputDialog("Digite a taxa de comissão: ")));
        
        JOptionPane.showMessageDialog(null, String.format("Nome: %s%nSobrenome: %s%nCPF: %s%nSalário: %.2f", c1.getNome(), c1.getSobrenome(), c1.getCpf(), c1.vencimento()));
    }
}
