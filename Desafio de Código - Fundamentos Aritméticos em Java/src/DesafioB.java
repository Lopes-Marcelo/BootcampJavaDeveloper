import java.io.IOException;
import java.util.Scanner;

public class DesafioB{
    public static void main(String[] args) throws IOException{

        Scanner teclado = new Scanner(System.in);

        int valor = teclado.nextInt();

        for(int i = 1; i <= valor; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
        teclado.close();
    }
}

/*
Desafio:
Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.

Entrada
Você receberá 1 valor inteiro N, onde N > 0.

Saída
Exiba todos os números pares até o valor de entrada, sendo um em cada linha. 
 */