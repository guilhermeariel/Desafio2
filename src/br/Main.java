package br;

public class Main {
  public static void main(String[] args) {

    // Funcionario 1: com hospedagem
    Reembolso r1 = new Reembolso("Carla", 4);
    double total1 = r1.calcularReembolso(200, 45, 410);
    r1.imprimirResumoDoReembolso(total1);

    // Funcionario 2: sem hospedagem
    Reembolso r2 = new Reembolso("Jubileu", 7);
    double total = r2.calcularReembolso(150, 75);
    r2.imprimirResumoDoReembolso(total);



  }
}