public class GeneradorCorreo {
    public static void main(String[] args) {
        System.out.println("Generador de Email practica");
        //User name 
        var nombreCompleto = "Luis   Cordova   ";
        System.out.println(nombreCompleto);

        //Eliminar espacios 
        var nombreSinEspacios = nombreCompleto.strip();
        System.out.println(nombreSinEspacios);
    }
}
