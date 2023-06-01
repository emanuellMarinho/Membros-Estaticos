# Currency Converter

Este é um pequeno programa em Java que converte uma quantia em dólares para reais com base em uma taxa de câmbio fornecida pelo usuário. O programa utiliza membros estáticos para armazenar a taxa de IOF (Imposto sobre Operações Financeiras) e realizar a conversão.

## Como usar

1. Execute o programa `Program.java` no pacote `application`.
2. O programa solicitará ao usuário que insira o preço do dólar e a quantidade de dólares a serem comprados.
3. Com base nas informações fornecidas, o programa calculará o valor total em reais a ser pago e o exibirá na saída.

## Estrutura do código

O código está dividido em duas classes: `Program` e `CurrencyConverter`.

### Classe Program

A classe `Program` é a classe principal que contém o método `main` onde a execução do programa começa. Ela possui as seguintes partes:

1. `Locale.setDefault(Locale.US);`: Define a localização padrão do programa como "US" (Estados Unidos), para que números decimais sejam lidos e exibidos no formato americano (com ponto como separador decimal).

2. `Scanner sc = new Scanner(System.in);`: Cria um objeto `Scanner` para ler dados de entrada do usuário.

3. Solicita ao usuário o preço do dólar e a quantidade de dólares a serem comprados.

4. Calcula o valor total em reais a ser pago multiplicando a quantidade de dólares pelo preço do dólar e adicionando o valor do IOF (armazenado na classe `CurrencyConverter`).

5. Exibe o valor total a ser pago em reais na saída.

6. `sc.close();`: Fecha o objeto `Scanner` para liberar os recursos do sistema.

### Classe CurrencyConverter

A classe `CurrencyConverter` é uma classe auxiliar que contém a taxa de IOF e um método estático para converter dólares para reais. Ela possui as seguintes partes:

1. `public static final double IOF = 0.06;`: Declara uma constante `IOF` que armazena a taxa de IOF como 0.06. O modificador `public static final` indica que essa variável é uma constante acessível de forma estática (sem precisar instanciar um objeto da classe) e seu valor não pode ser alterado.

2. `public static double convertToReal(double amountInDollars, double exchangeRate)`: Um método estático que recebe a quantidade de dólares e a taxa de câmbio e retorna o valor equivalente em reais. O cálculo é feito multiplicando a quantidade de dólares pela taxa de câmbio e adicionando o valor do IOF.

## Membros Estáticos

Membros estáticos em Java são variáveis ou métodos que pertencem à classe em si, não a uma instância específica da classe. Isso significa que eles podem ser acessados diretamente pela classe, sem precisar criar um objeto da classe.

No código fornecido, a classe `CurrencyConverter` possui dois membros estáticos:

- A variável `IOF` é uma constante estática que armazena a taxa de IOF. Como é estática, seu valor é compartilhado por todas as instâncias da classe e pode ser acessado diretamente através do nome da classe (`CurrencyConverter.IOF`).

- O método `convertToReal` é um

 método estático que realiza a conversão de dólares para reais. Ele também pode ser acessado diretamente pela classe, sem precisar criar um objeto. Isso permite que o método seja chamado a partir do método `main` da classe `Program` para realizar a conversão.

Os membros estáticos são úteis quando se deseja compartilhar valores ou funcionalidades entre várias instâncias de uma classe ou quando não é necessário criar uma instância da classe para acessar determinado valor ou funcionalidade.