package exercicios;

import org.example.Main;

public class Exercicio3 {
    public static void Exercicio3() {
        String resposta;
        do {
            System.out.print("Digite o capital inicial: ");
            double capital = Main.scanner.nextDouble();
            System.out.print("Digite a taxa de juros (em porcentagem): ");
            double taxaJuros = Main.scanner.nextDouble();
            System.out.print("Digite a quantidade de meses: ");
            int meses = Main.scanner.nextInt();
            Main.scanner.nextLine();

            double montante = calcularJurosCompostos(capital, taxaJuros, meses);
            System.out.printf("O montante após %d meses será de R$ %.2f\n", meses, montante);

            System.out.print("Deseja realizar outro cálculo de juros compostos? (sim/não): ");
            resposta = Main.scanner.nextLine();
        } while (resposta.equalsIgnoreCase("sim"));
        System.out.println("Retornando ao menu principal...");
    }

    public static double calcularJurosCompostos(double capital, double taxaJuros, int meses) {
        return capital * Math.pow(1 + (taxaJuros / 100), meses);
    }
}
