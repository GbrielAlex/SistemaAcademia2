package br.com.SistemaAcadema;

import java.util.LinkedList;

public class TreinoPersonalizado {

    private Cliente cliente;
    private Funcionario funcionario;
    private LinkedList<Exercicio> listaExecicios;

    public TreinoPersonalizado(Cliente cliente, Funcionario funcionario) {
        this.cliente = cliente;
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void addExercicio(Exercicio exercicio){
        if (!listaExecicios.contains(exercicio)){
            listaExecicios.add(exercicio);
        }
    }

    public void removerExercicio(Exercicio exercicio){
        listaExecicios.remove(exercicio);
    }

}
