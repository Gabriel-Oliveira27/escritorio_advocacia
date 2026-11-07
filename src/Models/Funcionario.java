package Models;

public class Funcionario {

    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private double salario;


    public Funcionario(String nome, String cpf, String endereco, String telefone, double salario){

        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.salario = salario;

    }

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public String getEndereco(){
        return endereco;
    }

    public String getTelefone(){
        return telefone;
    }

    public double getSalario(){
        return salario;
    }

    public void exibirDados(){
        System.out.println("--- Informações do Funcionário ---");
        System.out.println("Nome: "+ getNome());
        System.out.println("CPF: "+ getCpf());
        System.out.println("Endereço: "+ getEndereco());
        System.out.println("Telefone: "+ getTelefone());
        System.out.println("Salário: "+ getSalario());
    }

}