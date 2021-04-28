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
    public Hospital(String name,String ciudad,int numDoc, int numEnfer){
        nombre = name;
        ciudad = ciudad;
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
    
    
}
