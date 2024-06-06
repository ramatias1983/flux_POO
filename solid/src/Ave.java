public abstract class Ave {

    private String tipo;
    private String color;
    private String tamaño;

    public Ave(String tipo, String color, String tamaño) {
        this.tipo = tipo;
        this.color = color;
        this.tamaño = tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    // Método abstracto que debe ser implementado por las subclases
    public abstract void volarAve();

}
