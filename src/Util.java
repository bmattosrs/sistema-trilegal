import java.util.*;

public class Util {

    public static int geradorNumero(int quantidade){
        return new Random().nextInt(60)+1;
    }

    public static Set<Integer> geradorNumeros(int quantidade){
        Set<Integer> numerosAleatorios = new TreeSet<>();

        while (numerosAleatorios.size() < quantidade) {
            numerosAleatorios.add(new Random().nextInt(60)+1);
        }
        return numerosAleatorios;
    }

    public static String geradorPessoa(){

        //Lista de nomes brasileiros - Source https://github.com/victorwss/br-nome-gen/
        List<String> randomNomes = Arrays.asList("Abílio", "Ademar", "Adílson", "Adônis", "Adriano", "Aécio", "Alan", "Albano", "Alberto", "Albino", "Aldo", "Alessandre", "Alex", "Alexandre", "Alfredo", "Ali", "Alisson", "Aloísio", "Altair", "Altino", "Álvaro", "Amarildo", "Anakin", "Anderson", "André", "Ângelo", "Antônio", "Armando", "Arnaldo", "Artur", "Arthur", "Augusto", "Aurélio", "Áureo", "Avelino", "Ayrton","Baltazar", "Barnabé", "Bartolomeu", "Batista", "Benedito", "Benjamin", "Bento", "Bernardo", "Beto", "Bóris", "Breno", "Bruno","Caio", "Camilo", "Carlos", "Cauê", "Celso", "César", "Charles", "Chico", "Cícero", "Cirilo", "Ciro", "Cléber", "Cleberson", "Cristiano","Damião", "Daniel", "Danilo", "Dante", "Dário", "Davi", "David", "Décio", "Demilson", "Denis", "Diego", "Diogo", "Dionísio", "Domingos","Ederson", "Edinaldo", "Edivaldo", "Edson", "Edu", "Eduardo", "Elano", "Elias", "Eliel", "Elói", "Emanoel", "Emílio", "Eric", "Estevão", "Eugênio", "Eustáquio", "Everaldo", "Everton", "Ezequiel","Fabiano", "Fábio", "Fabrício", "Fagner", "Felipe", "Félix", "Filipe", "Fernando", "Flávio", "Francisco", "Fred", "Frederico","Gabriel", "Geraldo", "Gilberto", "Giovanni", "Giuseppe", "Gilmar", "Gilson", "Guilherme", "Gustavo","Hamilton", "Heitor", "Helder", "Hélio", "Henrique", "Hércules", "Heron", "Hildebrando", "Hilton", "Hugo", "Humberto","Iago", "Igor", "Inácio", "Isaías", "Isac", "Ismael", "Israel", "Itamar", "Ivan","Jacinto", "Jack", "Jackson", "Jair", "Jairo", "Jânio", "Jason", "Jardel", "Jaziel", "Jean", "Jeferson", "Jesus", "João", "João", "João", "João", "Joaquim", "Joel", "Jonas", "Jonathan", "Jonathas", "Jorge", "José", "José", "José", "Josiel", "Juan", "Júlio", "Juliano", "Junior","Karl", "Kauê", "Kevin", "Kim","Laércio", "Laerte", "Leandro", "Leo", "Leonardo", "Leopoldo", "Lino", "Luan", "Lucas", "Lúcio", "Luciano", "Luigi", "Luís", "Luiz", "Luke","Manoel", "Manuel", "Marcelo", "Marciano", "Márcio", "Marco", "Marcos", "Mariano", "Mário", "Marlon", "Martin", "Martinho", "Mateus", "Matheus", "Maurício", "Max", "Micael", "Michel", "Miguel", "Mike", "Milton", "Moacyr", "Moisés", "Murilo","Nathan", "Nelson", "Ney", "Nicolas", "Nicolau", "Nilo", "Nilton", "Nivaldo","Olavo", "Oliver", "Omar", "Orlando", "Oséas", "Osório", "Osvaldo", "Otaviano", "Otávio", "Otto","Pablo", "Patrick", "Paulo", "Paulo", "Pedro", "Plínio","Quico", "Quirino","Rafael", "Raí", "Ramon", "Raul", "Reginaldo", "Reinaldo", "Renato", "Ricardo", "Ricardo", "Rivaldo", "Robert", "Roberto", "Roberval", "Robson", "Rodrigo", "Rodrigo", "Rodolfo", "Roger", "Rogério", "Romildo", "Ronaldo","Samuel", "Sandro", "Saulo", "Sebastião", "Sérgio", "Severino", "Silvair", "Sílvio", "Simão","Táles", "Tiago", "Thiago", "Tomáz", "Toninho", "Túlio","Uribe","Valter", "Victor", "Vinícius", "Vitor","Wagner", "Wally", "Walter", "Washington", "Wellington", "Wesley", "Willian", "Wilson","Xavier", "Xerxes","Yuri","Zeca,","Abigail", "Adriana", "Adrielle", "Alana", "Albina", "Alessandra", "Aline", "Amália", "Amanda", "Amélia", "Ana", "Ana", "Ana", "Ana", "Ana", "Anna", "Anne", "Andréia", "Andressa", "Ângela", "Angélica", "Aparecida", "Ariana", "Ariel", "Arilda", "Arlete","Bárbara", "Beatriz", "Bella", "Berenice", "Bernadete", "Bete", "Bianca", "Brenda", "Bruna","Camila", "Carla", "Cármen", "Carolina", "Caroline", "Cássia", "Catarina", "Cecília", "Celeste", "Célia", "Celina", "Charlene", "Christie", "Cibele", "Cícera", "Cíntia", "Clara", "Clarice", "Cláudia", "Cleuza", "Clotilde", "Cristiane", "Cristina","Damares", "Daiane", "Daniela", "Danielle", "Dara", "Denise", "Diana", "Dilma", "Dina","Ediane", "Edilene", "Eduarda", "Elaine", "Eleonora", "Eleriane", "Eliane", "Elisa", "Elizabete", "Elisete", "Eliomar", "Elisângela", "Eloá", "Érica", "Eulália", "Eunice", "Eva", "Evelyn","Fabiana", "Fabíola", "Fátima", "Fernanda", "Felícia", "Flávia", "Flaviana", "Francielle","Gabriela", "Gabrielle", "Genir", "Gigi", "Gilmara", "Gisele", "Gislaine", "Graziele", "Guiomar","Helena", "Hellen", "Heloísa", "Hilda","Isabel", "Isabela", "Ingrid", "Isaiane", "Ísis", "Itamara", "Ivanete", "Ivete", "Ivone","Janaína", "Jandira", "Janete", "Jaqueline", "Jeniffer", "Jenny", "Jéssica", "Joelma", "Josiane", "Josilda", "Joyce", "Júlia", "Juliana", "Jussara","Karin", "Karina", "Kátia", "Kelly", "Keyla", "Kiara","Laila", "Laís", "Lana", "Lara", "Larissa", "Laura", "Léia", "Leila", "Leonara", "Lena", "Leni", "Liane", "Lidiane", "Lígia", "Lili", "Lilian", "Lina", "Lisa", "Lívia", "Luara", "Lúcia", "Luciana", "Luiza", "Luzia", "Luzimara", "Luzinete","Madalena", "Magali", "Maíra", "Maísa", "Manuela", "Mara", "Marcela", "Márcia", "Marciane", "Marcielle", "Margarete", "Margarida", "Maria", "Maria", "Maria", "Maria", "Maria", "Maria", "Mariana", "Marielle", "Marilúcia", "Marina", "Marlene", "Marli", "Marta", "Matilde", "Mayara", "Mayra", "Meire", "Mel", "Melanie", "Melissa", "Michele", "Mikaella", "Milene", "Mirela", "Mirian", "Mônica", "Monique","Nádia", "Nair", "Natália", "Nayara", "Neila", "Nicole", "Núbia","Olga", "Olímpia", "Olívia", "Otávia","Patrícia", "Patrícia", "Paula", "Paula", "Paula", "Paulínia", "Priscila", "Poliana","Quênia", "Quésia", "Quitéria","Rafaela", "Raiane", "Raíssa", "Raquel", "Rebeca", "Regina", "Renata", "Rita", "Roberta", "Rosa", "Rosana", "Rosângela", "Rose", "Roseli", "Rosilda", "Rosimeire", "Rute","Sabrina", "Samanta", "Samara", "Sâmia", "Samila", "Sandra", "Sara", "Selena", "Selma", "Sheila", "Shirley", "Simone", "Sílvia", "Solange", "Sônia", "Soraya", "Suellen", "Suely", "Susan", "Suzana", "Suzanne", "Suzy","Tábata", "Tânia", "Taís", "Tainá", "Tainara", "Talita", "Tatiana", "Tatiane", "Telma", "Teresa", "Terezinha", "Thaís", "Thaíssa", "Tina","Úrsula","Valdirene", "Valéria", "Valeska", "Valquíria", "Vanda", "Vanessa", "Vânia", "Velma", "Vera", "Verônica", "Vitória", "Violeta", "Vívian", "Viviane","Walderice", "Wanda", "Wendy", "Wilma","Xilena","Yasmin", "Yeda", "Yolanda","Zara", "Zenaide", "Zilda", "Zuleide", "Zulmira");


        //Lista de sobrenomes alemães comuns do Rio Grande do Sul
        List<String> randomSobreNomes = Arrays.asList("Schmidt", "Becker", "Wagner", "Müller", "Schneider", "Weber", "Klein", "Scherer", "Hoffmann", "Rech", "Schmitz", "Kuhn", "Mallmann", "Diehl", "Ritter", "Bohn", "Ruschel", "Stein", "Braun", "Ludwig", "Hoff", "Jung", "Finkler", "Sperb");

        //Lista de cidades da Região Metropolitana de Porto Alegre
        List<String> randomCidades = Arrays.asList("Alvorada","Araricá","Arroio dos Ratos","Cachoeirinha","Campo Bom","Canoas","Capela de Santana","Charqueadas","Dois Irmãos","Eldorado do Sul","Esteio","Estância Velha","Glorinha","Gravataí","Guaíba","Igrejinha","Ivoti","Montenegro","Nova Hartz","Nova Santa Rita","Novo Hamburgo","Parobé","Porto Alegre","Portão","Rolante","Santo Antônio da Patrulha","Sapiranga","Sapucaia do Sul","São Jerônimo","São Leopoldo","São Sebastião do Caí","Taquara","Triunfo","Viamão");


        String nomeGerado = randomNomes.get(new Random().nextInt(randomNomes.size())) + " " + randomSobreNomes.get(new Random().nextInt(randomSobreNomes.size())) + " - " + randomCidades.get(new Random().nextInt(randomCidades.size()));

        return nomeGerado;
    }

}