# Lista Doblemente Enlazada Circular en Java

Este proyecto implementa un Tipo de Dato Abstracto (TDA) que representa una lista doblemente enlazada circular utilizando estructuras dinámicas en Java.

## Descripción del TDA

Una lista doblemente enlazada circular es una estructura de datos donde:
- Cada nodo contiene enlaces (punteros) tanto al nodo siguiente como al nodo anterior.
- El último nodo de la lista enlaza con el primero, y el primero enlaza con el último, formando un círculo.
- No hay nodos nulos en los enlaces entre nodos.

## Comportamiento Circular

El comportamiento circular se logra mediante:
1. El campo `next` del último nodo apunta al primer nodo (head).
2. El campo `prev` del primer nodo apunta al último nodo (tail).
3. Esto permite recorrer la lista indefinidamente en ambas direcciones.

## Operaciones implementadas

1. `insert(value)`: Inserta un nuevo nodo con el valor especificado al final de la lista.
2. `next()`: Mueve el puntero actual al siguiente nodo en la lista.
3. `previous()`: Mueve el puntero actual al nodo anterior en la lista.
4. `printCurrent()`: Muestra el valor del nodo actual.

## Instrucciones para compilar y ejecutar

1. Asegúrate de tener instalado Java JDK en tu sistema.
2. Clona este repositorio o descarga los archivos fuente.
3. Abre una terminal en el directorio que contiene los archivos .java.
4. Compila los archivos con: VSCode o IntellijIdea
5. Ejecuta el programa con: VSCode o IntellijIdea
6. Sigue las instrucciones del menú interactivo para probar la lista.

## Ejemplo de uso

1. Insertar valores: 10, 20, 30
2. Avanzar al siguiente nodo
3. Retroceder al nodo anterior
4. Imprimir el nodo actual

La lista mantendrá su estructura circular independientemente de las operaciones realizadas.