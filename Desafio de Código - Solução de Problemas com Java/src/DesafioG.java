import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DesafioG {

    static int cargoCapacity;

    class Node {
        Fief destinationFief;
        int weight;

        Node(Fief destinationFief, int weight) {
            this.destinationFief = destinationFief;
            this.weight = weight;
        }
    }

    class Fief {
        double taxQuantity;
        List<Node> edgesList;

        public Fief(int taxQuantity) {
            this.taxQuantity = taxQuantity;
            this.edgesList = new ArrayList<>();
        }

        public void addRoute(Fief destinationFief, int weight) {
            edgesList.add(new Node(destinationFief, weight));
        }

        public int calculateTotalDistance(Fief previousCity) {
            int totalDistance = 0;
            int travelsNumber = 0;

            for (var edge : edgesList) {
                if (edge.destinationFief == previousCity) {
                    continue;
                }

                totalDistance += edge.destinationFief.calculateTotalDistance(this);
                travelsNumber = (int) Math.ceil(edge.destinationFief.taxQuantity / DesafioG.cargoCapacity) * 2;
                totalDistance += travelsNumber * edge.weight;
                this.taxQuantity += edge.destinationFief.taxQuantity;
            }
            return totalDistance;
        }
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n;
        String[] lineArgs;
        lineArgs = teclado.nextLine().split(" ");
        n = Integer.parseInt(lineArgs[0]);
        DesafioG.cargoCapacity = Integer.parseInt(lineArgs[1]);
        List<Fief> cities = new ArrayList<>();
        List<Integer> taxes = new ArrayList<>();

        Arrays.asList(teclado.nextLine().split(" ")).forEach(tax -> {
            taxes.add(Integer.parseInt(tax));
        });

        DesafioG barrasDeOuro = new DesafioG();

        for (int i = 0; i < n; i++) {
            Fief fief = barrasDeOuro.new Fief(taxes.get(i));
            cities.add(fief);
        }
        List<String> graphInfos;
        int a, b, c;

        for (int i = 0; i < taxes.size() - 1; ++i) {
            graphInfos = Arrays.asList(teclado.nextLine().split(" "));
            a = Integer.parseInt(graphInfos.get(0)) - 1;
            b = Integer.parseInt(graphInfos.get(1)) - 1;
            c = Integer.parseInt(graphInfos.get(2));

            cities.get(a).addRoute(cities.get(b), c);
            cities.get(b).addRoute(cities.get(a), c);
        }
        System.out.println(cities.get(0).calculateTotalDistance(null));

        teclado.close();
    }
}

/*
Desafio:
O feudo da Mesopot??mia ?? rico e o povo ?? cordial e alegre. Mas quando o assunto s??o impostos, ?? praticamente um roubo. Todo final de ano, cada feudo do pa??s deve pagar uma determinada quantidade de quilos de ouro em impostos. Quando ?? chegado o momento de coletar os impostos, o Rei envia sua carruagem real para recolher o ouro devido, usando as estradas do reino.

Cada estrada liga dois feudos diferentes e podem ser percorridos em duas dire????es. Com as estradas ?? poss??vel ir de um feudo a outro, possivelmente passando por feudos intermedi??rios. Mas h?? apenas um caminho entre dois feudos diferentes.

Em cada feudo h?? um cofre real, utilizado para armazenamento do ouro de impostos. Os cofres reais s??o imensos, de forma que cada cofre tem capacidade de armazenar todo o ouro devido por todo o reino. A carruagem sai do feudo principal, percorrendo as estradas do reino, visitando os feudos para recolher o ouro devido, podendo usar qualquer cofre real para armazenar temporariamente uma parte do imposto recolhido, se necess??rio. Ao final da coleta, todo o ouro devido por todas os feudos devem estar armazenados no cofre real do feudo principal.

Jos?? como ?? o Rei, contratou o seu time para, dados a quantidade de ouro a ser recolhido em cada feudo (em kg), a lista das estradas do reino, com os respectivos comprimentos (em km) e a capacidade de carga da carruagem real (em kg), determine qual ?? a m??nima dist??ncia que a carruagem deve percorrer para recolher todo o ouro devido.

Entrada
A primeira linha cont??m dois inteiros N e C indicando respectivamente o n??mero de cidades e a capacidade de carga da carruagem (2 ??? N ??? 104 e 1 ??? C ??? 100). O feudo principal ?? identificado pelo n??mero 1 e os outros feudos s??o identificadas por inteiros de 2 a N . A segunda linha cont??m N inteiros Ei representando a quantidade de imposto devido por cada feudo i (0 ??? Ei ??? 100 para 1 ??? i ??? N ). Cada uma das N-1 linhas seguintes cont??m tr??s inteiros A , B e C , indicando que uma estrada liga o feudo A e o feudo B (1 ??? A, B ??? N ) e tem comprimento C (1 ??? C ??? 100).

Sa??da
Seu programa deve produzir uma ??nica linha com um inteiro representando a menor dist??ncia que a carruagem real deve percorrer para recolher todo o imposto devido, em km.
 */