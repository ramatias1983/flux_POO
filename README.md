- Crear una demo y subirla en github
- En la cual mostrar conocimientos de:
- abstracción
- encapsulamiento
- herencia
- polimorfismo
- La misma debe cumplir los principio SOLID
  (https://www.freecodecamp.org/espanol/news/los-principios-solid-explicados-en-espanol/)
-------------------------------------------------------------------------------------------

SOLID:

Para establecer un ejemplo aplicación de principiso SOLID pusimos dos carpetas modulos, uno que no respeta
los principios solid (no_solid):

S - El Principio de responsabilidad única (Single Responsibility Principle):
El Principio de Responsabilidad Única dice que una clase debe hacer una cosa y, por lo tanto, debe tener una sola razón para cambiar.

Para enunciar este principio más técnicamente: Solo un cambio potencial (lógica de base de datos, lógica de registro, etc.)
en la especificación del software debería poder afectar la especificación de la clase.

En nuestro caso la clase ave tiene multiples responsabilidades como volar, nadar y caminar.
Se debería corregir eso.


O - El Principio Abierto-Cerrado (Open-Closed Principle):
El principio de apertura y cierre exige que las clases deban estar abiertas a la extensión y cerradas a la modificación.

En nuestra caso se pueden crear más aves que hereden, pero cerradas a la modificaión.

L - Liskov Substitution Principle (LSP):

Las subclases pueden ser reemplazadas por la clase indistintamente por la superclase Ave y no debería dar
ningun resultado extraño.

Tambien se corrige en nuestro caso.


D - Principio de inversión de dependecia:

El principio de inversión de dependencia establece que nuestras clases deben depender de interfaces o clases abstractas
en lugar de clases y funciones concretas.

En nuestro ejemplo las clases dependen de funciones concretas por lo tanto debe ser corregido.