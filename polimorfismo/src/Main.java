// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    //Los objetos nunca dejan de reconocerse como miembros de una determinada clase.
    // Por tal motivo, independientemente del tipo de datos de la variable que los esté conteniendo,
    // estos ante la invocación de cualquiera de sus métodos siempre reaccionarán como su propia clase lo defina.
    //Será más simple analizarlo directamente sobre un ejemplo concreto.
    //En el siguiente programa, asignamos un objeto de tipo FechaDetallada a una variable
    // de tipo Fecha y otro objeto también de tipo FechaDetallada en una variable de tipo Object.
    // Luego imprimimos los dos objetos invocando al método toString.
    public static void main(String[] args) {

        // a fec (de tipo Fecha) le asigno un objeto FechaDetallada
        Fecha fec = new FechaDetallada("25/02/2009");
        // a obj (de tipo Object) le asigno un objeto FechaDetallada
        Object obj = new FechaDetallada("3/12/2008");
        // Imprimo los dos objetos
        System.out.println("fec = "+fec); // invoca a toString de fec System.out.println("obj = "+obj); // invoca a toString de obj
        System.out.println("obj = "+obj); // invoca a toString de obj

        //Los objetos nunca pierden su identidad, aun cuando estén siendo referenciados por una variable de algún tipo
        // de datos más básico.
        //Por esto, cuando invocamos a cualquiera de sus métodos siempre lo resolverán como lo
        //indique la clase a la que pertenecen.
    }
}