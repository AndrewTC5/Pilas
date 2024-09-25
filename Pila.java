package Pilas;

public class Pila {

    private int capacidad;
    private String[] arreglo;
    private int cima;

    public Pila(int capacidad) {
        this.capacidad = capacidad;
        this.arreglo = new String[capacidad];
        this.cima = -1; 
    }

    public void push(String elemento) {
        if (estaLlena()) {
            System.out.println("Error: El Historial tiene su capacidad maxima.");
            return;
        }
        cima++;
        arreglo[cima] = elemento;
        System.out.println("La Busqueda '" + elemento + "' ha sido Guardado");
    }

    public String pop() {
        if (estaVacia()) {
            System.out.println("Error: Historial Vacio.");
            return null;
        }
        String elemento = arreglo[cima];
        cima--;
        System.out.println("Elemento " + elemento + " desapilado.");
         return elemento;
    }

    public String peek() {
        if (estaVacia()) {
            System.out.println("Error: Historial Vacio.");
            return null;
        }
        System.out.println("Elemento en la cima: " + arreglo[cima]);
        return arreglo[cima];
    }

    public boolean estaVacia() {
        return cima == -1;
    }

    public boolean estaLlena() {
        return cima == capacidad - 1;
    }

    public void mostrarPila() {
        if (estaVacia()) {
            System.out.println("Historial Vacio.");
            return;
        }
        System.out.print("Historial de Busquedas: \n");
        for (int i = cima; i >= 0; i--) {
            System.out.print(arreglo[i] + "\n");
        }
        System.out.println();
    }
}