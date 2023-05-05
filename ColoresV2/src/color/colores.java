package color;

public class colores {
	private String rojo;
	private String verde;
	private String azul;
	private String amarillo;
	private String violeta;
	private String cyan;
	private String blanco;
	private String negro;
	private boolean color;

	// CONTRUCTOR
	public colores() {
		rojo = "\u001B[31m";
		verde = "\u001B[32m";
		azul = "\u001B[34m";
		amarillo = "\u001B[33m";
		violeta = "\u001B[35m";
		cyan = "\u001B[36m";
		blanco = "\u001B[37m";
		negro = "\u001B[30m";
	}

	// metodo getter
	public String color_rojo() {
		return rojo + "Color Rojo (get)";
	}

	// metodo getter
	public String color_azul() {
		return azul + "Color Azul (get)";
	}

	// metodo setter
	public void color_amarillo() {
		amarillo = amarillo + "Color Amarillo (set)";
		verde = verde + "Color Verde (set)";
	}

	public void color_violeta() {
		violeta = violeta + "Color Violeta (set)";
	}

	// metodo setter
	public String colorAmarillo() {
		return amarillo;
	}

	public String colorVerde() {
		return verde;
	}

}
