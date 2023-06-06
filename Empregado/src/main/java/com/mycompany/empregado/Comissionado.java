package com.mycompany.empregado;

public class Comissionado extends Empregado
{
    private double totalVenda;
    private double taxaComissao;

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }
    
    public double vencimento()
    {
        double valor = totalVenda * taxaComissao;
        return valor;
    }
}
