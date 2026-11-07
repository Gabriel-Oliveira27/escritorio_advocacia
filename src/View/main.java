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

        Cliente cliente = new Cliente(
                "Fernanda Simplício",
                "884.442.350-33",
                "(85) 99942-3321",
                "Rua Ernesto Gomes, n° 441"
        );

        Cliente cliente2 = new Cliente(
                "Thiago Fernandes",
                "984.311.031-22",
                "(88) 99411-0042",
                "Aveniada Philadelphia"
        );

        Processo processo = new Processo(
                1,
                "Requerimento trabalhístico de horas trabalhadas em excesso",
                "Trabalhista",
                "Em andamento",
                cliente,
                advogado
        );

        Processo processo2 = new Processo(
                2,
                "Reclamação formal de produto com defeito ou vício oculto vendido",
                "Direito do consumidor",
                "Concluído",
                cliente2,
                advogado2
        );

        Processo processo3 = new Processo(
                3,
                "Solicitação de rescisão direta",
                "Trabalhista",
                "Encerrado",
                cliente2,
                advogado
        );

        advogado.exibirDados();
        advogado.exibirDadosProfissionais();

        advogado2.exibirDados();
        advogado2.exibirDadosProfissionais();

        estagiario.exibirDados();
        estagiario.exibirDadosAcademicos();

        estagiario2.exibirDados();
        estagiario2.exibirDadosAcademicos();

        administrativo.exibirDados();
        administrativo.exibirDadosSetor();

        processo.exibirProcesso();
        processo2.exibirProcesso();
        processo3.exibirProcesso();





    }
}