package exercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Pessoa {
    private int idpessoa;
    private String nome;
    private LocalDate datanascimento;
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // Construtor
    public Pessoa(int idpessoa, String nome, LocalDate datanascimento) {
        this.idpessoa = idpessoa;
        this.nome = nome;
        this.datanascimento = datanascimento;
    }

    // Métodos getters
    public int getIdpessoa() {
        return idpessoa;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDatanascimento() {
        return datanascimento;
    }

    // Método para retornar os dados no formato especificado
    @Override
    public String toString() {
        return STR."\{idpessoa} - \{nome} - \{datanascimento.format(dtf)}";
    }

}
