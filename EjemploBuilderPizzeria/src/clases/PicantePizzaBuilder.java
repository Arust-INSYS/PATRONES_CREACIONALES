package clases;

// CONCRETE BUILDER.

// TIPO DE PIZZA A CONSTRUIR
// SE LE VAN DANDO VALORES A ESTA PIZZA
// SE CREAN OBJETOS DE UNA SOLA CLASE
public class PicantePizzaBuilder extends PizzaBuilder {
    
    @Override
    public void buildMasa() { 
        pizza.setMasa("Cocida"); 
    }
    
    @Override
    public void buildSalsa() { 
        pizza.setSalsa("Picante"); 
    }
    
    @Override
    public void buildRelleno() { 
        pizza.setRelleno("Pimienta + Salchichón"); 
    }
    
}
