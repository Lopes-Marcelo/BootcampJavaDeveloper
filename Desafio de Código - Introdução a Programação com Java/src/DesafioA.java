import java.util.Scanner;

public class DesafioA {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
    
        int a = leitor.nextInt();
        int b = leitor.nextInt();
    
        int X = a + b;
    
        System.out.println("X = " + X);
    
        leitor.close();
    }
}
