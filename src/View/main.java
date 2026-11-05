package View;
import Models.*;

public class main {

    public static void main (String[] args){
        Advogado advogado = new Advogado(
                "Fernando Júnior",
                "445.988.778-89",
                "Trav. Nelson de Souza Alencar, n° 23",
                "(88) 98488-4422",
                4699.80,
                "3331",
                "Processos trabalhistas",
                33
        );

        System.out.println("Advogado criado com sucesso!");
    }
}
