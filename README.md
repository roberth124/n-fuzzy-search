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
