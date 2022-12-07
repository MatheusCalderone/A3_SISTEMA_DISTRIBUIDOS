Instruções do MySQL

Boa noite professor, aqui segue o guia do nosso sistema de BlackJack.
Nele podemos jogar a aplicação e junto dela realizar um CRUD, por meio
das classes dentro do projeto.
Peço desculpas por eventuais erros que aconteçam, pois descobri de
ultima hora que os responsaveis pelo CRUD do grupo não fizeram sua
parte e tive que tentar fazer correndo de ultima hora.

* Primeira classe: Factory
A classe factory está escarregada de fazer a conexão com o banco de
dados de acordo com o usuario, senha e caminho da conexão do usuario
do MySQL.

* Segunda classe: BlackJackDAO
A classe BlackJackDAO Tenta realizar a conexão de acordo com oq é
passado na classe Factory e ainda passa a Query padrão que queremos
inserir no nosso Banco de Dados

* Terceira Classe: Main
A classe Main é a principal e que executara todos os comandos que
precisamos para realizar o CRUD no nosso banco de dados, unindo
todas as informações passadas nas classes anteriores.

OBS IMPORTANTE:

* Criar o banco "blackjack" no mysql, e a tabela blackjack com os 
campos: id, jogador e pontos

* Caso seu usuario/senha tenha uma combinação diferente de acesso na 
classe, mude diretamente na propria classe de ConnectionFactory.

* Tenha certeza de usar versões atualizadas do MySQL e do Connector,
pois podem ocasionar error diversos por configuração errado do eclipse
ou do MySQL

OBS ADD: Na pasta que mandei está um arquivo TXT chamado "SQL", nele
configurei um CRUD diretamente por comandos de SQL, para que sirva
de complemento neste trabalho.
