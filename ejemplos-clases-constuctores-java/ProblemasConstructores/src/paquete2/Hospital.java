/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Hospital {
    private String nombre;
    private String ciudad;
    private int numeroDoctores;
    private int numeroEnfermeros;
    
    /*
        Crear un constructor que reciba como parámetros
        valores que serán asignados a los atributos.
    
    */
    public Hospital(String name,String ciud,int numDoc, int numEnfer){
        nombre = name;
        ciudad = ciud;
        numeroDoctores = numDoc;
        numeroEnfermeros = numEnfer;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerCiudad(String n){
        ciudad = n;
    }
    
    public void establecerNumeroDoctores(int n){
        numeroDoctores = n;
    }
    
    public void establecerNumeroEnfermeros(int n){
        numeroEnfermeros = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerCiudad(){
        return ciudad;
    }
    
    public int obtenerNumeroDoctores(){
        return numeroDoctores;
    }
    
    public int obtenerNumeroEnfermeros(){
        return numeroEnfermeros;
    }
    @Override
    public String toString() {
        String cadena = String.format("Los datos del hospital\n"
                +"Nombre: %s\n"
                +"Ciudad: %s\n"
                +"Numero de doctores: %d\n"
                +"Numero de enfermeros:%d\n",
                obtenerNombre(),
                obtenerCiudad(),
                obtenerNumeroDoctores(),
                obtenerNumeroEnfermeros());
        return cadena;
    }
    
}
