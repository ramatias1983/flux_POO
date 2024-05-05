// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // creo una fecha indicando los valores iniciales
        Fecha f1 = new Fecha(2,10,1970);

        // creo una fecha sin indicar valores iniciales
        Fecha f2 = new Fecha();
        f2.setDia(4); // asigno el dia
        f2.setMes(6); // asigno el mes f2.setAnio(2008); // asigno el anio
        f2.setAnio(2023);

        System.out.println(f1);
        System.out.println(f2);

        //Como vemos, ahora podemos crear fechas especificando o
        //no los valores iniciales de sus atributos.
        //Es importante no confundir “sobrecarga” con “sobrescritura”:
        // - Sobrecargamos un método cuando lo programamos más de una vez,
        //   pero con diferentes tipos y/o cantidades de parámetros.
        // - Sobrescribimos un método cuando el método que estamos programando es el mismo
        //   que heredamos de nuestro padre. En este caso, tenemos que respetar su
        //   encabezado (cantidades y tipos de parámetros y tipo del valor de retorno)
        //   ya que de lo contrario lo estaremos sobrecargando.
        }
}