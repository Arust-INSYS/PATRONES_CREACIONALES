package prototype;

/**
 * Paso 2: Creacion de las clases que extenderan de la clase Shape
 *
 * @author
 */

// Implementa la clase shape
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangulo";
    }

    // SE IMPLIMENTA LA CLASE OBLIGATORIA DRAW
    @Override
    void draw() {
        
        System.out.println("Inside Rectangle::draw() method.");
    }

}
