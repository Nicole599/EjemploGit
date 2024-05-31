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
        ArrayList<Producto> productos=new ArrayList<>();
        productos.add(new Producto("1","Tornillos"));
        productos.add(new Producto("2","Tuercas"));
        productos.add(new Producto("3","Clavos"));
        productos.add(new Producto("4","Pintura"));
        
        
        JOptionPane.showMessageDialog(null,imprimirProductos(productos));
    }
    
    //Metodo estatico
    private static String imprimirProductos(ArrayList<Producto> productos){
        //variable tipo string
        String lista ="";
        //Clase iterator resive un tipo
        Iterator <Producto> iterator=productos.iterator();
        
        //bucle while hasnext retorna booleano el cual indica si hay elemento o no sigueinte de la lista
        while(iterator.hasNext()){
            //variablelista-next retorna el elemento siguiente de la lista
            lista += iterator.next().toString();
        }
        return lista;
    }
}
