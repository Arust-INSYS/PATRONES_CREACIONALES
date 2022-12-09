package clases;

// CLASE DIRECTOR.
// GESTIONA LA CREACION DEL PRODUCTO
// RECIBE CUALQUIER TIPO DE PIZZA QUE SE LE SOLICITE
public class Cocina {

    private PizzaBuilder pizzaBuilder;

    /* SE HACE USO DE POLIMORFISMO, EL OBJETO QUE SE RECIBE EN EL ATRIBUTO PB QUE RECIBE UN TIPO DE PIZZA
    BASANDOSE EN ESE METODO*/
    public void setPizzaBuilder(PizzaBuilder pb) {
        pizzaBuilder = pb;
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }

    @Override
    public String toString() {
        return "Cocina{" + "pizzaBuilder=" + pizzaBuilder.toString() + '}';
    }

    /* DEPENDIENDO DEL PIZZABUILDER QUE SE RECIBA SE CAMBIARAN LOS VALORES DE LOS ATRIBUTOS 
    DE LA PIZZA*/
    public void construirPizza() {

        pizzaBuilder.crearNuevaPizza();
        pizzaBuilder.buildMasa();
        pizzaBuilder.buildSalsa();
        pizzaBuilder.buildRelleno();
    }
}
