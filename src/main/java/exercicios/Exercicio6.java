package exercicios;

import java.util.Scanner;

public class Exercicio6 {

    public static void Exercicio6() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor para a soma:");
        int valor1Soma = scanner.nextInt();
        System.out.println("Digite o segundo valor para a soma:");
        int valor2Soma = scanner.nextInt();

        TCalculoSoma soma = new TCalculoSoma();
        soma.setValor1(valor1Soma);
        soma.setValor2(valor2Soma);
        System.out.println(STR."Soma: \{soma.Calcular()}");

        System.out.println("Digite o primeiro valor para a multiplicação:");
        int valor1Multiplicacao = scanner.nextInt();
        System.out.println("Digite o segundo valor para a multiplicação:");
        int valor2Multiplicacao = scanner.nextInt();

        TCalculoMultiplicacao multiplicacao = new TCalculoMultiplicacao();
        multiplicacao.setValor1(valor1Multiplicacao);
        multiplicacao.setValor2(valor2Multiplicacao);
        System.out.println(STR."Multiplicação: \{multiplicacao.Calcular()}");

        System.out.println("Digite o valor para o cálculo fatorial:");
        int valorFatorial = scanner.nextInt();

        TCalculoFatorial fatorial = new TCalculoFatorial();
        fatorial.setValor1(valorFatorial);
        System.out.println("Fatorial: " + fatorial.Calcular());

    }

    abstract static class TCalculo {
        public abstract int Calcular();
    }

    static class TCalculoValor extends TCalculo {
        public int Valor1;
        public int Valor2;

        public void setValor1(int valor1) {
            if (valor1 == 0) {
                throw new IllegalArgumentException("Valor1 não pode ser vazio");
            }
            this.Valor1 = valor1;
        }

        public void setValor2(int valor2) {
            if (valor2 == 0) {
                throw new IllegalArgumentException("Valor2 não pode ser vazio");
            }
            this.Valor2 = valor2;
        }

        @Override
        public int Calcular() {
            return 0;
        }
    }

    static class TCalculoSoma extends TCalculoValor {
        @Override
        public int Calcular() {
            return Valor1 + Valor2;
        }
    }

    static class TCalculoMultiplicacao extends TCalculoValor {
        @Override
        public int Calcular() {
            return Valor1 * Valor2;
        }
    }

    static class TCalculoFatorial extends TCalculoValor {
        private int fatorial(int n) {
            if (n <= 1) {
                return 1;
            }
            return n * fatorial(n - 1);
        }

        @Override
        public int Calcular() {
            return fatorial(Valor1) * fatorial(Valor2);
        }
    }
}
