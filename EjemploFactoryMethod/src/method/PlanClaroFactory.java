package method;

/*
 * @author BRYAN_CABRERA
 */
public class PlanClaroFactory {
 
    //Retorna un producto dependiendo de lo que se envie desde el cliente - instacia un objeto u otro dependiendo del producto que se solicite
    public PlanClaro getPaquete(int paquete) {

        if (paquete == 10) {
            return new Paquete10();
        }

        if (paquete == 30) {
            return new Paquete30();
        }

        if (paquete == 50) {
            return new Paquete50();
        }

        return null;
    }
}
