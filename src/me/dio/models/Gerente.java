package me.dio.models;

public class Gerente extends FuncionarioPJ implements CalculaBonificacao {

    private  Double valorBonificacao;

    @Override
    public void calculaBonificacao(Double porecentagemBonificacao) {
        this.valorBonificacao = (super.getValorRemuneracao() * (porecentagemBonificacao/100) + 100);
    }

    @Override
    public String toString() {
        return "FuncionarioPJ{" +
                "nome='" + super.getNome() + '\'' +
                ", documento='" + super.getDocumento() + '\'' +
                ", endereco=" + super.getEndereco() +
                ", horasTrabalhadas=" + super.getHorasTrabalhadas() +
                ", valorHora=" + super.getValorHora() +
                ", valorRemuneracao=" + super.getValorRemuneracao() +
                ", valorBonificacao=" + this.valorBonificacao +
                '}';
    }
}
