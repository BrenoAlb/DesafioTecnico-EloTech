package org.example;
import exercicios.*;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int escolha = -1;

        do {
            try {
                System.out.println("Escolha um dos exercícios para testar:");
                System.out.println("1. Exercicio-1");
                System.out.println("2. Exercicio-2");
                System.out.println("3. Exercicio-3");
                System.out.println("4. Exercicio-4");
                System.out.println("5. Exercicio-5");
                System.out.println("6. Exercicio-6");
                System.out.println("0. Sair");
                System.out.print("Digite o número do exercício: ");
                escolha = scanner.nextInt();
                scanner.nextLine();

                switch (escolha) {
                    case 1:
                        Executar.executarExercicio(Exercicio1::Exercicio1);
                        break;
                    case 2:
                        Executar.executarExercicio(Exercicio2::Exercicio2);
                        break;
                    case 3:
                        Executar.executarExercicio(Exercicio3::Exercicio3);
                        break;
                    case 4:
                        Executar.executarExercicio(Exercicio4::Exercicio4);
                        break;
                    case 5:
                        Executar.executarExercicio(Exercicio5::Exercicio5);
                        break;
                    case 6:
                        Exercicio6.Exercicio6();
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Escolha inválida. Por favor, tente novamente.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.nextLine();
            } catch (NoSuchElementException e) {
                System.out.println("Entrada não encontrada. O programa será encerrado.");
                break;
            } catch (Exception e) {
                System.out.println(STR."Ocorreu um erro: \{e.getMessage()}");
                break;
            }
        } while (escolha != 0);

        System.out.println("Programa encerrado.");

    }

}
