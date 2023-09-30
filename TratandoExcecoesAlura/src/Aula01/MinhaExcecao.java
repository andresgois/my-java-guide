package Aula01;

public class MinhaExcecao extends RuntimeException {
	
    private static final long serialVersionUID = 1L;

	public MinhaExcecao(String msg) {
        super(msg);
    }
}
