package View;
import Models.*;

public class main {

    public static void main (String[] args){
        Advogado advogado = new Advogado(
                "Ana Felix",
                "445.988.778-89",
                "Trav. Nelson de Souza Alencar, n° 23",
                "(88) 98488-4422",
                4699.80,
                "OAB/CE 49.665",
                "Direito do Trabalho",
                33
        );

        System.out.println("Advogado criado com sucesso: " + advogado.getNome());

        Advogado advogado2 = new Advogado(
                "Matheus Silva",
                "887.445.325-12",
                "Rua José de Oliveira, n° 93",
                "(88) 98844-7588",
                6579.00,
                "OAB/CE 50.332",
                "Direito do Consumidor",
                320
        );

        System.out.println("Advogado criado com sucesso: " + advogado2.getNome());


        Estagiario estagiario = new Estagiario(
                "Jeniffer Souza",
                "122.445.443-54",
                "Rua dos Montes, n° 32",
                "(88) 98432-9930",
                2299.00,
                "Universidade Federal do Ceará",
                "Direito",
                4
        );

        System.out.println("Estagiário criado: " + estagiario.getNome());

        Estagiario estagiario2 = new Estagiario(
                "Jefferson Carlos",
                "883.331.983-00",
                "Rua Alberto Fernantes, n° 231",
                "(88) 98993-0930",
                2299.00,
                "Universidade Estadual Vale do Acaraú",
                "Administração",
                5
        );

        System.out.println("Estagiário criado: " + estagiario2.getNome());

        Administrativo administrativo = new Administrativo(
                "Alessandro Rocha",
                "887.554.639-99",
                "Rua Belmiro Montes, n° 331",
                "(85) 98833-9884",
                6599.00,
                "Departamento Pessoal",
                "Gestor",
                "Horário Comercial (8:00 - 18:00)"
        );



    }
}