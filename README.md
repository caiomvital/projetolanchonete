# projetolanchonete
Documentação do Projeto: Sistema de Lanchonete

Descrição
O Sistema de Lanchonete é uma aplicação Java que simula o processo de criação de pedidos em uma lanchonete. Ele permite aos usuários escolher entre diferentes tipos de pratos, como lanches, pizzas e salgadinhos, personalizando seus componentes, como pães, recheios, molhos e bordas. O projeto está organizado seguindo a estrutura MVC (Model-View-Controller), separando as diferentes responsabilidades em classes distintas.

Funcionalidades
Cadastro de Pratos: O sistema oferece a possibilidade de cadastro de diferentes tipos de pratos, como lanches, pizzas e salgadinhos. Cada prato é composto por diversos componentes, como pães, recheios, molhos e bordas.

Personalização de Pratos: Os usuários podem personalizar seus pedidos escolhendo entre várias opções para cada componente do prato.

Cálculo de Preço: O sistema calcula automaticamente o preço total do pedido com base nas escolhas de personalização do usuário, considerando os valores associados a cada componente.

Impressão de Nota Fiscal: Após finalizar o pedido, o sistema gera uma nota fiscal que lista os itens consumidos, o valor total a pagar e a taxa de serviço.

Estrutura do Projeto
O projeto está estruturado em classes que seguem a arquitetura MVC:

Model: Contém as classes que representam os diferentes tipos de pratos (Lanche, Pizza, Salgadinho) e seus componentes. Também inclui enums para os valores associados a cada componente (ValoresLanche, ValoresPizza, ValoresSalgadinho).

View: A interação com o usuário é realizada por meio da classe Pedido, que solicita as escolhas dos componentes do prato.

Controller: A classe Pedido contém a lógica de controle do sistema. Ela coordena a interação entre o usuário e as classes do Model, além de calcular preços, gerar a nota fiscal e lidar com o pagamento.

Expansibilidade
O projeto foi desenvolvido de forma modular e orientada a objetos, o que permite a adição de novos tipos de pratos e componentes de forma relativamente simples. A utilização de enums para armazenar valores associados a cada componente facilita a inclusão de novas opções.

No entanto, para uma expansão mais robusta, sugere-se considerar a abstração de interfaces, a implementação de um sistema de gerenciamento de produtos e a adição de recursos de persistência de dados, conforme necessário.

Execução do Projeto
Compile os arquivos Java usando um compilador Java (por exemplo, javac Principal.java).
Execute o programa usando o comando java Principal.
Referências
Este projeto resolve o exercício proposto no seguinte link:
[Exercício - Sistema de Lanchonete](https://www.computersciencemaster.com.br/exercicio-sistema-de-lanchonete/)

Autor

Nome: Caio Vital

E-mail: caiomvital@gmail.com
