# Sistema Trilegal
Esse é um projeto autoral. 
<br>
<br>
Tenho gostos peculiáres e assistindo ao sorteio do Trilegal que acontece todo domingo ficava me perguntando "eles tem milhões de títulos vendidos, e a cada bolinha sorteada conseguem ver se chegou um ganhador, é possível mesmo fazer isso em tempo real, e se sim qual é o tempo necessário?"
Com base nessa curiosidade surgiu a ideia desse projeto.
<br>
<br>
## Para começar, gere seu título
![image](https://github.com/user-attachments/assets/91c1137e-1347-4707-a5cb-ae8823d752e8)
<br>
<br>
## Escolha quantos bilhetes serão vendidos nesse sorteio.
O número escolhido é o número de bilhetes que o sistema gerará para concorrer. Não é um dado simulado, vamos realmente criar milhares ou milhões de titulos diferentes com nome, cidade, e grupo de números pra concorrer, motivo esse, que a geração pode levar alguns segundos.
![image](https://github.com/user-attachments/assets/d0dfa062-21e1-415b-9e36-c5031d81760b)
<br>
<br>
## Veja o sorteio acontecendo.
Diferente da Mega-Sena, onde são sorteados 6 números, no TriLegal você tem uma cartela com 20 números e precisa completá-la para garantir o prêmio. Para que isso aconteça, pode ser que seja necessário tirar do globo 20 números, 40 ou 60 - vai depender da sua sorte e de quantos títulos concorrentes foram vendidos. Isso quer dizer que a cada novo número sorteado eu preciso verificar todos os bilhetes vendidos, o que gasta tempo e processamento.
![image](https://github.com/user-attachments/assets/1ddb11b1-6efd-43c3-bc99-8f5e2b4f5ad7)
<br>
# Por fim descubra se você ganhou alguma coisa...
A minha experiência está bem fiel aos meus resultados reais kkkk
<br>
![image](https://github.com/user-attachments/assets/2396ba54-276e-4249-beaa-0f03bdf1dcb8)
<br>
<br>
* Dica: Simule o sorteio com um número baixo de concorrentes (ex. 1000) vs um alto número de concorrentes (1000000), e veja como a quantidade necessária de números saídos do globo até encontrar um ganhador decresce a medida que aumentam os bilhetes gerados.
* Dica 2: Que tal fazer uma engenharia reversa? Pegue um sorteio real do Trilegal, veja quantas bolinhas foram necessárias nas 3 rodadas e faça uma média, depois utilize o sistema e vá brincando com o número de bilhetes vendidos, pra tentar adivinhar quantos títulos (de verdade) a equipe do Trilegal vendeu naquela semana.
<br>
<br>

## Uma personalização que curti fazer...
Não sei se você percebeu, mas pra deixar a experiência mais interessante, criei um gerador interno de pessoas, onde o NOME + SOBRENOME + CIDADE são construídos de forma dinâmica utilizando:
* Nome: Lista com mais de 400 nomes brasileiros - créditos ao projeto br-nome-gen do [@victorwss](https://github.com/victorwss/br-nome-gen/)
* Sobrenome: Lista de sobrenomes mais comuns no Rio Grande do Sul que capturei atrávés de pesquisas oficiais e matérias na internet
* Cidade: Lista de cidades da região metropolitana de Porto Alegre (onde o Trilegal é vendido)
