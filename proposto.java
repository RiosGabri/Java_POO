import java.util.Scanner;
public class proposto {
    private static final Scanner ENTRADA = new Scanner(System.in);
    public static void main(String[] args) {
        double nota1 = lerNota("Digite a nota da unidade 1 (0 a 10): ");
        double nota2 = lerNota("Digite a nota da unidade 2 (0 a 10): ");
        int faltas = lerFaltas("Digite a quantidade de faltas: ");

        if (faltas > 15) {
            System.out.println("\nStatus: REPROVADO POR FALTA");
            return;
        }
        double mediaUnidade = (nota1 + nota2) / 2.0;
        double mediaFinal = mediaUnidade;
        String status;

        if (mediaUnidade >= 7.0) {
            status = "APROVADO POR MÉDIA";
        } else if (mediaUnidade < 3.0) {
            status = "REPROVADO DIRETO";
        } else {
            double notaFinal = lerNota("Digite a nota da final (0 a 10): ");
            mediaFinal = (mediaUnidade + notaFinal) / 2.0;

            if (mediaFinal >= 5.0) {
                status = "APROVADO NA FINAL";
            } else {
                status = "REPROVADO NA FINAL";
            }
        }

        System.out.println("\n--- RESULTADO FINAL ---");
        System.out.println("Status: " + status);
        System.out.println("Média Final: " + mediaFinal);
    }

    private static double lerNota(String mensagem) {
        double nota;
        do {
            System.out.print(mensagem);
            nota = ENTRADA.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Informe um valor entre 0 e 10.");
            }
        } while (nota < 0 || nota > 10);
        return nota;
    }
    
    private static int lerFaltas(String mensagem) {
        int faltas;
        do {
            System.out.print(mensagem);
            faltas = ENTRADA.nextInt();
            if (faltas < 0) {
                System.out.println("Quantidade de faltas inválida! Deve ser maior ou igual a 0.");
            }
        } while (faltas < 0);
        return faltas;
    }
}