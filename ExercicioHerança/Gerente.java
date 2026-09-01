public class Gerente extends Funcionario{
    private String departamento;

public Gerente(String nome, String cpf, Double salario, String departamento){
    super(nome, salario, cpf);
    this.departamento = departamento;
}
@Override
public void exibirDados(){
    super.exibirDados();
    System.out.println("Departamento: " + departamento);
}
}