/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorproductos;

import java.util.*;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class IteratorProductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //crear lista
        ArrayList<producto> productos=new ArrayList<>();
        productos.add(new producto("1","Tornillos"));
        productos.add(new producto("2","Tuercas"));
        productos.add(new producto("3","Clavos"));
        productos.add(new producto("4","Pintura"));
        productos.add(new producto("5","Martillo"));
        productos.add(new producto("6","Taladro"));
        
        
        JOptionPane.showMessageDialog(null,imprimirProductos(productos));
    }
    
    //Metodo estatico
    private static String imprimirProductos(ArrayList<producto> productos){
        //variable tipo string
        String lista ="";
        //Clase iterator resive un tipo
        Iterator <producto> iterator=productos.iterator();
        
        //bucle while hasnext retorna booleano el cual indica si hay elemento o no sigueinte de la lista
        while(iterator.hasNext()){
            //variablelista-next retorna el elemento siguiente de la lista
            lista += iterator.next().toString();
        }
        return lista;
    }
}
