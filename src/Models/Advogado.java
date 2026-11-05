package Models;

public class Advogado extends Funcionario {
    private String numeroOab;
    private String especialidade;
    private int quantidadeProcessos;

    public Advogado(String nome, String cpf, String endereco, String telefone, double salario, String numeroOab, String especialidade, int quantidadeProcessos){
        super(nome, cpf, endereco, telefone, salario);
        this.numeroOab = numeroOab;
        this.especialidade = especialidade;
        this.quantidadeProcessos = quantidadeProcessos;
    }

    public String getNumeroOab(){
        return numeroOab;
    }

    public String getEspecialidade(){
        return especialidade;
    }

    public int getQuantidadeProcessos(){
        return quantidadeProcessos;
    }

    public void exibirAdvogado(){
        exibirDados();
        System.out.println("--- Mais informações ---");
        System.out.println("Número OAB: "+ getNumeroOab());
        System.out.println("Especialidade: "+ getEspecialidade());
        System.out.println("Quantidade de processos: "+ getQuantidadeProcessos());
        System.out.println("----------------------------");
    }

    public void exibirDadosProfissionais(){
        System.out.println("Nome do Advogado: " + getNome());
        System.out.println("Número OAB: " + getNumeroOab());
        System.out.println("Especialidade: " + getEspecialidade());
        System.out.println("Quantidade de processos: " + getQuantidadeProcessos());

    }

}
