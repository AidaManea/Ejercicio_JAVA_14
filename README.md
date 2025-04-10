# Gestión de Productos en Archivo Binario

## Descripción

Este proyecto tiene como objetivo crear un programa en Java que permita gestionar un archivo binario para almacenar información sobre una lista de productos. Cada producto tiene los siguientes atributos:

- **Código del producto** (entero)
- **Nombre del producto** (cadena de texto)
- **Precio** (decimal)
- **Cantidad en stock** (entero)

El programa ofrece diversas funcionalidades para manipular el archivo binario que almacena la información de los productos, utilizando las clases `FileInputStream`, `FileOutputStream`, `ObjectInputStream`, y `ObjectOutputStream`.

## Funcionalidades

1. **Agregar productos:** Permite al usuario ingresar los datos de un nuevo producto y añadirlo al archivo binario.
2. **Listar productos:** Lee todos los productos almacenados en el archivo binario y los muestra en la consola.
3. **Buscar un producto:** Permite al usuario buscar un producto por su código y mostrar sus datos si existe.
4. **Actualizar stock:** Permite modificar la cantidad en stock de un producto específico, identificándolo por su código.
5. **Eliminar un producto:** Elimina un producto del archivo binario identificándolo por su código.

## Requisitos

- **Java:** Este programa ha sido desarrollado en Java, utilizando Eclipse como entorno de desarrollo.
- **Sistema operativo:** El programa es independiente del sistema operativo, siempre que se tenga instalado Java en el dispositivo.
