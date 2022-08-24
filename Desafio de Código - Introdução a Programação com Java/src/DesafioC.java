import java.io.IOException;
import java.util.Scanner;

public class DesafioC {
  public static void main(String[] args) throws IOException {
    Scanner teclado = new Scanner(System.in);
    
    int valor1 = teclado.nextInt();
    int valor2 = teclado.nextInt();
    double valor3 = teclado.nextDouble();
    
    double SALARY = valor2 * valor3;
    
    System.out.println("NUMBER = " + valor1);
    System.out.printf("SALARY = U$ %.2f\n",SALARY);

    teclado.close();
  }
}

/*
Desafio:
Precisamos saber quanto uma determinada empresa deve pagar para seus colaboradores, porém temos apenas a quantidade de horas trabalhadas e o valor hora. Escreva um programa que leia o número de um colaborador, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse colaborador. Em seguida, apresente o número e o salário do colaborador, com duas casas decimais.

Entrada
Você receberá 2 números inteiros e 1 número com duas casas decimais, representando o número, quantidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada.

Saída
Exiba o número e o salário do colaborador, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade. No caso do salário, também deve haver um espaço em branco após o $.
 */