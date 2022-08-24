import java.io.IOException;
import java.util.Scanner;

public class DesafioC{
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int par = 0;
        int impar = 0;
        int pos = 0;
        int neg = 0;

        for(int i = 0; i < 5; i++){
            int valor = leitor.nextInt();
            if(valor % 2 == 0){
                par++;
            } else{
                impar++;
            }
            if(valor > 0 && valor != 0){
                pos++;
            } else if (valor < 0 && valor != 0){
                neg++;
            }
        }

        System.out.println( par + " par(es)");
        System.out.println( impar + " impar(es)");
        System.out.println( pos + " positivo(s)");
        System.out.println( neg + " negativo(s)");

        leitor.close();
    }
}

/*
Desafio:
Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados são pares, quantos valores informados são ímpares, quantos valores informados são positivos e quantos valores informados são negativos. Considere que o número zero é positivo, mas não pode ser considerado como positivo ou negativo.

Entrada
Você receberá 5 valores inteiros.

Saída
Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por linha e não esquecendo o final de linha após cada uma.
 */