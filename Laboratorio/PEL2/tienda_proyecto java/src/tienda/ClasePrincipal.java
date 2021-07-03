/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author laura e isa
 */
public class ClasePrincipal 
{    
    public static void main(String[] args) throws IOException 
    {
        String separadorTupla = "\n";
        String separadorDato = ",";        
        String ruta;
        BufferedWriter bw;
        /*
        //tienda
        ruta = "D:\\laura\\Documents\\UNIVERSIDAD\\3CARRERA\\2o cuatri\\BDA\\PEL2\\archivos\\Tienda.txt";
        File archivoTienda = new File(ruta);
        bw = new BufferedWriter(new FileWriter(archivoTienda));
        String[] provincias = new String[]{"A Corunia", "Lugo", "Ourense", "Pontevedra", "Asturias", "Cantabria", "Vizcaya", "Guipuzcoa", "Alava", "Navarra", "Huesca", "Zaragoza", "Teruel", "Lerida", "Gerona", "Barcelona", "Tarragona", "Leon", "Salamanca", "Zamora", "Valladolid", "Palencia", "Burgos", "Soria", "Segovia", "Avila", "La Rioja", "Madrid", "Caceres", "Badajoz", "Guadalajara", "Toledo", "Cuenca", "Albacete", "Ciudad Real", "Castellon", "Valencia", "Alicante", "Islas Baleares", "Huelva", "Sevilla", "Cordoba", "Jaen", "Cadiz", "Malaga", "Granada", "Almeria", "Murcia", "Sta Cruz de Tenerife", "Las Palmas"};
        int numTiendas = 200000;
        int contTiendas = 0;
        while (contTiendas != numTiendas)
        {
            contTiendas++;
            Tienda t = new Tienda (contTiendas, provincias , separadorTupla, separadorDato);
            bw.write(t.getFila());
        }
        bw.close();
        
        //trabajadores
        ruta = "D:\\laura\\Documents\\UNIVERSIDAD\\3CARRERA\\2o cuatri\\BDA\\PEL2\\archivos\\Trabajadores.txt";
        File archivoTrabajadores = new File(ruta);
        bw = new BufferedWriter(new FileWriter(archivoTrabajadores));
        ArrayList<Integer> listaDNI = new ArrayList();
        String[] puestos = new String[] {"jefe", "dependiente", "cajero", "reponedor"};
        int numTrabajadores = 1000000;
        int contTrabajadores = 0;
        while (contTrabajadores != numTrabajadores)
        {
            System.out.println(contTrabajadores);
            contTrabajadores++;
            Trabajador t = new Trabajador (contTrabajadores, separadorTupla, separadorDato, puestos, listaDNI);
            listaDNI.add(t.getDNI());
            bw.write(t.getFila());
        }
        bw.close();
        */
        //productos
        ruta = "D:\\laura\\Documents\\UNIVERSIDAD\\3CARRERA\\2o cuatri\\BDA\\PEL2\\archivos\\Productos.txt";
        File archivoProductos = new File(ruta);
        bw = new BufferedWriter(new FileWriter(archivoProductos));
        String[] tipos = new String[] {"comida", "limpieza", "higiene", "deporte", "ropa", "calzado"};
        String[] descripciones = new String[] {"Made in Sapin", "Made in China", "Made in France", "Made in Andorra"};
        int numProductos = 1000000;
        int contProductos = 0;
        while (contProductos != numProductos)
        {
            contProductos++;
            Productos p = new Productos (contProductos, tipos, descripciones, separadorTupla, separadorDato);
            bw.write(p.getFila());
        }
        bw.close();
        /*
        //tickets
        ruta = "D:\\laura\\Documents\\UNIVERSIDAD\\3CARRERA\\2o cuatri\\BDA\\PEL2\\archivos\\TicketsLauraPrueba.txt";
        String rutai = "D:\\laura\\Documents\\UNIVERSIDAD\\3CARRERA\\2o cuatri\\BDA\\PEL2\\archivos\\TicketsIsa.txt";
        File archivoTicketsLaura = new File(ruta);
        File archivoTicketsIsa = new File(rutai);
        bw = new BufferedWriter(new FileWriter(archivoTicketsLaura));
        BufferedWriter bwi = new BufferedWriter(new FileWriter(archivoTicketsIsa));
        int numTickets = 10;
        int contTickets = 0;
        while (contTickets != numTickets)
        {
            contTickets++;
            Ticket t = new Ticket ( contTickets, (int)(1 + (1000000-1)*Math.random()), separadorTupla, separadorDato);
            bw.write(t.getFilaLaura());
            bwi.write(t.getFilaIsa());
        }
        bw.close();
        bwi.close();
               
        //Ticket_Producto        
        ruta = "D:\\laura\\Documents\\UNIVERSIDAD\\3CARRERA\\2o cuatri\\BDA\\PEL2\\archivos\\Ticket Productos.txt";
        File archivoTicketProductos = new File(ruta);
        bw = new BufferedWriter(new FileWriter(archivoTicketProductos));
        
        int numTicket = 5000000;
        int contTicket = 0;
        while (contTicket < numTicket)
        {
            ArrayList<Integer> listaProductos = new ArrayList();
            System.out.println("#"+contTicket);
            int numProductosTicket = (int)(1 + 10*Math.random());
            
            while (numProductosTicket != 0)
            {
                System.out.println("--> " + numProductosTicket);
                Ticket_Productos tpp = new Ticket_Productos((contTicket+1), separadorTupla, separadorDato, listaProductos);
                bw.write(tpp.getFila());
                numProductosTicket--;
                listaProductos.add(tpp.getCod_barras_Producto());
            }
            contTicket++;
        }
        
        bw.close();
        /*
        //Tienda_Producto
        ruta = "D:\\laura\\Documents\\UNIVERSIDAD\\3CARRERA\\2o cuatri\\BDA\\PEL2\\archivos\\Tienda Producto.txt";
        File archivoTiendaProducto = new File(ruta);
        bw = new BufferedWriter(new FileWriter(archivoTiendaProducto));
        int numTienda = 200000;
        int contTienda = 0;
        
        while (contTienda < numTienda)
        {
            ArrayList<Integer> listaProductos = new ArrayList();
            System.out.println("#"+contTienda);
            int numProductosTienda = 100;
            
            while (numProductosTienda != 0)
            {
                System.out.println("--> " + numProductosTienda);
                Tienda_Producto tpp = new Tienda_Producto((contTienda+1), separadorTupla, separadorDato, listaProductos);
                bw.write(tpp.getFila());
                numProductosTienda--;
                listaProductos.add(tpp.getCod_barras_Producto());
            }
            contTienda++;
        }
        bw.close();
        */
    }
    
}
