package cinemafeedback;

/**
 *
 * @author beatris
 */
import java.util.Scanner;

public class CinemaFeedback {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalEspectadores = 40;
        int countOtimo = 0;
        int countRuim = 0;
        int idadeRuim = 0;
        int countIdadeRuim = 0;
        int countPessimo = 0;
        int somaNotas = 0;

        for (int i = 0; i < totalEspectadores; i++) {
            System.out.print("Digite a idade do espectador " + (i + 1) + ": ");
            int idade = scanner.nextInt();
            System.out.print("Digite a opinião do espectador " + (i + 1) + " (A - Ótimo, B - Bom, C - Regular, D - Ruim, E - Péssimo): ");
            char opiniao = scanner.next().charAt(0);

            // Contabiliza as opiniões
            switch (opiniao) {
                case 'A':
                case 'a':
                    countOtimo++;
                    somaNotas += 5;
                    break;
                case 'B':
                case 'b':
                    somaNotas += 4;
                    break;
                case 'C':
                case 'c':
                    somaNotas += 3;
                    break;
                case 'D':
                case 'd':
                    countRuim++;
                    idadeRuim += idade;
                    countIdadeRuim++;
                    somaNotas += 2;
                    break;
                case 'E':
                case 'e':
                    countPessimo++;
                    somaNotas += 1;
                    break;
                default:
                    System.out.println("Opinião inválida!");
            }
        }

        // Cálculos finais
        double mediaIdadeRuim = countIdadeRuim > 0 ? (double) idadeRuim / countIdadeRuim : 0;
        double porcentagemPessimo = (double) countPessimo / totalEspectadores * 100;
        double mediaGeralNotas = (double) somaNotas / totalEspectadores;

        // Exibição dos resultados
        System.out.println("Quantidade de respostas 'Ótimo': " + countOtimo);
        System.out.println("Média de idade das pessoas que responderam 'Ruim': " + mediaIdadeRuim);
        System.out.printf("Porcentagem de respostas 'Péssimo': %.2f%%\n", porcentagemPessimo);
        System.out.printf("Média geral das notas: %.2f\n", mediaGeralNotas);

        scanner.close();
    }
}