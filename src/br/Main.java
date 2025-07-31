package br;

public class Main {
  public static void main(String[] args) {

    // Funcionário 1: com hospedagem, dias <= 7
    Reembolso r1 = new Reembolso("Carla", 4);
    double total1 = r1.calcularReembolso(150, 75, 310);
    r1.imprimirResumoDoReembolso(total1);



  }
}