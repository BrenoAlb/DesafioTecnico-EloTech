package exercicios;

import org.example.Main;

public class Exercicio1 {
    public static void Exercicio1() {
        String resposta;
        do {
            System.out.print("Digite uma palavra para inverter: ");
            String palavra = Main.scanner.nextLine();
            String palavraInvertida = new StringBuilder(palavra).reverse().toString();
            System.out.println(STR."Palavra invertida: \{palavraInvertida}");

            System.out.print("Deseja inverter outra palavra? (sim/não): ");
            resposta = Main.scanner.nextLine();
        } while (resposta.equalsIgnoreCase("sim"));
        System.out.println("Retornando ao menu principal...");
    }
}
