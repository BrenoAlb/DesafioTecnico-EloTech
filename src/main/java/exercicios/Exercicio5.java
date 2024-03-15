package exercicios;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Exercicio5 {
    private static final Scanner scanner = new Scanner(System.in);
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy");
    private static int ultimoId = 2; // Inicializa com o último ID conhecido

    public static void Exercicio5() {
        List<Pessoa> listaPessoas = new ArrayList<>();
        listaPessoas.add(new Pessoa(1, "Pessoa Um", LocalDate.of(1990, 1, 1)));
        listaPessoas.add(new Pessoa(2, "Pessoa Dois", LocalDate.of(1992, 2, 2)));

        boolean sair = false;
        while (!sair) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar usuário");
            System.out.println("2 - Listar todos os usuários");
            System.out.println("0 - Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (opcao) {
                case 1:
                    adicionarUsuario(listaPessoas);
                    break;
                case 2:
                    listarUsuarios(listaPessoas);
                    break;
                case 0:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    private static void adicionarUsuario(List<Pessoa> lista) {
        System.out.println("Digite o nome do usuário:");
        String nome = scanner.nextLine();

        LocalDate dataNascimento = null;
        while (dataNascimento == null) {
            System.out.println("Digite a data de nascimento no formato dd/mm/aa:");
            String data = scanner.nextLine();
            try {
                dataNascimento = LocalDate.parse(data, dtf);
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida. Tente novamente.");
            }
        }

        ultimoId++;
        Pessoa novaPessoa = new Pessoa(ultimoId, nome, dataNascimento);
        lista.add(novaPessoa);
        System.out.println("Usuário adicionado com sucesso!");
    }

    private static void listarUsuarios(List<Pessoa> lista) {
        lista.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Exercicio5();
    }
}