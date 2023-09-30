# Threads

- A JVM faz automaticamente o uso de threads para coletar objetos abandonados na memória. Essas threads (que na verdade são várias) chamamos de Garbage Collector (que traduzido do inglês, significa "coletor de lixo" ou "lixeiro"). Ele é responsável por jogar fora todos os objetos que não estão sendo referenciados por nenhum outro objeto.

### Em relação as threads
- Não é possível determinar a ordem de execução, que pode ser sempre diferente inclusive na mesma máquina.

- Vimos na aula que a JVM mapeia as threads java para threads nativas do sistema:

![Threads](../img_readme/threads.001.png)

- E se o sistema operacional por baixo não desse suporte ao multi-threading nativo? Aí entram as threads que também se chamam de Green Threads. Nesse caso a JVM simularia um ambiente multi-threaded, mas na verdade só pode ter um processo ou thread executando ao mesmo tempo.

- Em outras palavras, as Green Threads emulam um ambientes multi-threaded, sem depender de quaisquer capacidades do sistema operacional nativo. As threads nativas realmente usam a capacidade nativa do sistema operacional para gerenciar processos multi-threaded.

> Como podemos pegar a instância da Thread atual (aquela que está sendo executada)?
- Thread atual = Thread.currentThread();
> Qual o nome do modificador que deve ser colocado em um método para que não possa ser executado por duas Threads ao mesmo tempo?
- synchronized
> O que é uma operação atômica?
- Cuja execução não pode ser interrompida na metade.

- Para quem já trabalhou com banco de dados e usou transações sabe que exatamente isso é uma das caraterísticas delas. Transações possuem as caraterísticas ACID que vão além da funcionalidade syncronized:

- A de Atômico (é isso que syncronized faz)
- C de Consistente
- I de Isolado
- D de Durável

- O método synchronized(), que é baseado em uma chave (this), que também é chamada de **Mutex**. Cada objeto no mundo Java já possui essa chave para sincronizar o acesso. Dessa forma, o thread é executado continuadamente, sem nunca liberar a chave e travando a aplicação.


### ReentrantLock

```
public class Banheiro {

    private Lock lock = new ReentrantLock();

    public void fazNumero1() {

        lock.lock();
            System.out.println("entrando no banheiro");
            System.out.println("fazendo coisa rapida");

            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("dando descarga");
            System.out.println("lavando a mao");
            System.out.println("saindo do banheiro");
        lock.unlock();
    }

    public void fazNumero2() {

        lock.lock();
            System.out.println("entrando no banheiro");
            System.out.println("fazendo coisa demorada");

            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("dando descarga");
            System.out.println("lavando a mao");
            System.out.println("saindo do banheiro");
        lock.unlock();
    }
}
```
- Certamente há algumas diferenças que podemos examinar. Uma das principais é a possibilidade de se criar um lock com timeout usando uma sobrecarga do método tryLock.

- Por exemplo:
	- boolean locked = lock.tryLock(5, TimeUnit.SECONDS); //5s

- Com esse método esperamos até cinco segundos e receberemos true caso o lock for obtido. Caso contrário, receberemos false. Como desvantagem, há o fato de o programador ter a responsabilidade de liberar o lock (unlock()).








