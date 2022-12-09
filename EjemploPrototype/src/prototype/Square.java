package prototype;

/**
 * Paso 2: Creacion de las clases que extenderan de la clase Shape
 * 
 * @author
 */
public class Square extends Shape {

	public Square() {
		type = "Cuadrado";
	}

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}

}
