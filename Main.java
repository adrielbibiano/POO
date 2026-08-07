public class Main {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.idade = 12;
        p.nome = "Guiby";
        p.cpf = "16102014000";
        p.distancia = 3;
        //p.distancia = 0;

        System.out.println( p.nome + " de cpf " + p.cpf + "tem idade" + p.idade);
        p.andar();
        //p.andar(d:2);


        
        Pessoa p2 = new Pessoa();
        p2.idade = 32;
        p2.nome = "Adriel";
        p2.cpf = "01234567890";

         System.out.println( p2.nome + " de cpf " + p2.cpf + "tem idade" + p2.idade);

    }

}
