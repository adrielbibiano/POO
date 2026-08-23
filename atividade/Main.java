
public class Main{

    public static void main(String[] args) {
        
        Filme f = new Filme("O Hobbit", "Fantasia", 2012);
        Filme f2 = new Filme("Relâmpago Mcqueen", "Animação", 2006);

        System.out.println(f.titulo);
        System.out.println(f.genero);
        System.out.println(f.anoLancamento);
        System.out.println(f2.titulo);
        System.out.println(f2.genero);
        System.out.println(f2.anoLancamento);

        Autor a = new Autor("Paulo Coelho", "Estadunidense");
        Livro liv = new Livro("O Alquimista", 1988, a );

        Autor a2 = new Autor("Herman Melville","Estadunidense");
        Livro liv2 = new Livro("Moby Dick",1851,a2);

        System.out.println(liv);
        System.out.println(liv2);
                         
    }
}