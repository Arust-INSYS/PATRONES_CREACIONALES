package prototype;

import prototype.Shape;

/**
 * Paso 2: Creacion de las clases que extenderan de la clase Shape
 *
 * @author
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circulo";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }

}
