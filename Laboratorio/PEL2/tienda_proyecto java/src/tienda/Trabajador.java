/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author laura
 */
public class Trabajador 
{
    private int cod_trabajador;
    private int DNI;
    private String nombre;
    private String apellidos;
    private String puesto;
    private int salario;
    private int id_tienda_Tienda;
    private String fila;

    public Trabajador(int cod_trabajadorr, String separadorTupla, String separadorDato, String[] puestos, ArrayList<Integer> listaDNI) 
    {
        this.cod_trabajador = cod_trabajadorr;
        
        generarDNI(listaDNI);
        
        nombre = generarNombre((int) (2 + 7 * Math.random()));
        apellidos = generarNombre((int) (2 + 7 * Math.random())) + " " + generarNombre((int) (2 + 7 * Math.random()));
        puesto = puestos[(int)(puestos.length * Math.random())];
        salario = (int) (1000 + 4000 * Math.random());
        id_tienda_Tienda = (int)(1 + (200000-1) * Math.random());
        fila = cod_trabajador + separadorDato + DNI + separadorDato + nombre + separadorDato + apellidos + separadorDato + puesto + separadorDato + salario + separadorDato + id_tienda_Tienda + separadorTupla; 
    }
    
    private String generarNombre(int tamanio)
    {
        //rangos numéricos código Ascii (mayúsculas)
        int Num1 = 65;
        int Num2 = 90; 
        
        //rangos numéricos código Ascii minúsculas
        int num1 = 97;
        int num2 = 122;
        
        char palabra[] = new char[tamanio]; 
        
        int numAleatorio = (int) (Num1 + (Num2 - Num1) * Math.random());
        char char_letra = (char)numAleatorio;
        palabra[0] = char_letra;
        
        for (int i = 1; i < tamanio; i++)
        {
            numAleatorio = (int) (num1 + (num2 - num1) * Math.random());
            char_letra = (char)numAleatorio;
            palabra[i] = char_letra;
        }
        
        String nombree = "";
        
        for (int i = 0; i < tamanio; i++)
        {
            String letra = Character.toString(palabra[i]);
            nombree = nombree + letra;
        }
        
        return nombree;
        
    }

    public String getFila() {
        return fila;
    }
    
    public void generarDNI(ArrayList<Integer> listaDNI)
    {
        DNI = (int)(1 + (99999999 - 1)*Math.random());
        boolean noRepetido = true;
        
        if (listaDNI.size() > 0)
        {
            for (int i = 0; i < listaDNI.size(); i++)
            {
                if (DNI == listaDNI.get(i))
                {
                    noRepetido = false;
                }
            }
            if (noRepetido == false)
            {
                generarDNI(listaDNI);
            }
        }
    }

    
    public int getDNI() 
    {
        return DNI;
    }
    
}

