import java.util.*;

public class Titulo {
    private int numeroTitulo;

    private String nomeTitular;

    private Set<Integer> numerosSorteio1;
    private Set<Integer> numerosSorteio2;
    private Set<Integer> numerosSorteio3;

    public Titulo(String pessoa){
        this.numeroTitulo = new Random().nextInt(1,1000000);
        this.nomeTitular = pessoa;
        this.numerosSorteio1 = Util.geradorNumeros(20);
        this.numerosSorteio2 = Util.geradorNumeros(20);
        this.numerosSorteio3 = Util.geradorNumeros(20);
    }

    public void informacoesTitulo(){
        System.out.println("N° do certificado: " + this.numeroTitulo);
        System.out.println("Titular: " + this.nomeTitular);
        System.out.println("Números para o Sorteio 1: " + this.numerosSorteio1.toString());
        System.out.println("Números para o Sorteio 2: " + this.numerosSorteio2.toString());
        System.out.println("Números para o Sorteio 3: " + this.numerosSorteio3.toString());
        System.out.printf("--------------------------------------------------------\n");
    }

    public void informacoesTituloFormatado(){
        List<Integer> sorteio1AsList = new ArrayList<>(this.numerosSorteio1);
        List<Integer> sorteio2AsList = new ArrayList<>(this.numerosSorteio2);
        List<Integer> sorteio3AsList = new ArrayList<>(this.numerosSorteio3);
        System.out.printf("--------------------------------------------------------\n");
        System.out.println("                       Seu título                       ");
        System.out.printf("               N° do certificado: %06d                \n", this.numeroTitulo);

        String titularTexto = "Titular: " + this.nomeTitular;
        int calculo = (56 - titularTexto.length())/2;
        String titularFormatado = " ".repeat(calculo) + titularTexto + " ".repeat(calculo);

        System.out.println(titularFormatado);

        System.out.printf("│    RODADA 1    │ │    RODADA 2    │ │    RODADA 3    │\n");
        System.out.printf("│ %02d %02d %02d %02d %02d │ │ %02d %02d %02d %02d %02d │ │ %02d %02d %02d %02d %02d │\n", sorteio1AsList.get(0),sorteio1AsList.get(1),sorteio1AsList.get(2),sorteio1AsList.get(3),sorteio1AsList.get(4),sorteio2AsList.get(0),sorteio2AsList.get(1),sorteio2AsList.get(2),sorteio2AsList.get(3),sorteio2AsList.get(4), sorteio3AsList.get(0),sorteio3AsList.get(1),sorteio3AsList.get(2),sorteio3AsList.get(3),sorteio3AsList.get(4));

        System.out.printf("│ %02d %02d %02d %02d %02d │ │ %02d %02d %02d %02d %02d │ │ %02d %02d %02d %02d %02d │\n", sorteio1AsList.get(5),sorteio1AsList.get(6),sorteio1AsList.get(7),sorteio1AsList.get(8),sorteio1AsList.get(9), sorteio2AsList.get(5),sorteio2AsList.get(6),sorteio2AsList.get(7),sorteio2AsList.get(8),sorteio2AsList.get(9), sorteio3AsList.get(5),sorteio3AsList.get(6),sorteio3AsList.get(7),sorteio3AsList.get(8),sorteio3AsList.get(9));

        System.out.printf("│ %02d %02d %02d %02d %02d │ │ %02d %02d %02d %02d %02d │ │ %02d %02d %02d %02d %02d │\n", sorteio1AsList.get(10),sorteio1AsList.get(11),sorteio1AsList.get(12),sorteio1AsList.get(13),sorteio1AsList.get(14), sorteio2AsList.get(10),sorteio2AsList.get(11),sorteio2AsList.get(12),sorteio2AsList.get(13),sorteio2AsList.get(14), sorteio3AsList.get(10),sorteio3AsList.get(11),sorteio3AsList.get(12),sorteio3AsList.get(13),sorteio3AsList.get(14));

        System.out.printf("│ %02d %02d %02d %02d %02d │ │ %02d %02d %02d %02d %02d │ │ %02d %02d %02d %02d %02d │\n", sorteio1AsList.get(15),sorteio1AsList.get(16),sorteio1AsList.get(17),sorteio1AsList.get(18),sorteio1AsList.get(19), sorteio2AsList.get(15),sorteio2AsList.get(16),sorteio2AsList.get(17),sorteio2AsList.get(18),sorteio2AsList.get(19), sorteio3AsList.get(15),sorteio3AsList.get(16),sorteio3AsList.get(17),sorteio3AsList.get(18),sorteio3AsList.get(19));

        System.out.printf("--------------------------------------------------------\n");
    }

    public int getNumeroTitulo() {
        return numeroTitulo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public Set<Integer> getSorteio1() {
        return numerosSorteio1;
    }

    public Set<Integer> getSorteio2() {
        return numerosSorteio2;
    }

    public Set<Integer> getSorteio3() {
        return numerosSorteio3;
    }
}
