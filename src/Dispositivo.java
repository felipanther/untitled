public class Dispositivo {
    public String nombre;
    String tipo;
    public boolean activo;

    public void mostrarInformacion(){
        System.out.println("Nombre: "+nombre+" Tipo: "+tipo+" Activo: "+activo);
    }
    void mostrarEstado(){
        String estado = activo?"Activo":"Inhabilitado";
        System.out.println("Nombre: "+nombre+"\n Estado: "+estado);
    }
}
