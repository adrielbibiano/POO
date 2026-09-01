public class Projeto{
    private String nome;
    private String descricao;
    private String desenvolvedorResponsavel;

public Projeto(String nome, String descricao, String desenvolvedorResponsavel){
    this.nome = nome;
    this.descricao = descricao;
    this.desenvolvedorResponsavel = desenvolvedorResponsavel;
}
public void setNomePjt(String nome){
    this.nome = nome;
}
public String getNomePjt(){
    return this.nome;
}
public void setDescricao(String nome){
    this.descricao = descricao;
}
public String getDescricao(){
    return this.descricao;
}
public void setDesenvolvedorResponsavel(String nome){
    this.desenvolvedorResponsavel = desenvolvedorResponsavel;
}
public String getDesenvolvedorResponsavel(){
    return this.desenvolvedorResponsavel;
}
public void exibirProjeto() {
    System.out.println("Projeto: " + nome);
    System.out.println("Descrição: " + descricao);
    System.out.println("Responsável: " + desenvolvedorResponsavelesponsavel.getNome());
    }
}