package AbstractFactory;

//Implementan Producto abstracto - Estas clases son Productos Concretos
public class ServicioDesign implements ServicioInformatico {

    @Override
    public void asignarTrabajo() {

        System.out.println("\n  -  El trabajado ha sido asignado a diseñadores gráficos disponibles.");
    }

    @Override
    public void indicarFechaEntrega() {

        System.out.println("  -  Ellos han determinado terminar el trabajo como máximo para el día 05/01/2023.");
    }

    @Override
    public void informarSobrePago() {

        System.out.println("  -  Debe realizar el pago en efectivo al momento de recoger el logo completamente terminado.");
    }

}
