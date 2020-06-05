
package listasenlazadas;

import javax.swing.JOptionPane;

/**
 *
 * @author Nacho
 */
public class ListasEnlazadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista listita=new Lista(); 
        int opcion=0,el;
        do{
            try {
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.Agregar un Elemento al Inicio de la Lista\n2.Agregar un Elemento al Final de la Lista\n"
                        + "3.Mostrar los datos de la lista\n"
                        + "4.Eliminar un elemento del Inicio de la Lista\n"
                        + "5.Salir","Menu de Opciones",3));
                
               switch (opcion){
                   case 1:
                       try {
                           el=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el Elemento:",
                                   "Insertando al Inicio",3));
                          //Agrego el Nodo
                           listita.agregarAlInicio(el);
                       } catch (NumberFormatException n) {  
                       JOptionPane.showMessageDialog(null, "Error"+ n.getMessage());
                       }
                       break;
                   case 2:
                       try {
                           el=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el Elemento:",
                                   "Insertando al Final",3));
                          //Agrego el Nodo
                           listita.agregarAlFinal(el);
                       } catch (NumberFormatException n) {  
                       JOptionPane.showMessageDialog(null, "Error"+ n.getMessage());
                       }
                       break;
                   case 3:
                       listita.mostrarLista();
                       break;
                   case 4:
                       el=listita.borrarDelInicio();
                       JOptionPane.showMessageDialog(null, "El elemento eliminado es" +el,
                               "Eliminanado Nodo del Inicio",JOptionPane.INFORMATION_MESSAGE);
                        break;
                   case 5:
                   JOptionPane.showMessageDialog(null, "Programa Finalizado");
                       break;
                   default:
                       JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
               }
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error"+ e.getMessage());
            }
        }while(opcion!=5);
    }
    
}
