package prototype;

/**
 * Paso 5: Verificamos el funcionamiento del patron prototype
 *
 * @author
 */
public class PrototypePatternDemo {

    public static void main(String[] args) {

        ShapeCache.loadCache();

        // LLAMAMOS A CADA UNA DE LAS FIGURAS POR MEDIO DEL ID Y CADA UNO TRAERA UNA FIGURA DIFERENTE
        /* - PRIMERO SE CARGA EN CACHE TODA LA INFORMACION Y LUEGO SE BUSCARA ESOS DATOS*/
        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Figura > " + clonedShape.getType());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("\nFigura > " + clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("\nFigura > " + clonedShape3.getType());

    }

}
