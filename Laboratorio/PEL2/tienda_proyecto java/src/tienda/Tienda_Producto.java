/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.util.ArrayList;

/**
 *
 * @author laura
 */
public class Tienda_Producto 
{
    private int id_tienda_Tienda;
    private int cod_barras_Producto;
    private int stock = (int)(10 + (200 - 10)*Math.random());
    private String fila;

    public Tienda_Producto(int id_tienda_Tiendaa, String separadorTupla, String separadorDato, ArrayList<Integer> listaProductos) {
        this.id_tienda_Tienda = id_tienda_Tiendaa;
        generarCodBarras(listaProductos);
        fila = id_tienda_Tienda + separadorDato + cod_barras_Producto + separadorDato + stock + separadorTupla;
    }
    
    public String getFila() {
        return fila;
    }
    
    private void generarCodBarras(ArrayList<Integer> listaProductos)
    {
        cod_barras_Producto = (int)(1 + (1000000 - 1)*Math.random());
        boolean noRepetido = true;
        
        if (listaProductos.size() > 0)
        {
            for (int i = 0; i < listaProductos.size(); i++)
            {
                if (cod_barras_Producto == listaProductos.get(i))
                {
                    noRepetido = false;
                }
            }
            
            if (noRepetido == false)
            {
                generarCodBarras(listaProductos);
            }
        }
    }

    public int getCod_barras_Producto() {
        return cod_barras_Producto;
    }
    
    
}
