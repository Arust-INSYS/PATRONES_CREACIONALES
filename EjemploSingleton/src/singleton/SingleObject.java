package singleton;

import java.util.Date;
import java.util.Objects;

// NO SE PODRA CREAR NUEVAS INSTANCIAS DE ESTA CLASE
public class SingleObject {

    // SEGUNDO TENER UN ATRIBUTO DE LA MISMA CLASE
    private static SingleObject instance;
    private static Date now;

    // PRIMERO DEBE TENER UN CONSTRUCTOR PRIVADO PARA QUE NADIE CREE UNA INSTANCIA
    private SingleObject() {

    }
    
    // CLASE QUE RETORNARA ESTE METODO
    public static SingleObject getInstance() {

        // VERIFICAMOS QUE LA INSTANCIA ESTA NULA, EN CASE DE QUE ESTE LE INICIALIZAMOS
        // SE DEBE INICIALIZAR UNA SOLA VEZ
        if (Objects.isNull(instance)) {
            now = new Date();
            instance = new SingleObject();
        }

        // SIEMPRE RETORNA LA PRIMERA INSTANCIA
        return instance;
    }

    public void showMessage() {

        System.out.println(now);
    }

}
