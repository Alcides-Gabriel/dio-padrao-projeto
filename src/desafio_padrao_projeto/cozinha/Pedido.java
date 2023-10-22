package desafio_padrao_projeto.cozinha;

public class Pedido {
	private static Pedido instancia;
	private String prato;

	private Pedido() {
		this.prato = "Nenhum prato selecionado";
	}

	public static Pedido obterInstancia() {
		if (instancia == null) {
			instancia = new Pedido();
		}
		return instancia;
	}

	public String getPrato() {
		return prato;
	}

	public void setPrato(String prato) {
		this.prato = prato;
	}
}
