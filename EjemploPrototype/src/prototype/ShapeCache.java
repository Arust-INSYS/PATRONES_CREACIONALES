package prototype;

import prototype.Circle;
import java.util.Hashtable;

/**
 * Paso 3: Creamos la clase que obtendra los datos de la base de datos y
 * almacenara en unas Hashtable (Para mantenerlo en memoria y usarlo despues)
 *
 * @author
 */
public class ShapeCache {

    // HASHTABLE
    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    // OBTENEMOS LA FIGURA
    public static Shape getShape(String shapeId) {
        
        //BUSCA EN EL HASHTABLE Y RETORNA EL CLON
        Shape cachedShape = shapeMap.get(shapeId);
        
        return (Shape) cachedShape.clone();
    }
 
    /* DESPUES SE CARGAN LOS DATOS EN EL CACHE Y POR CADA UNA DE LAS 
    FIGUIRAS QUE SE TENGAN SE VAN ALMACENANDO EN EL HASHTABLE*/
    public static void loadCache() {
        
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }

}
