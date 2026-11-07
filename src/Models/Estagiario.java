package Models;

public class Estagiario extends Funcionario{

    private String instituicaoEnsino;
    private String curso;
    private int semestre;

    public Estagiario (String nome, String cpf, String endereco, String telefone, double salario, String instituicaoEnsino, String curso, int semestre){
        super (nome, cpf, endereco, telefone, salario);
        this.instituicaoEnsino = instituicaoEnsino;
        this.curso = curso;
        this.semestre = semestre;
    }

    public String getInstituicaoEnsino(){
        return instituicaoEnsino;
    }

    public String getCurso(){
        return curso;
    }

    public int getSemestre(){
        return semestre;
    }

    public void exibirDadosAcademicos(){
        System.out.println("--- Informações do Estagiário ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Instituição de ensino: " + getInstituicaoEnsino());
        System.out.println("Curso: " + getCurso());
        System.out.println("Semestre: " + getSemestre());
    }


}