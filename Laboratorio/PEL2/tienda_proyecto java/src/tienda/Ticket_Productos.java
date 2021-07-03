/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.util.ArrayList;

/**
 *
 * @author laura e isabel
 */
public class Ticket_Productos 
{
    private int num_ticket_Ticket;
    private int cod_barras_Producto;
    private int cantidad;
    private String fila;

    public Ticket_Productos(int num_ticket_Tickett, String separadorTupla, String separadorDato, ArrayList<Integer> listaProductos) {
        cantidad = (int)(1 + 9 * Math.random());
        this.num_ticket_Ticket = num_ticket_Tickett;
        generarCodBarras(listaProductos);
        fila = cantidad + separadorDato + cod_barras_Producto + separadorDato + num_ticket_Ticket + separadorTupla;
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
            System.out.println(noRepetido);
            if (noRepetido == false)
            {
                System.out.println("-----------------------------");
                generarCodBarras(listaProductos);
            }
        }
    }
    
    public String getFila() {
        return fila;
    }
    
    public int getCod_barras_Producto() {
        return cod_barras_Producto;
    }
}
