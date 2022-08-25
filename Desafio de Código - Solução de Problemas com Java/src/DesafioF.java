import java.util.Scanner;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class DesafioF{
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        BigDecimal currentNum, resultNum;
        String operator;
        String[] lineArgs;
        int N;
        N = Integer.parseInt(teclado.nextLine());
        resultNum = new BigDecimal("1.0");

        for (int i = 0; i < N; ++i) {
            lineArgs = teclado.nextLine().trim().split(" ");

            currentNum = new BigDecimal(lineArgs[0]);
            operator = lineArgs[1];

            if (operator.equals("*")) {
                resultNum = resultNum.multiply(currentNum);
            } else if (operator.equals("/")) {
                resultNum = resultNum.divide(currentNum, MathContext.DECIMAL128);
            }
        }

        System.out.println(resultNum.setScale(0, RoundingMode.DOWN));

        teclado.close();
    }
}