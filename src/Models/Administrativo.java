package Models;

public class Administrativo extends Funcionario {

    private String setor;
    private String cargo;
    private String horarioTrabalho;

    public Administrativo (String nome, String cpf, String endereco, String telefone, double salario, String setor, String cargo, String horarioTrabalho){
        super(nome, cpf, endereco, telefone, salario);
        this.setor = setor;
        this.cargo = cargo;
        this.horarioTrabalho = horarioTrabalho;
    }

    public String getSetor() {
        return setor;
    }

    public String getCargo() {
        return cargo;
    }

    public String getHorarioTrabalho() {
        return horarioTrabalho;
    }

    public void exibirDadosSetor(){
        System.out.println("Nome: " + getNome());
        System.out.println("Setor: " + getSetor());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Horário de expediente: " + getHorarioTrabalho());
    }
}
