package com.mycompany.empregado;
import javax.swing.JOptionPane;

public class AssalariadoExec
{
    public static void main(String[] args)
    {
        Assalariado assalariado = new Assalariado();
        
        assalariado.setNome(JOptionPane.showInputDialog("Digite o nome do funcionário: "));
        assalariado.setSobrenome(JOptionPane.showInputDialog("Digite o sobrenome do funcionário: "));
        assalariado.setCpf(JOptionPane.showInputDialog("Digite o CPF do funcionário: "));
        assalariado.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário: ")));
        
        JOptionPane.showMessageDialog(null, String.format("Nome: %s%nSobrenome: %s%nCPF: %s%nSalário: %.2f", assalariado.getNome(), assalariado.getSobrenome(), assalariado.getCpf(), assalariado.getSalario()));
    }
}
