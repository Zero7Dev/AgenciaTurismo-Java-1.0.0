package Entidades;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ALEJANDRA
 */
public class PaqueteTuristico {
    private String nombre;
    private double PrecioBase;
    private String descripcion;
    private boolean isComidaIncluida;
    private int id;
    // Otros atributos y métodos necesarios

    
    public PaqueteTuristico(int id, String nombre, String descripcion,double PrecioBase) {
        this.id=id;
        this.nombre = nombre;
        this.PrecioBase = PrecioBase;
        this.descripcion = descripcion;
        this.isComidaIncluida=false;
    }
    //PARAMETROS OPCIONALES
    public PaqueteTuristico(int id, String nombre, String descripcion,double PrecioBase,String isComidaIncluida) {
        this.id=id;
        boolean respuesta=isComidaIncluida.equalsIgnoreCase("Si");
        this.isComidaIncluida=respuesta;
        this.nombre = nombre;
        this.PrecioBase = PrecioBase;
        this.descripcion = descripcion;
    }
    public boolean isComidaIncluida() {
        return isComidaIncluida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIsComidaIncluida(boolean isComidaIncluida) {
        this.isComidaIncluida = isComidaIncluida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return PrecioBase;
    }

    public void setPrecioBase(double PrecioBase) {
        this.PrecioBase = PrecioBase;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}

