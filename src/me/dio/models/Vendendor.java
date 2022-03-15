package me.dio.models;

public class Vendendor extends FuncionarioCLT implements CalculaBonificacao {

    private Double valorDaBonificacao;

    @Override
    public void calculaBonificacao(Double porecentagemBonificacao) {
        this.valorDaBonificacao = this.valorSalario * (porecentagemBonificacao/100d);
    }

    @Override
    public String toString() {
        return "Vendendor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco.getBairro() +
                ", valorBonificacao=" + valorDaBonificacao +
                '}';
    }
}
