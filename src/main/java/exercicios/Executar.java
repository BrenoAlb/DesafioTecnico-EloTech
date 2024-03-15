package exercicios;

import org.example.Main;

public class Executar {
    public static void executarExercicio(Runnable exercicio) {
        String resposta;
        do {
            exercicio.run();
            System.out.print("Quer testar a função novamente? (sim/não): ");
            resposta = Main.scanner.nextLine();
        } while (resposta.equalsIgnoreCase("sim"));
    }
}
