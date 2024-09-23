package Pilas;
import java.util.Stack;

public class PilaConStack {
    public void pilaStack(){
        Stack<String>pila = new Stack<String>();
        pila.push("Hola");
        pila.push("Hola 2");
        pila.push("Hola 3");
        pila.push("Hola 4");

        System.out.println("Pila: " + pila);

        pila.pop();
        System.out.println("Pila Nueva: " + pila);

    }
}
