import java.io.IOException;
import java.util.Scanner;
 
public class DesafioA{
    public static void main(String[] args) throws IOException{
       
        Scanner teclado = new Scanner(System.in);
       
        int Pos = 0;
        for (int i = 0; i < 6; i++){
            double valor = teclado.nextDouble();
            if(valor > 0)Pos++;
        }
 
        System.out.println("" + Pos + " valores positivos");

        teclado.close();
    }
}

/*
Desafio:
Crie um programa que leia 6 valores, os quais poderão ser negativos e/ou positivos. Em seguida, apresente a quantidade de valores positivos digitados.

Entrada
Você receberá seis valores, negativos e/ou positivos.

Saída
Exiba uma mensagem dizendo quantos valores positivos foram lidos. assim como é exibido abaixo no exemplo de saída. Não se esqueça de incluir na mensagem de saída o sufixo " valores positivos"
 */