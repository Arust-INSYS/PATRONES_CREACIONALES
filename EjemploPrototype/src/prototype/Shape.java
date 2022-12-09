package prototype;

/**
 * Paso 1: Creamos la clase que implementara la interface Clonable (Habilidad de
 * ser clonada por otras instacias guardando los datos y valores que tengan en ese momento)
 *
 * @author
 */

// CLASE ABSTRACTA
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    abstract void draw();

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /* NOS SIRVE PARA CLONAR EL OBJETO */
    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
