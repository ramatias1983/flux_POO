// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Pato miPato = new Pato("linda","blanco","chico");
        Ave miAguila = new Aguila("fea","negro","mediano");
        Pinguino miPinguno = new Pinguino("silvestre","gris","grande");

        miPato.caminar();
        miAguila.volarAve();
        miPinguno.nadar();

    }

}