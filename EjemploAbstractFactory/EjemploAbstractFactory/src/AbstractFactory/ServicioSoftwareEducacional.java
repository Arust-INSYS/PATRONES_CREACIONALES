package AbstractFactory;

public class ServicioSoftwareEducacional implements ServicioInformatico {

    @Override
    public void asignarTrabajo() {
        
        System.out.println("\n  -  Nuestros programadores han sido informados del programa que deben realizar.");
    }

    @Override
    public void indicarFechaEntrega() {
        
        System.out.println("  -  Se ha fijado como fecha de entrega el día 10/12/2022.");
    }

    @Override
    public void informarSobrePago() {
        
        System.out.println("  -  El monto a pagar será proporcional a la cantidad de estudiantes que harán uso del software.");
    }

}
