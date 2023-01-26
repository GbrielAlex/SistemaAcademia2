package br.com.SistemaAcadema;

import java.util.Calendar;

public class Funcionario extends PessoaFisica {

    private String senhaAcesso;
    private Money salario;
    private Calendar dataPagamente;

    public Funcionario(String cpf, String nome, Calendar dataNascimento, String endereco, String senhaAcesso, Money salario, Calendar dataPagamente) {
        super(cpf, nome, dataNascimento, endereco);
        this.senhaAcesso = senhaAcesso;
        this.salario = salario;
        this.dataPagamente = dataPagamente;
        super.setNIVELACESSO(1);
    }

    public String getSenhaAcesso() {
        return senhaAcesso;
    }

    public void setSenhaAcesso(String senhaAcesso) {
        this.senhaAcesso = senhaAcesso;
    }

    public Money getSalario() {
        return salario;
    }

    public Calendar getDataPagamente() {
        return dataPagamente;
    }

    public void setDataPagamente(Calendar dataPagamente) {
        this.dataPagamente = dataPagamente;
    }
}
