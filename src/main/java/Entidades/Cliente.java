package Entidades;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ALEJANDRA
 */
public class Cliente {

    Scanner sc;
    private String nombreCompleto;
    private String correo;
    private String cedula;
    private int telefono;

    public Cliente(Scanner scan) {
        this.sc = scan;
    }

    public Cliente(String nombreCompleto, String correo, Scanner scan) {
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
        this.sc = scan;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Cliente() {

    }

    Cliente clienteSistema = new Cliente();

    public Cliente solicitarDatos() {

        System.out.print("Ingrese su Nombre Completo ");
        clienteSistema.setNombreCompleto(sc.nextLine());

        System.out.print("Ingrese su cedula: ");
        clienteSistema.setCedula(sc.nextLine());

        System.out.print("Ingrese su numero de Telefono: ");
        clienteSistema.setTelefono(sc.nextInt());
        return clienteSistema;

    }}
    // PRUEBA :CREAMOS UN CLIENTE FALSO A EL LE SETIAMOS LOS VALORES Y LO DEVOLVELMOS LO ASIGNAMOS A UNA VARIABLE Y ESA VARIABLE SE LA PASAMOS AL CONSTRUCTOR
// DE RESERVA PARA Q PUEDA GENERAR LA RESERVA
