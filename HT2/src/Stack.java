/*Algoritmos y Estructura de Datos
  Integrantes: Olga Cobaquil  13020
               Álvaro Sánchez 13657  
  Fecha: 24/07/14
  Descripción: Clase Stack para el uso del programa principal */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sanchez Tortola
 */
public interface Stack<E> {
   public void push(E item);
   // pre: 
   // post: valor agregado a la pila
   
   public E pop();
   // pre: la pila no esta vacia
   // post: el ultimo valor es removido
   
   public E peek();
   // pre: la pila no esta vacia
   // post: retorna el valor de arriba
   
   public boolean empty();
   // post: retorna true si la pila esta vacia 
   
   public int size();
   // post: retorna el numero de elementos en la pila
   

}
