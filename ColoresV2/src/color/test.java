package color;

public class test {

	public static void main(String[] args) {
		colores tema = new colores();
		texto efectos = new texto();
		pregunta pregunta = new pregunta();

		System.out.println(tema.color_rojo()); // metodo getter
		System.out.println(tema.color_azul()); // metodo getter

		// setter
		tema.color_amarillo();

		System.out.println(tema.colorAmarillo()); // metodo setter
		System.out.println(tema.colorVerde()); // metodo setter
		System.out.println();

		
		pregunta.conf_color("si"); // <== "si" texto con color / "no" texto sin color 

		System.out.println(pregunta.dime_color());
	}

}
