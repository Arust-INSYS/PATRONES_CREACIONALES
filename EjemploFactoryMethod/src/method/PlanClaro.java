
package method;

/*
 * @author BRYAN_CABRERA
 */

//Metodo abstracto donde se describira el paquete
public abstract class PlanClaro {

    private String telefono;

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //Metodo que se transcibira
    public abstract void descricionPaquete(String telefono);
}
