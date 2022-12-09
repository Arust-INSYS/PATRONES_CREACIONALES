package singleton;

public class SingletonPatternDemo {

    public static void main(String[] args) throws InterruptedException {

        // Constructor ilegal
        // ESTA INSTACIA NOS VA A DAR UN ERROR POR QUE NO SE PUEDE INSTANCIAR
        //SingleObject object0 = new SingleObject();
        
        // CON ESTO SE LLAMA A LA PRIMERA INSTANCIA
        SingleObject object1 = SingleObject.getInstance();
        object1.showMessage();

        System.out.println("\nEsperando de 3 segundos...\n");
        Thread.sleep(3000);

        // MUESTRA EL MISMO VALOR DE LA INSTANCIA 
        SingleObject object2 = SingleObject.getInstance();
        object2.showMessage();

    }

}
