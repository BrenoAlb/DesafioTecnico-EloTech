package exercicios;

import org.example.Main;

public class Exercicio2 {
    public static void Exercicio2() {
        String resposta;
        do {
            System.out.print("Digite o valor do troco: ");
            int valorTroco = Main.scanner.nextInt();
            Main.scanner.nextLine();
            calcularTroco(valorTroco, 100);

            System.out.print("Deseja calcular o troco para outro valor? (sim/não): ");
            resposta = Main.scanner.nextLine();
        } while (resposta.equalsIgnoreCase("sim"));
        System.out.println("Retornando ao menu principal...");
    }

    public static void calcularTroco(int valor, int notaAtual) {
        if (valor <= 0 || notaAtual < 1) {
            return;
        }

        int quantidadeNotas = valor / notaAtual;
        if (quantidadeNotas > 0) {
            System.out.println(STR."Notas de R$\{notaAtual},00: \{quantidadeNotas}");
            valor -= quantidadeNotas * notaAtual;
        }

        // Define a próxima nota que será utilizada
        int proximaNota = notaAtual;
        switch (notaAtual) {
            case 100:
                proximaNota = 50;
                break;
            case 50:
                proximaNota = 20;
                break;
            case 20:
                proximaNota = 10;
                break;
            case 10:
                proximaNota = 5;
                break;
            case 5:
                proximaNota = 2;
                break;
            case 2:
                proximaNota = 1;
                break;
        }

        calcularTroco(valor, proximaNota); // Chamada recursiva para próxima nota
    }
}
