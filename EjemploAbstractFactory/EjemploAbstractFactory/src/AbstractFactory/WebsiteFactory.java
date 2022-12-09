package AbstractFactory;

//Se encargan de implementar la Factoria Abstracta
public class WebsiteFactory implements ServicioFactory {

    @Override
    public ServicioInformatico crearServicio() {

        //Devulve un servicio Website
        return new ServicioWebsites();
    }

}
