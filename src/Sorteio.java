import java.util.*;

public class Sorteio {
    private int numeroSorteio;

    private HashSet<Integer> resultado1;
    private HashSet<Integer> resultado2;
    private HashSet<Integer> resultado3;

    private List<Titulo> titulosVendidos;

    private List<Titulo> ganhador1;
    private List<Titulo> ganhador2;
    private List<Titulo> ganhador3;


    public Sorteio(int numeroSorteio) {
        this.numeroSorteio = numeroSorteio;
        this.titulosVendidos = new ArrayList<>();
        this.resultado1 = new HashSet<>();
        this.resultado2 = new HashSet<>();
        this.resultado3 = new HashSet<>();
        this.ganhador1 = new ArrayList<>();
        this.ganhador2 = new ArrayList<>();
        this.ganhador3 = new ArrayList<>();
    }

    public int getNumeroSorteio() {
        return this.numeroSorteio;
    }

    public HashSet<Integer> getResultado(int chaveResultado) {
        switch (chaveResultado){
            case 1:
                return this.resultado1;
            case 2:
                return this.resultado2;
            case 3:
                return this.resultado3;
            default:
                return new HashSet<>();
        }
    }


    public String getResultadosToString(int chaveResultado) {
        HashSet<Integer> retornaResultado = new HashSet<>();
        switch (chaveResultado) {
            case 1:
                retornaResultado = this.resultado1;
            case 2:
                retornaResultado = this.resultado2;
            case 3:
                retornaResultado = this.resultado3;
        }

        return String.join(",", retornaResultado.stream()
                .map(String::valueOf)
                .toArray(String[]::new));
    }

    public void setResultados(int chaveResultado, LinkedHashSet<Integer> resultadoRecebido) {
        switch(chaveResultado){
            case 1 -> this.resultado1 = resultadoRecebido;
            case 2 -> this.resultado2 = resultadoRecebido;
            case 3 -> this.resultado3 = resultadoRecebido;
        }
    }

    public List<Titulo> getGanhador(int numeroRodada){
        switch (numeroRodada){
            case 1:
                return this.ganhador1;
            case 2:
                return this.ganhador2;
            case 3:
                return this.ganhador3;
            default:
                return new ArrayList<>();
        }
    }

    public void setGanhador(int rodada, List<Titulo> ganhadores){
        switch(rodada){
            case 1:
                this.ganhador1 = ganhadores;
            case 2:
                this.ganhador2 = ganhadores;
            case 3:
                this.ganhador3 = ganhadores;
        }
    }

    public List<Titulo> getTitulosVendidos() {
        return this.titulosVendidos;
    }

    public int getNumeroTitulosVendidos(){
        return this.titulosVendidos.size();
    }

    public void setTitulo(Titulo tituloVendido) {
        this.titulosVendidos.add(tituloVendido);
    }

    public void setTitulosLote(int numeroBilhetesVendidos){
        for (int limite = 1; limite <= numeroBilhetesVendidos; limite++){
            setTitulo(new Titulo(Util.geradorPessoa()));
        }
    }
}
