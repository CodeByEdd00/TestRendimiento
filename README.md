COMPARATIVA DE MÉTODOS DE CONCATENACIÓN EN JAVA

Descripción del Proyecto
 Se ha diseñado un test en Java que realiza múltiples concatenaciones de cadenas utilizando los tres métodos mencionados. El objetivo es determinar cuál de ellos es más eficiente en términos de tiempo de ejecución, especialmente cuando se manejan grandes volúmenes de datos.

Métodos probados
 Operador +
 Método .concat()
 Clase StringBuilder

Resultados
 +:
  500 --> 3ms
  1000 -->8ms
	10.000 --> 235ms
  100.000 --> 35.236ms
  1.000.000 --> -

 CONCAT:
  500 --> 4ms
	1000 --> 12ms
	10.000 --> 570ms
	100.000 --> 12.422ms
	1.000.000 --> -

 STRING BUILDER:
	500 --> 0ms
	1000 --> 1ms
	10.000 --> 3ms
	100.000 --> 11ms
	1.000.000 --> 58ms

Créditos
 Este proyecto está inspirado en las lecciones de Andrés Guzmán, gracias a su curso donde explica detalladamente el manejo eficiente de cadenas en Java.
