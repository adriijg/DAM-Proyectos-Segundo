# Acceso a Datos



###### main (String\[] args) -> Parámetro.

###### java LeerFichTexto3 hola.txt

###### (Leerá lo que contenga el fichero txt.)



* Ficheros de texto: Solo caracteres.
* Ficheros binarios: Tienen también un tipo de datos. Ej: boolean, etc... Leemos los tipos de datos y sus datos.



##### Binarios

* Interfaz: comunica dos procesos diferentes, lo que el cliente ve y el código backend.
* Interfaz serializable: Guardar objetos en ficheros binarios.



###### FileOutputStream

###### FileInputStream

###### ObjectOutputStream

###### ObjectInputStream

###### RandomAccessFile



Puntero. Indicamos a donde queremos acceder (Acceso aleatorio - RandomAccessFile - NO SECUENCIAL).

* void seek(long position) -> Nos indica donde empezar a leer/escribir.
* getFilePointer() -> Te devuelve la posición de byte actual.
