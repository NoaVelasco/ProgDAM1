/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author dam1
 */
public class Cafetera {

    private int _capacidadMaxima = 1000;
    private int _capacidadActual = 0;


    public void llenarCafetera() {
        System.out.println("JJjjjjjjjj... ssssshhhh... Cafetera llena.");
        this._capacidadActual = _capacidadMaxima;
    }

    public void servirTaza(int tamTaza) {
        if (this._capacidadActual == 0) {
            System.out.println("No queda café.");
        } else if (tamTaza > this._capacidadActual) {
            System.out.println("Toma tu taza de " + this._capacidadActual + " c.c.");
            this._capacidadActual = 0;
            System.out.println("No queda café.");
        } else {
            System.out.println("Toma tu taza de " + tamTaza + " c.c.");
            this._capacidadActual -= tamTaza;
            System.out.println("Te quedan " + this._capacidadActual + " c.c.");
        }
    }

    public void vaciarCafetera() {
        System.out.println("FLUSSSSSH!");
        this._capacidadActual = 0;
    }

    public void agregarCafe(int tamCafe) {
        System.out.println("JJjjjjjjjj... ssssshhhh...");
        if (this._capacidadActual + tamCafe > this._capacidadMaxima) {
            this._capacidadActual = this._capacidadMaxima;
        } else {
            this._capacidadActual += tamCafe;
        }
        System.out.println("Tu cafetera tiene " + this._capacidadActual + " c.c.");
    }

    public Cafetera() {
    }

    public Cafetera(int _capacidadMaxima) {
        this._capacidadMaxima = _capacidadMaxima;
        this._capacidadActual = _capacidadMaxima;
    }

    public Cafetera(int _capacidadMaxima, int _capacidadActual) {
        this._capacidadMaxima = _capacidadMaxima;
        if (_capacidadActual > _capacidadMaxima) {
            this._capacidadActual = _capacidadMaxima;
        } else {
            this._capacidadActual = _capacidadActual;
        }
    }

    public int getCapacidadMaxima() {
        return _capacidadMaxima;
    }

    public void setCapacidadMaxima(int _capacidadMaxima) {
        this._capacidadMaxima = _capacidadMaxima;
    }

    public int getCapacidadActual() {
        return _capacidadActual;
    }

    public void setCapacidadActual(int _capacidadActual) {
        this._capacidadActual = _capacidadActual;
    }

}
