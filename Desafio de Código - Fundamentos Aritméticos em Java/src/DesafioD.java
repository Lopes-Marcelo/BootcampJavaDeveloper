import java.io.IOException;
import java.util.Scanner;

public class DesafioD{
 
    public static void main(String[] args) throws IOException {
 
        Scanner teclado = new Scanner(System.in);
        int valor = teclado.nextInt();

        int n100 = valor / 100;
        int n50 = ((valor) - (n100 * 100)) / 50;
        int n20 = ((valor) - (n100 * 100 + n50 * 50)) / 20;
        int n10 = ((valor) - (n100 * 100 + n50 * 50 + n20 * 20)) / 10;
        int n5 = ((valor) - (n100 * 100 + n50 * 50 + n20 * 20 + n10 * 10)) / 5;
        int n2 = ((valor) - (n100 * 100 + n50 * 50 + n20 * 20 + n10 * 10 + n5 * 5)) / 2;
        int n1 = ((valor) - (n100 * 100 + n50 * 50 + n20 * 20 + n10 * 10 + n5 * 5 + n2 * 2)) / 1;

        System.out.println(valor);
        System.out.println(n100 + " nota(s) de R$ 100,00");
        System.out.println(n50 + " nota(s) de R$ 50,00");
        System.out.println(n20 + " nota(s) de R$ 20,00");
        System.out.println(n10 + " nota(s) de R$ 10,00");
        System.out.println(n5 + " nota(s) de R$ 5,00");
        System.out.println(n2 + " nota(s) de R$ 2,00");
        System.out.println(n1 + " nota(s) de R$ 1,00");
        teclado.close();
    }
}

/*
Desafio:
Faça a leitura de um valor inteiro. Em seguida, calcule o menor número de notas possíveis (cédulas) onde o valor pode ser decomposto. As notas que você deve considerar são de 100, 50, 20, 10, 5, 2 e 1. Na sequência mostre o valor lido e a relação de notas necessárias.

Entrada
Você receberá um valor inteiro N (0 < N < 1000000).

Saída
Exiba o valor lido e a quantidade mínima de notas de cada tipo necessárias, seguindo o exemplo de saída abaixo. Após cada linha deve ser imprimido o fim de linha.
 */