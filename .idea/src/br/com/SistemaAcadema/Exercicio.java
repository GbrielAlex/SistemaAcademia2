package br.com.SistemaAcadema;

public class Exercicio {

    private Maquina maquina;
    private int repeticoes;

    private int series;
    private int codigoExercicio;

    public Exercicio(Maquina maquina, int repeticoes, int series, int codigoExercicios) {
        this.maquina = maquina;
        this.repeticoes = repeticoes;
        this.series = series;
        this.codigoExercicio = codigoExercicios;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getCodigoExercicios() {
        return codigoExercicio;
    }


}
