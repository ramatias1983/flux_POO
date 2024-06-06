public class Aguila extends Ave implements Volador {

    public Aguila(String tipo, String color, String tamaño) {
        super(tipo, color, tamaño);
    }

    @Override
    public void volar() {
        System.out.println("El pajaro está volando");
    }
}
