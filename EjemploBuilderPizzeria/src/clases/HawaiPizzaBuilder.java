package clases;

// CONCRETE BUILDER.

// TIPO DE PIZZA A CONSTRUIR
// SE LE VAN DANDO VALORES A ESTA PIZZA
public class HawaiPizzaBuilder extends PizzaBuilder {
    
    @Override
    public void buildMasa() { 
        pizza.setMasa("Suave"); 
    }
    
    @Override
    public void buildSalsa() { 
        pizza.setSalsa("Dulce"); 
    }
    
    @Override
    public void buildRelleno() { 
        pizza.setRelleno("Chorizo + Alcachofas"); 
    }
}
