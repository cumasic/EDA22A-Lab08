<table>
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Guía de Práctica de Laboratorio / Talleres / Centros de Simulación</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLD-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>
<div align="center">
    <span style="font-weight:bold;"><h2>INFORME DE LABORATORIO</h2></span>
</div>


<table>
<theader>
    <tr><th colspan="6" style="width:50%; height:auto; text-align:center">INFORMACIÓN BÁSICA</th></tr>
</theader>
<tbody>
    <tr>
        <td>ASIGNATURA:</td><td colspan="5">Laboratorio de Estructura de Datos y Algoritmos</td>
    </tr>
    <tr>
        <td>TÍTULO DE LA PRÁCTICA:</td><td colspan="5">Grafos</td>
    </tr>
    <tr>
        <td>NÚMERO DE PRÁCTICA:</td><td>08</td><td>AÑO LECTIVO:</td><td>2022 A</td><td>NRO. SEMESTRE:</td><td>III</td>
    </tr>
    <tr>
        <td colspan="2">FECHA DE PRESENTACIÓN</td><td>21-Ago-2022</td><td colspan="2">HORA DE PRESENTACIÓN: </td><td>11:59 pm</td>
    </tr>
    <tr>
        <td colspan="3">INTEGRANTES:
        <ol>
        <li>Umasi Cariapaza, Carlos Daniel</li>
        </ol>
        </td>
        <td colspan="2"> NOTA:</td>
        <td>     </td>
    </tr>
    <tr>
        <td colspan="6">DOCENTE:<br>
        Mg. Richart Smith Escobedo Quispe
        </td>
    </tr>
</tdbody>
</table>

<table>
    <theader>
        <tr>
            <th style="text-align:center">SOLUCIÓN Y RESULTADOS</th>
        </tr>
    </theader>
    <tbody>
        <tr>
            <td>
                I. SOLUCIÓN DE EJERCICIOS/PROBLEMAS<br>
                <p>1. Crear un repositorio en GitHub, donde incluyan la resolucion de los ejercicios propuestos y el informe.<br></p>
                <p>2. Implementar el cogido de Grafo cuya representacion sea realizada mediante LISTA DE ADYACENCIA. (3 puntos)<br></p>
                <p>Se implementó el código en la carpeta Ejercicio1 en la clase Grafo, además se hizo una clase Test la cual pide en consola que ingrese los vértices que van del 1 al 5 y sus respectivos vértices que queramos que sean adyacentes para así mostrarnos en una LISTA DE ADYACENCIA los resultados del código.<br>
                Imagen referencial de la prueba hecha en la clase Test:<br>
                <img src="Imagenes/ListaAdyacencia.png" alt="ListaAdyacencia" style="width:50%; height:auto"/></p>
                <p>3. Implementar BSF, DFS y Dijkstra con sus respectivos casos de prueba. (5 puntos)<br></p>
                <p>Se implementó el código en la carpeta Ejercicio2 diferentes clases con su respectivo nombre, además de sus respectivas clases Test las cuales  piden por consola que ingrese los vértices que van del 1 al 5 y sus respectivos vértices que queramos que sean adyacentes para así mostrarnos en una las distintas formas de buscar los caminos dependiendo el grafo dándonos  los resultados en consola de las búsquedas.</p>
                <p>4. Solucionar el siguiente ejercicio: (5 puntos)<br>
                El grafo de palabras se define de la siguiente manera: cada vértice es una palabra en el idioma Inglés y dos palabras son adyacentes si difieren exactamente en una posición. Por ejemplo, las cords y los corps son adyacentes, mientras que los corps y crops no lo son.<br>
                a) Dibuje el grafo definido por las siguientes palabras: words cords corps coops crops drops drips grips gripe grape graph<br>
                b) Mostrar la lista de adyacencia del grafo.<br></p>
                <p>a)Imagen del dibujo de los grafos:<br>
                <img src="Ejercicio3/Grafo.jpg" alt="Grafo" style="width:50%; height:auto"/><br>
                b) Imagen de la lista de adyacencia del grafo:<br>
                <img src="Ejercicio3/ListaAdyacencia1.jpg" alt="ListaAdyacencia1" style="width:25%; height:auto"/><br></p>
                <p>5. Realizar un metodo en la clase Grafo. Este metodo permitira saber si un grafo esta incluido en otro. Los parametros de entrada son 2 grafos y la salida del metodo es true si hay inclusion y false el caso contrario. (4 puntos)<br></p>
                <p>Se implementó el código en la carpeta Ejercicio4 en la clase Grafo, además se hizo una clase Test la cual pide en consola que ingrese los vértices que van del 1 al 5 y sus respectivos vértices que queramos que sean adyacentes para luego pedirnos que tomemos 2 vértices y comprobemos si uno incluye al otro devolviendonos true y false según corresponda:<br>
                Imagen referencial de la prueba hecha en la clase Test:<br>
                <img src="Imagenes/GrafoIncluido.png" alt="GrafoIncluido" style="width:50%; height:auto"/></p>
            </td>
        </tr>
        <tr>
            <td>
            II. CUESTIONARIO
            <ul>
                <li>¿Cuantas variantes del algoritmo de Dijkstra hay y cuál es la diferencia entre ellas? (1 punto).<br>
                A través de la historia existieron muchas variantes comenzando por la de Dial cuyo tiempo de ejecución fue O(|E|+|V|C). Luego Van Emde Boas aportó con un tiempo de ejecución de O(|E|log C).Otra variante interesante junta radix con el ya conocido Fibonacci dando O(|E|+|V|√log C). Otro dado por Thorup nos da O(|E| log |V|) y finalmente el de Raman que usa O(|E|+|V| min (log |V|)^1/3,(log C)^1/4).<br>
                <li>Investigue sobre los ALGORITMOS DE CAMINOS MINIMOS e indique, ¿Qué similitudes encuentra, qué diferencias, en qué casos utilizar y porque? (2 puntos).<br>
                Algoritmo de Dijkstra, resuelve el problema de los caminos más cortos desde un único vértice origen hasta todos los otros vértices del grafo.<br>
                Algoritmo de Bellman - Ford, resuelve el problema de los caminos más cortos desde un origen si la ponderación de las aristas es negativa.<br>
                Algoritmo de Floyd - Warshall, resuelve el problema de los caminos más cortos entre todos los vértices.<br>
            </ul>
            </td>
        </tr>
        <tr>
            <td>
            III. CONCLUSIONES
            <ul>
                <li>Los grafos nos permiten representar otra manera de ver  caminos ya sean encontrando su profundidad, su tamaño o su complejidad entre otras cosas. 
                <li>Los algoritmos de caminos minimos nos ayudan a determinar cual es el menor esfuerzo que se tiene que realizar en un determinado momento para llegar de un nodo a otro,además este se usa en nuestro día a día ya puede ser en los GPS por ejemplo para determinar rutas minimas
            </ul>
            </td>
        </tr>
    </tbody>
</table>

<table>
    <theader>
        <tr>
            <th style="text-align:center">RETROALIMENTACIÓN GENERAL</th>
        </tr>
    </theader>
    <tbody>
        <tr>
            <td>
            </td>
        </tr>
    </tbody>
</table>

<table>
    <theader>
        <tr>
            <th style="text-align:center">REFERENCIAS Y BIBLIOGRAFÍA<br>
            </th>
        </tr>
    </theader>
    <tbody>
        <tr>
            <td>
            <p>-Proyectos de tecnología con arduino, 2022. Manejo de ramas de Git, en vs code . (branch). [video] Available at: https://www.youtube.com/watch?v=k8UlMFtNDpE.</p>
            <p>-https://hmong.es/wiki/Dijkstra%27s_algorithm</p>
            <p>-Weiss M., Data Structures & Problem Solving Using Java, 2010, Addison-Wesley.</p>
            <p>-Escuela de Pedagogía en Educación Matemática, Marcelino Álvarez, et.al., http://repobib.ubiobio.cl/jspui/bitstream/123456789/1953/3/Alvarez_Nunez_Marcelino.pdf</p>
            <p>-http://www.oia.unsam.edu.ar/wp-content/uploads/2017/11/dijkstra-prim.pdf</p>
            </td>
        </tr>
    </tbody>
</table>