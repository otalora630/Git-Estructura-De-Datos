/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author David Jimenez - Andres Gonzalez
 */
public class Ruta {
    private Nodo origen;
    private Nodo destino;
    private double distancia;
    
    public Ruta(Nodo origen, Nodo destino, double distancia) {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
    }
    
    public Nodo getOrigen() {
        return origen;
    }
    
    public Nodo getDestino() {
        return destino;
    }
    
    public double getDistancia() {
        return distancia;
    }
}
