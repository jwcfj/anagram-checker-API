**Para Instalar as Dependências via Maven:**
1. Abra um terminal ou prompt de comando na raiz do projeto.
2. Insira o seguinte comando:
   ```
   mvn install
   ```
   Isso irá baixar e instalar todas as dependências necessárias para o projeto.

**Para Executar o Backend:**
1. Certifique-se de que as dependências foram instaladas com sucesso.
2. Insira o seguinte comando:
   ```
   mvn spring-boot:run
   ```
   Isso iniciará o servidor backend.

**Acessando a Documentação API:**
1. Após o backend ter sido iniciado com sucesso, abra um navegador da web.
2. Vá para o seguinte link:
   ```
   http://localhost:8080/swagger-ui.html
   ```
   Isso abrirá a interface do Swagger, onde você pode explorar a documentação da API e testar os endpoints.

**Acessando os Testes:**
1. Para acessar os testes do projeto, vá para o seguinte caminho no seu projeto:
   ```
   src/test/java/com/example/mvchallenge/MvchallengeApplicationTests.java
   ```
   Lá, você encontrará os testes unitários e de integração relacionados à sua aplicação.
