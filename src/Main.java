import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        String informacoesTitular = "";
        String iniciarSorteio = "";


        Scanner scanner = new Scanner(System.in);
        System.out.println("SORTEIO TRILEGAL por Github @bmattosrs");

        while (informacoesTitular.length() < 3){
            System.out.println("Para gerar seu título insira: Nome Sobrenome - Cidade");
            informacoesTitular = scanner.nextLine();
        }
        Titulo tituloDoUsuario = new Titulo(informacoesTitular);
        tituloDoUsuario.informacoesTituloFormatado();

        System.out.println("Quantas pessoas vão concorrer com você? Sugerido: 1000000");
        while(!scanner.hasNextInt()){
            System.out.println("Por favor, insira um número válido");
            scanner.next();
        }
        Config.numeroBilhetesVendidos = scanner.nextInt();

        while (iniciarSorteio != "Y" && iniciarSorteio != "N"){
            System.out.println("INICIAR SORTEIO? Y/N");
            iniciarSorteio = scanner.next().toUpperCase();
            switch (iniciarSorteio) {
                case "Y":
                    Sorteio sorteio = new Sorteio(0001);
                    new Sorteador(sorteio, tituloDoUsuario);
                    if(sorteio.getGanhador(1).contains(tituloDoUsuario) || sorteio.getGanhador(2).contains(tituloDoUsuario) || sorteio.getGanhador(3).contains(tituloDoUsuario)){
                        System.out.println("\n\nVocê ganhou!");
                    } else {
                        System.out.println("\n\nVocê perdeu!");
                    }
                case "N":
                    System.exit(0);
            }
        }
        scanner.close();
    }
}