
package listasenlazadas;

/**
 *
 * @author Nacho
 */
public class Nodo {
    public int dato;
    public Nodo siguiente;//Constructor para insertar al Final
    public Nodo (int d){
        this.dato=d;
        this.siguiente=null;
    }
    public Nodo(int d,Nodo n){//Es el constructor para insertar al Inicio
        dato=d;
        siguiente=n;
        
    }
}
