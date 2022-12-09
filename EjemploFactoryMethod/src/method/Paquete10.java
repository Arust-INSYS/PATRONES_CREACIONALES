/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package method;

import javax.swing.JOptionPane;

/*
 * @author BRYAN_CABRERA
 */
public class Paquete10 extends PlanClaro {

    @Override
    public void descricionPaquete(String telefono) {
        JOptionPane.showMessageDialog(null, "\n\n   Su telefono " + telefono + " tiene: \n\n\n-------PAQUETE DE 10$ ACTIVADO------\n\n*|  >  100MB\n*|  >  Minutos y mensajes ilimitados\n"
                + "*|  >  500MB Para WhatsApp\n*|  >  No Aplica Redes Sociales\n*|  >  Vigencia 30 dias desde su activacion");
    }

}
