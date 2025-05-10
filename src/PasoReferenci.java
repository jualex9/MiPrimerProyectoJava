class PasoReferencia {
    String nombre;
}

public class PasoReferenci {
    public static void main(String[] args) {
        PasoReferencia persona = new PasoReferencia();
        persona.nombre = "Ana";
        cambiarNombre(persona);
        System.out.println("Nombre después de cambiarNombre: " + persona.nombre);
    }

    public static void cambiarNombre(PasoReferencia persona) {
        persona.nombre = "María";
    }
}