import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Sorteador {

    public Sorteador(Sorteio sorteio, Titulo tituloDoUsuario) throws InterruptedException {

            System.out.printf("Criando %d de bilhetes concorrentes. Isso pode levar alguns segundos.\n\n", Config.numeroBilhetesVendidos);
            sorteio.setTitulosLote(Config.numeroBilhetesVendidos - 1);
            sorteio.setTitulo(tituloDoUsuario);

            for (int numeroRodada = 1; numeroRodada <= 3; numeroRodada++) {
                iniciarRodada(numeroRodada, sorteio);
            }
    }

    public void iniciarRodada(int numeroRodada, Sorteio sorteio) throws InterruptedException {
        boolean temGanhador = false;
        System.out.println("INICIANDO RODADA " + numeroRodada);
        TimeUnit.SECONDS.sleep(3);
        HashSet<Integer> sorteioTemporario = new LinkedHashSet<Integer>();
        List<Titulo> listaGanhadores = new ArrayList<>();

        do {
            int numeroSorteado = Util.geradorNumero(1);

            if (!sorteioTemporario.contains(numeroSorteado)){
                sorteioTemporario.add(numeroSorteado);
                System.out.printf("%d ",numeroSorteado);

                for (Titulo tituloVendido : sorteio.getTitulosVendidos()){
                    if (sorteioTemporario.containsAll(tituloVendido.getSorteio1())){
                        listaGanhadores.add(tituloVendido);
                        temGanhador = true;
                    }
                }
            }
        } while (!temGanhador);
        sorteio.setResultados(numeroRodada,(LinkedHashSet<Integer>) sorteioTemporario);
        sorteio.setGanhador(numeroRodada, listaGanhadores);
        System.out.printf("\nCom %d sorteados temos os seguintes ganhadores:\n",sorteioTemporario.size());
        for (Titulo listaGanhador : listaGanhadores){
            System.out.printf("Nº título: %d - %s\n", listaGanhador.getNumeroTitulo(),listaGanhador.getNomeTitular());
        }
        System.out.println("\n");
        TimeUnit.SECONDS.sleep(3);
    }
}
