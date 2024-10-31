# Cinema Feedback

Este projeto consiste em um programa Java que coleta e analisa opiniões de 40 espectadores sobre um filme exibido em um cinema. O programa calcula estatísticas sobre as opiniões e idades dos espectadores, fornecendo um resumo das avaliações.

## Funcionalidades

O programa realiza as seguintes operações:

1. **Coleta de Dados**:
   - Solicita a idade e a opinião de cada um dos 40 espectadores, em que a opinião é dada conforme uma escala de notas:
     - **A**: Ótimo
     - **B**: Bom
     - **C**: Regular
     - **D**: Ruim
     - **E**: Péssimo

2. **Cálculo de Estatísticas**:
   - **Quantidade de Respostas "Ótimo"**: Contabiliza o número de espectadores que deram nota "A" (Ótimo).
   - **Média de Idade para Respostas "Ruim"**: Calcula a média de idade dos espectadores que deram nota "D" (Ruim).
   - **Porcentagem de Respostas "Péssimo"**: Calcula a porcentagem de espectadores que deram nota "E" (Péssimo).
   - **Média Geral das Notas**: Calcula a média geral das notas, com a seguinte escala:
     - A = 5
     - B = 4
     - C = 3
     - D = 2
     - E = 1

## Exemplo de Execução

Após a coleta de dados, o programa exibe as estatísticas conforme o exemplo abaixo:

```shell
Quantidade de respostas "Ótimo": 10
Média de idade das pessoas que responderam "Ruim": 34.2
Porcentagem de respostas "Péssimo": 15.00%
Média geral das notas: 3.45
```

## Estrutura do Projeto

O projeto contém um único arquivo Java:

- **CinemaFeedback.java**: Arquivo principal com a lógica de coleta, cálculo e exibição dos resultados da pesquisa de opinião.

## Como Executar

1. Certifique-se de que o [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) está instalado em seu ambiente.
2. Clone este repositório:

   ```shell
   git clone https://github.com/seu_usuario/CinemaFeedback.git
   ```

3. Navegue até o diretório do projeto:

   ```shell
   cd CinemaFeedback
   ```

4. Compile o arquivo Java:

   ```shell
   javac CinemaFeedback.java
   ```

5. Execute o programa:

   ```shell
   java CinemaFeedback
   ```

## Critérios de Avaliação

Este projeto atende aos seguintes critérios:
- **Estruturas de Repetição e Decisão**: Utilização de `for` e `switch` para coletar e processar as opiniões dos espectadores.
- **Cálculo de Estatísticas**: Cálculo preciso da média de idade, porcentagem e média geral.
- **Organização do Código**: Código bem estruturado e comentado para facilitar a compreensão e manutenção.

## Autor

Desenvolvido por [@beatrisAS](https://github.com/beatrisAS).
