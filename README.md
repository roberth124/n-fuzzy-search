# fuzzy-search
Tecnical test


Esta aplicación cuenta con las siguientes operaciones:

add
./application add <json>
Agrega un nombre de persona en el archivo e imprimirá en pantalla:
Usuario agregado
Ejemplo de uso:
./application add {“name”: “Juan Antonio Perez”}
Usuario agregado
  
  
list
./application list
Deberá de regresar todos los usuarios en orden alfabético que se encuentran en el archivo si
no hubiera usuarios agregados regresará una lista vacía en el siguiente formato:

[]
Si tuviera usuarios regresará en el siguiente formato:
./application list
[
{“name”: “Alberto Vera Padrón”},
{“name”: “Juan Antonio Perez”},
{“name”: “Rodolfo Juarez Fernandez”}
]


search
./application fuzzy-search <json>
Debe buscar dentro de los nombres del archivo y hacer un fuzzy search regresando el
usuario con más aproximaciones.
  
Ejemplo de uso:
./application fuzzy-search {“search”: “Alver”}
{“name”: “Alberto Vera Padrón”}

Si no hubiera coincidencias regresaría:
./application fuzzy-search {“search”: “Alver”}
Sin coincidencias


algoritmo de búsqueda de aproximación

Para realizar esta busqueda, ya se tiene varios algoritmos implementados en java Commons
por lo cual de realizo una pequeño algoritmo (funcion) la cual trata de:

1.- Tomar la cadena a buscar
2.- Tratar el valor  a buscar (eliminar caracteres espciales, pasar a minusculas)
3.- Generar n nunmero de substring de longitud 3, las cuales seran las cadenas que se buscaran dentro del texto a analizar
4.- Si el texto base contiene alguyna de los substrings, se da por valida esa linea
5.- Se genera la salida deseada.

