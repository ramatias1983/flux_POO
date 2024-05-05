public class FechaDetallada extends Fecha {

    public FechaDetallada(String f) {
        super(f);
    }

    public FechaDetallada() {
    }

    private static String meses[]={"Enero",
                                    "Febrero",
                                    "Marzo" ,
                                    "Abril" ,
                                    "Mayo" ,
                                    "Junio" ,
                                    "Julio" ,
                                    "Agosto" ,
                                    "Septiembre" ,
                                    "Octubre" ,
                                    "Noviembre" ,
                                    "Diciembre"};

    //TODO no cumple responsabilidad unica de SOLID
    public String toString() {
        return getDia()+" de "+meses[getMes()-1]+" de "+getAnio();
    }

}
