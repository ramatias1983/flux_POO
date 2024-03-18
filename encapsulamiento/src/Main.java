public class Main {
    public static void main(String[] args) {

        //Encapsulamiento
        //Uno de los objetivos que debemos perseguir cuando programamos clases es poder
        //encapsular la complejidad que emerge de las operaciones asociadas a sus atributos.
        //Me refiero a que debemos hacerle la vida fácil al programador que utilice objetos de nuestras clases
        //exponiéndole las operaciones que podría llegar a necesitar, pero ocultándole la complejidad derivada
        //de las mismas.
        //Por ejemplo, una de las operaciones asociadas a una fecha podría ser la de sumarle
        //o restarle días, meses y años. Si definimos en la clase Fecha el método addDias entonces quien
        //utilice esta clase fácilmente podría realizar esta operación sin necesidad de preocuparse por
        //conocer el algoritmo que resuelve este problema. Simplemente, puede invocar al método y dar
        //por resuelto el tema como veremos a continuación:

        //Creamos una fecha
        Fecha fecha = new Fecha(23,12,1980);

        // le sumamos 180 dias
        fecha.addDias(10);

        // mostramos como quedó la fecha luego de sumarle estos dias
        System.out.println(fecha);

    }
}
