package AbstractFactory;

//Producto abstracto - Definen lo que van a tener las clases concretas
public interface ServicioInformatico {

    public void asignarTrabajo();

    public void indicarFechaEntrega();

    public void informarSobrePago();
}
