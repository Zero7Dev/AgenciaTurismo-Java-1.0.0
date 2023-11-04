package Entidades;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Reserva {
    private int idReserva;
    private String fecha;
    private String correo;

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    private Cliente cliente;
    private PaqueteTuristico paqueteSelecionado;
    private Scanner sc;
    // Otros atributos y métodos necesarios

    public Reserva(PaqueteTuristico paqueteSeleccionado,Cliente client ,String fecha,String correo,Scanner scan) {
        idReserva=(int) (Math.random() * 100) + 1;;
        this.fecha = fecha;
        this.correo=correo;
        this.cliente=client;
        this.paqueteSelecionado=paqueteSelecionado;
        sc=scan;
    }
    public void MostrarReservacion(){
        //darle una mejor apariencia
        
        this.cliente.getNombreCompleto();
        this.cliente.getCorreo();
        this.getFecha();
        this.paqueteSelecionado.getDescripcion();
        this.paqueteSelecionado.getNombre();
        this.cliente.getCedula();
        this.cliente.getTelefono();
    }
    public Reserva(){}
    public Reserva GuardarDatosReserva(PaqueteTuristico paqueteSelecionado,Cliente cliente,String fecha,String correo,Scanner scanner){   
        Reserva ReservaPrueba=new Reserva(paqueteSelecionado, cliente, fecha, correo, scanner);
        System.out.print("Ingrese su correo: ");
        ReservaPrueba.setCorreo(sc.nextLine());

        return ReservaPrueba;
        // Implementa la lógica para pedir los datos del cliente
    }
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
//        integrar los valores del paquete o crear un atributo de tipo paquete el cual nos tengan q pasar ademas de los datos necesarios como la fecha de la 
//reserva