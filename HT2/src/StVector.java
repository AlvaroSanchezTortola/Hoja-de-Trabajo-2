/*Algoritmos y Estructura de Datos
  Integrantes: Olga Cobaquil  13020
               Álvaro Sánchez 13657  
  Fecha: 24/07/14
  Descripción: Clase StVector para el uso del programa principal */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Vector;

/**
 *
 * @author Sanchez Tortola
 */
public class StVector<E> implements Stack<E>{
    
    protected Vector<E> data;

    public StVector() 
    // post: una pila nueva y vacia 
    {
        this.data = new Vector<E>();
    }
    
    @Override
    public void push(E item) 
    // post: el valor se pone en la pila
    {
        data.addElement(item);
    }

    @Override
    public E pop() 
    /*pre: la pila no esta vacia
     post: el ultimo valor es removido*/
    {
        return data.remove(size() -1);
    }

    @Override
    public E peek() 
    // pre: la pila no esta vacia
    // post: se retorna el valor de arriba de la pila 
    {
        return data.get(size() - 1);
    }

    @Override
    public boolean empty() 
    // post: retorna true si la pila estavacia
    {
        return size() == 0;
    }

    @Override
    public int size() 
    // post: retorna el numero de elementos en la pila*/
    {
        return data.size();
    }
    
    
    /*clear*/
    public void clear()
    {
        data.clear();
    }
}
