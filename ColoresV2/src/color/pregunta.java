package color;

public class pregunta {
	private boolean color;
	colores tema = new colores();

	public pregunta() {
		// constructor
	}

	public void conf_color(String color) {
		if (color == "si") {
			this.color = true;
		} else {
			this.color = false;
		}
	}

	public String dime_color() {

		if (color == true) {
			return " Con color";
		} else {
			return " Sin color";
		}
	}

}
