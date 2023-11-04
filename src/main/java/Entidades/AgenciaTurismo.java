package Entidades;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author USER
 */
import java.util.ArrayList;
import java.util.Scanner;


public class AgenciaTurismo {

    public static void main(String[] args) {
        //        inicializamos paquetes por defecto pilasss
    public ArrayList<PaqueteTuristico> paquetes;

    public AgenciaTurismo() {
        paquetes = new ArrayList<>();
        paquetes.add(new PaqueteTuristico(1, "Costa", "Guayaquil - Milagro", 75.9));
        paquetes.add(new PaqueteTuristico(2, "Sierra", "Quito - Ambato", 125));
        paquetes.add(new PaqueteTuristico(3, "Oriente", "Cueva de los Tallos - Yasuni", 170));
        paquetes.add(new PaqueteTuristico(4, "Galapagos", "Islas Galápagos: Santa Cruz - Santa Isabela", 300));
    }
    

    Scanner scanner = new Scanner(System.in);

        int opcionUsuario;
    PaqueteTuristico paqueteElegido;
    Cliente clienteFalso;

    
        do {
        
    System.out.println("Menu de opciones: ");
        System.out.println("1. Registrar usuario");
        System.out.println("2. Elegir paquete turístico");
        System.out.println("3. Hacer una reserva");
        System.out.println("4. Mostrar los datos de la reservacion");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
        opcionUsuario = scanner.nextInt();

        switch (opcionUsuario) {
            case 1:
                //LE PEDIMOS LOS DATOS BASICOS, CUANDO HAGA UNA RESERVA SE EXTIENDEN LOS MISMO MEDIANTE SETTERS DE LA INSTANCIA DEL OBJETO RESERVA Q PIDA EL CORREO 
                clienteFalso.solicitarDatos();

                //PODRIAMOS AGREGARLE UN  SETTER PARA PASARLE EL SCANNER 
                clienteFalso.sc = scanner;
                break;
            case 2:
                // SE MUESTRAN LOS PAQUETES Y SE LOS ELIGE MEDIANTE EL ID YA NO POR EL NOMBRE

                System.out.println("Paquetes Turísticos Disponibles:");
                for (int i = 0; i < paquetes.size(); i++) {

                    //ERROR DE CONCEPTO :EL ArrayList expone el metodo GET para acceder a un nodo en especifico :D
                    PaqueteTuristico paquete = paquetes.get(i);

                    System.out.println(paquete.getId() + ". " + paquete.getNombre());
                    System.out.println("   Descripción: " + paquete.getDescripcion());
                    System.out.println("   Precio Base: $" + paquete.getPrecioBase());

                    System.out.print("Seleccione un paquete turistico ingrese el numero: ");
                    int seleccion = scanner.nextInt();
                    if (seleccion >= 1 && seleccion <= paquetes.size()) {
                        // Crea una reserva con el paquete seleccionado
                        //ERROR DE CONCEPTO QUE ME HIZO PERDER TIEMPO  :_: AL OBTENER LOS DATOS PARA CREAR LA RESERVA DEBES DE PONER EL -1 PORQUE SE CREAN LOS 
                        //OBJETOS DE TIPO PAQUETE PERO SE CREAN CON EL ( 0 )NO CON EL ( 1 )

                        paqueteElegido = paquetes.get(seleccion - 1);

                    } else {
                        System.out.println("Elija un id de los paquetes disponibles: ");
                    }

                    // CALCULAR EL PRECIO FINAL Y SI LA COMIDA ESTA INCLUIDA
                    double precioFinal = paquete.getPrecioBase();

                    if (paquete.getId() == 1) {
                        precioFinal += 100;
                    } else if (paquete.getId() == 2) {
                        precioFinal += 200;
                    } else if (paquete.getId() == 3) {
                        precioFinal += 300;
                    } else if (paquete.getId() == 4) {
                        precioFinal += 600;

                    }
                    if (paquete.isComidaIncluida()) {
                        precioFinal += 150;
                    }
                    System.out.println(" El precio final del viaje a: " + paquete.getNombre() + "seria: " + precioFinal);
                }

                break;

            // MOSTRAR Y ELEGIR EL PAQUETE POSTERIORMENTE SE GUARDA EN LA INSTANCIA DE UNA RESERVA EN SU CONSTRUCTOR
            case 3:
                // instancia de la clase Reserva y asignar el paqueteElegido  cliente con los datos guardados en el reguistro de usuarios
                //Pedir datos adicionales para hacer la reserva
                System.out.println("Ingrese la fecha para la cual desea hacer la reservacion");
                String fechaReservacion = scanner.nextLine();
                System.out.println("Ingrese el correo electronico a donde le llegara la factura: ");
                String CorreoElectronicoReservacion = scanner.nextLine();
                Reserva reservacion = new Reserva();
//      Reserva reservacion=new Reserva(paqueteElegido, clienteFalso, fechaReservacion, CorreoElectronicoReservacion, scanner);
//      reservacion.PedirDatosReserva();
                // Implementa la lógica para hacer una reserva
                Reserva reservacionGuardada = reservacion.GuardarDatosReserva(paqueteElegido, clienteFalso, fechaReservacion, CorreoElectronicoReservacion, scanner);
                break;
            case 4:
                System.out.println("");
            case 5:
                System.out.println("Gracias por utilizar la agencia de turismo del grupo #2.");
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
        }
        while (opcionUsuario != 4);
    }
}
