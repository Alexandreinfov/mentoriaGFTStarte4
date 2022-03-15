package me.dio;

import me.dio.models.Endereco;
import me.dio.models.Gerente;
import me.dio.models.OperadorDeCaixa;
import me.dio.models.Vendendor;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua Funcionario","15A","jardim");
        //endereco.setRua("teste");

        Vendendor vendedor = new Vendendor();
        vendedor.setNome("Joãozinho");
        vendedor.setDocumento("546.487.898-98");
        vendedor.setValorSalario(10000d);
        vendedor.setEndereco(endereco);
        vendedor.calculaBonificacao(2d);
        System.out.println(vendedor);

        OperadorDeCaixa operadorCaixa = new OperadorDeCaixa("Lucas","465.788.889-89",5000d,endereco);

        System.out.println(operadorCaixa);

        Gerente gerente = new Gerente();
        gerente.setNome("Adilson");
        gerente.setDocumento("879.982.985-98");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);

        gerente.calculaRemuneracao();
        gerente.calculaBonificacao(3d);
        System.out.println(gerente);
    }
}
