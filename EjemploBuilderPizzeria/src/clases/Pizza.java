package clases;

// CLASE PRODUCTO DONDE SE TENDRAN VALORES PREDETERMINADOS PARA LOS ATRIBUTOS DE ESTA CLASE.
// PERMITE CREAR OBJETOS DE ESTA UNICA CLASE, CON VALORES PREDETERMINADOS
public class Pizza {

    private String masa = "";
    private String salsa = "";
    private String relleno = "";

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    @Override
    public String toString() {
        return "\n  -  Masa > " + masa + "\n  -  Salsa > " + salsa + "\n  -  Relleno > " + relleno;
    }

}
