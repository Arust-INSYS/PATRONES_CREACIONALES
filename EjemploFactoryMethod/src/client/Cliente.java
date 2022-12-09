/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package client;

import java.util.Scanner;
import method.PlanClaro;
import method.PlanClaroFactory;

/*
 * @author BRYAN_CABRERA
 */

//Sirve para crear una jerarquia de clases
public class Cliente {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String plan = "", numero = "";

        System.out.println("\nPlanes Claro");

        do {
            System.out.print("\nIngrese su numero Telefonico > ");
            numero = teclado.nextLine();
        } while (!numero.matches("[0-9]*"));

        do {
            System.out.print("\n\nEliga un Plan para Activar > ");
            plan = teclado.nextLine();
        } while (!plan.matches("[0-9]*"));

        int planact = Integer.parseInt(plan);

        //Se instancia la clase dependiendo el paquete
        PlanClaro paquete = new PlanClaroFactory().getPaquete(planact);

        paquete.setTelefono(numero);
        String tel = paquete.getTelefono();

        paquete.descricionPaquete(tel);

    }

}
