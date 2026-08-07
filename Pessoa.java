public class Pessoa{
    int idade;
    String nome;
    String cpf;
    int distancia;

    void andar(){
        //distancia = distancia + d;
        System.out.println("Andou" + distancia + "KM");
    }

    void dormir(){
        System.out.println("Dormiu");
    }

    void aniversario(){
        idade = idade +1;
    }
    
}
