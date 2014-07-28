/*Algoritmos y Estructura de Datos
  Integrantes: Olga Cobaquil  13020
               Álvaro Sánchez 13657  
  Fecha: 24/07/14
  Descripción: Clase StArray para el uso por la clase principal */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author Olga Cobaquil
 */
public class StArray<E> implements Stack<E>
{
	protected ArrayList<E> data;

	public StArray()
	// post: constructs a new, empty stack
	{
		data = new ArrayList<E>();
	}

	public void push(E item)
	// post: the value is added to the stack
	//          will be popped next if no intervening push
	{
		data.add(item);
	}

	public E pop()
	// pre: la pila no esta vacia
	// post: se remieve el ultimo valor utiliado de la pila 
	{
		return data.remove(size()-1);
	}

	public E peek()
	// pre: la pila no esta vacia
	// post: retorna el numero de arriba de la pila
	{
		return data.get(size() - 1);
	}
	
	public int size()
	// post: retorna el numero de elementos en la pila
	{
		return data.size();
	}
  
	public boolean empty()
	// post: retorna true si la pila esta vacia
	{
		return size() == 0;
	}
}