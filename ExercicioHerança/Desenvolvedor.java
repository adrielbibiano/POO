public class Desenvolvedor extends Funcionario{
    private String linguagemPrincipal;

public Desenvolvedor(String nome, String cpf, Double salario, String linguagemPrincipal){
    super(nome, salario,cpf);
    this.linguagemPrincipal = linguagemPrincipal;
}
@Override
public void exibirDados(){
    super.exibirDados();
    System.out.println("Linguagem Principal: " + linguagemPrincipal);
}
}