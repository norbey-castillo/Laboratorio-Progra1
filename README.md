# ANALISIS DEL PROGRAMA.

## Identificacion De Tareas Repetitivas.
### ¿Que partes del codigo pueden convertirse en metodos?
- Gran parte del codigo puede convertirse en metodos, no solo para que sea vea mas estetico ya que se separa cada opcion del menu principal, sino que es mas facil de identificar y trabajar con un codigo limpio y bien estructurado.

### ¿Que bloques de codigo se repiten?
- los bloques de codigo que se pueden llegar a repetir son las tareas que se realizan al seleccionar una opcion del menu principal o el uso de cada lista por separado.

### ¿Que responsabilidades pueden separarse?
- A demas de cada tarea del menu principal, pueden separarse las interacciones con las listas de alumnos y notas, porque al unir las listar en una sola clase nos evitamos de estar interactuando independientemente con cada una de las lista, unicamente hacemos el llamado a la clase donde dejamos las listas y se le ingresan los valores correspondientes a cada una de ella.

### ¿Por que divirir las tareas del Menu principal mejora el programa?
- Porque al tener cada tarea separada una de otra en metodos independientes, se puede trabajar de una forma mas ordenada, ya sea a la hora de analizar, interactuar o navegar en el programa porque si se llega a tener algun problema con el programa, unicamente revisamos que metodo es el que nos esta fallando sin necesidad de revisar todo el codigo en busca de que cosa es la que nos falla. basicamente nos ahorramos tiempo en el analisis del programa a la hora de que nos de algun problema.

## Variables Locales vs Globales.
### ¿Que variables deberian declararse como globales (atributos "static" de la clase )?
- Casi sin dudar, puedo decir que el la principal funcionalidad a definir como "static" es el Scanner, de esa manera nos ahorramos el estar definiendo una nueva entrada de datos en cada metodo, de otro modo se cargaria demasiado el programa al estar definiendo nuevas entradas de datos en todos los metodos.

### ¿Cuales deberian ser locales dentro de un metodo?
- Definitivamente las variables que deberian ser locales dentro de un metodo, son las que va a usar especificamente ese metodo, dependiendo de que informacion guarde cada variable.

### ¿Por que?
- Porque cada variable local que se guarda dentro de un metodo unicamente influye en ese metodo, ya que si no lo definimos localmente puede que no compile o que se confunda con otra variable que sea universal y al conectarse entran en conflicto las dos variables y ahi es cuando nos puede dar error el programa.



## Validaciones y manejo de errores

### ¿Que errores podrían ocurrir?

- Principalmente con errores que podrían botar el programa están la conversión de la entrada a valor numerico, ya que si el usuario ingresa un valor alfabetico el programa caería al no poder convertir el valor. También un error de lógica en el programa sería si el usuario pueda ingresar un valor mayor a 100 o menor a 0 porque eso podría entorpercer el promedio y inutilizar el sistema al no poder usar los datos en un ejemplo práctico.

### ¿Qué validaciones implementaron?

- Unicamente un "try and catch" para evitar que el usuario ingrese letras en vez de numeros y una validacion para el rango de las calificaciones.

### ¿Por qué son importantes? 

- Porque primero le dan robustez al programa y evita que caiga cuando hay una situación imprevista y segundo dan una mejor experiencia a quien lo usa.




# PREGUNTAS DE REFLEXION.

## ¿Que ventajas tiene dividir el codigo en metodos?
- Al separar el codigo en metodos, a parte de verse mas estetico, es mas comodo trabajar sin tener demasiadas lineas de codigo en el main, sino que simplemente reutilizamos los metodos que vayamos a ocupar cuando los necesitemos.

### Organizacion:
- Al nosotros meter parte del codigo dentro de metodos, visualmente todo se ve mas estetico, sin lineas de codigo volando por todo el programa principal, unicamente se llaman los metodos que se vayan a usar cuando se requieran.

### Reutilizacion:
- Al haber declarado inicialmente alguna funcionalidad del programa en metodos, nos evitamos el estar rehaciendo el codigo a cada rato, simplemente lo hacermos una sola vez y cada que vayamos a ocupar esa funcionalidad la llamamos para que cumpla la funcion definida.

### Mantenimiento:
- Al tener declarados los metodos y con nombres descriptivos, a la hora de hacer una modificacion o cuando algo falle nosotros podremos identificar mas facil el lugar donde nos este fallando, sin necesidad de tener que estar buscando metodo por metodo, es mas facil de mantener.

### Claridad:
- Como dije, al darles nombres descriptivos que nos indiquen que cosas hace cada metodo podemos navegar tranquilamente por el codigo, si necesitamos revisar alguna funcionalidad nosortos solo nos vamos al metodo que contiene esa funcionalidad sin tener que batallar mucho para encontrar en que parte del programa se realiza una accion.

## ¿Por qué no es recomendable usar muchas variables globales?
- porque se pueden confundir con otras variables que sean globales y que tengan una funcionalidad distinta, si se usan muchas variables globales y varias de esas variables llevan funcionalidades diferentes pero nombres relativamente similares puede haber una confusion y hacer que el programa no corra bien.

### Posibilidad de errores inesperados

- Porque si muchas funciones pueden modificar la variable puede llevar a valores que puedan dar conflicto en otros, y que podría ser impredecible como se va a comportar la variable.
 
### Dificultad para depurar

- Porque se usa una misma variable en todo va a ser dificil al buscar donde se originó el error y en donde afectó pueda ser dificil.

### Dependencia entre métodos

- Si usamos una sola variable estamos aislando el proyecto a su proposito original, limitando las formas en las que podemos usar las funciónes sin tener que modificarlas. Y si cambiamos el coportamiento o nombre de la variable habría que modificar varias funciones cada vez.

## ¿Cómo mejora la modularización la legibilidad del código?

- Pues al dividir el código en bloques pequeñitos ayuda a procesar la utilidad de cada linea en nuestra mente, entiendo mejor como funciona y notando errores más rapido.



# iNTEGRANTES
- Saul Chavez:              0905-25-12292
- Norbey Castillo:          0905-25-9175