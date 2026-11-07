package Models;

public class Processo {

    private int numero;
    private String descricao;
    private String areaDireito;
    private String status;
    private Cliente cliente;
    private Advogado advogadoResponsavel;

    public Processo(int numero, String descricao, String areaDireito, String status, Cliente cliente, Advogado advogadoResponsavel){
        this.numero = numero;
        this.descricao = descricao;
        this.areaDireito = areaDireito;
        this.status = status;
        this.cliente = cliente;
        this.advogadoResponsavel = advogadoResponsavel;


    }

    public int getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getAreaDireito() {
        return areaDireito;
    }

    public String getStatus() {
        return status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Advogado getAdvogadoResponsavel() {
        return advogadoResponsavel;
    }

    public void exibirProcesso(){
        System.out.println("Número do processo: " + getNumero());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Área: " + getAreaDireito());
        System.out.println("Status: " + getStatus());
        System.out.println("Cliente: " + getCliente());
        System.out.println("Advogado: " + getAdvogadoResponsavel());
    }
}