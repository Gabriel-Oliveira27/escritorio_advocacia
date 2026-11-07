package Models;

public class Cliente {

    private String nomeCliente;
    private String cpfCliente;
    private String telefoneCliente;
    private String enderecoCliente;


    public Cliente (String nomeCliente, String cpfCliente, String telefoneCliente, String enderecoCliente){
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.telefoneCliente = telefoneCliente;
        this.enderecoCliente = enderecoCliente;

    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void exibirDadosCliente(){
        System.out.println("Nome: " + getNomeCliente());
        System.out.println("CPF: " + getCpfCliente());
        System.out.println("Telefone: " + getTelefoneCliente());
        System.out.println("Endereço: " + getEnderecoCliente());
    }
}