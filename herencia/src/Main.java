// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        //Una de las principales características de la programación orientada
        // a objetos es la “herencia” que permite denir clases en función de
        // otras clases ya existentes. Es decir, una clase dene atributos y
        // métodos y, además, hereda los atributos y métodos que dene su “padre” o “clase base”.

        FechaDetallada f = new FechaDetallada();
        f.setDia(10);
        f.setMes(3);
        f.setAnio(2000);

        System.out.println(f);

    }
}