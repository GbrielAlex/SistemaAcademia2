package br.com.SistemaAcadema;

import java.util.Calendar;

public class PessoaFisica {

    private String cpf;
    private String nome;
    private Calendar dataNascimento;
    private String endereco;
    private int NIVELACESSO ;

    public PessoaFisica(String cpf, String nome, Calendar dataNascimento, String endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.NIVELACESSO = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNIVELACESSO(int NIVELACESSO) {
        this.NIVELACESSO = NIVELACESSO;
    }
}
