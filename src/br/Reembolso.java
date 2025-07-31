package br;

public class Reembolso {

  private String nomeFuncionario;
  private int diasTrabalhados;

  //CONSTRUTOR
  public Reembolso(String nomeFuncionario, int diasTrabalhados) {
    this.nomeFuncionario = nomeFuncionario;
    this.diasTrabalhados = diasTrabalhados;
  }

  //METODO- REEMBOLSO INCLUINDO HOSPEDAGEM
  public double calcularReembolso(double alimentacao, double transporte, double hospedagem) {
    return alimentacao + transporte + hospedagem;
  }

  //SOBRECARGA - REEMBOLSO SEM HOSPEDAGEM
  public double calcularReembolso(double alimentacao, double transporte) {
    return alimentacao + transporte;
  }

  public void imprimirResumoDoReembolso(double valorTotal) {
    if (diasTrabalhados > 7) {
      valorTotal *= 1.20; // Po professor da um bonus maior pro cara :)
    }
    System.out.printf("Funcionário: %s - Dias trabalhados: %d - Reembolso total:  R$ %.2f%n",
        nomeFuncionario, diasTrabalhados, valorTotal);

  }

  //GETTERS E SETTERS
  public String getNomeFuncionario() {
    return nomeFuncionario;
  }

  public void setNomeFuncionario(String nomeFuncionario) {
    this.nomeFuncionario = nomeFuncionario;
  }

  public int getDiasTrabalhados() {
    return diasTrabalhados;
  }

  public void setDiasTrabalhados(int diasTrabalhados) {
    this.diasTrabalhados = diasTrabalhados;
  }



}


