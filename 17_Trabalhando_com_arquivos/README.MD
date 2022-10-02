# Trabalhando com arquivos

### FileReader
	- Sequência de leitura a partir de um arquivo
### BufferedReader
	- Instância a partid o do filereader, mas com métodos otimizados.
### Try-with-resources
- **O que é:** um recurso sintático do Java para uso seguro de recursos de forma segura.
- **Objetivo:** garantir que recursos escassos - como conexões com o banco de dados, referências a arquivos, conexões de rede - sejam devidamente fechadas após o uso, mesmo num cenário excepcional.
- **Funcionamento:** os recursos declarados no try (entre os parêntesis) devem implementar a interface AutoCloseable e terão seu método close() automaticamente chamado ao final do bloco try.
	- **Uso simples:**
```
try (BufferedReader br = new BufferedReader(new FileReader(path))) {
    return br.readLine();
}
```
- **Benefícios:**
	- Substitui o tratamento manual de exceções:
		- Menos propenso a erros de codificação, quando o programador não sabe ou esquece de executar todo o tratamento necessário.
		- Evita vazamento de recursos, quando o programador esquece de fechá-lo ou não trata corretamente uma situação excepcional.
	- Menos código boilerplate:
		- Facilita e agiliza a codificação.
		- Menos chance de esquecer algo.
		- Menos código significa menos bugs e menos coisas para dar manutenção.

## Referências

- [Classe File](https://docs.oracle.com/javase/7/docs/api/java/io/File.html)
- [IOException](https://docs.oracle.com/javase/7/docs/api/java/io/IOException.html)
- [FileReader](https://docs.oracle.com/javase/7/docs/api/java/io/FileReader.html)
- [BufferedReader](https://docs.oracle.com/javase/8/docs/api/java/io/BufferedReader.html)
- [try-with-resources](https://www.baeldung.com/java-try-with-resources)
- [Stack over flow](https://pt.stackoverflow.com/questions/172909/como-funciona-o-try-with-resources)
- []()