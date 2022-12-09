package clases;

// ABSTRACT BUILDER.
// SE TENDRA UN ATRIBUTO DEL PRODUCTO A DESARROLLAR
public abstract class PizzaBuilder {

    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void crearNuevaPizza() {
        pizza = new Pizza();
    }

    @Override
    public String toString() {
        return "PizzaBuilder{" + "pizza=" + pizza + '}';
    }

    // METODOS ABSTRACTOS QUE SE ENCARGAN DE ASIGNAR VALORES PREDETERMINADOS
    // LOS VALORES NO SE DEFINEN AQUI YA QUE SON SOLO LOS PROTOTIPOS DEL PRODUCTO
    public abstract void buildMasa();

    public abstract void buildSalsa();

    public abstract void buildRelleno();
}
