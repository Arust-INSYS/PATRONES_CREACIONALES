/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package method;

import javax.swing.JOptionPane;

/*
 * @author BRYAN_CABRERA
 */
public class Paquete50 extends PlanClaro {

    @Override
    public void descricionPaquete(String telefono) {
        JOptionPane.showMessageDialog(null, "\n\n   Su telefono " + telefono + " tiene: \n\n\n-------PAQUETE DE 50$ ACTIVADO------\n\n*|  >  10GB\n*|  >  Minutos y mensajes ilimitados\n"
                + "*|  >  20GB Para WhatsApp\n*|  >  No Aplica Redes Sociales\n*|  >  Vigencia 90 dias desde su activacion");
    }

}
