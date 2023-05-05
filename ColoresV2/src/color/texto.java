package color;

public class texto {
	String negrita;
	String cursiva;
	String subrayado;
	String tachado;
	String torcido;

	public texto() {

		negrita = "\033[1m";
		cursiva = "\033[3m";
		subrayado = "\033[4m";
		tachado = "\033[9m";
		torcido = "\033[6m";
	}
}
