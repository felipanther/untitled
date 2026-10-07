//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Dispositivo d1 = new Dispositivo();
    Dispositivo d2 = new Dispositivo();

    d1.setNombre("Teléfono");
    d1.setTipo("Comunicación");
    d1.setActivo(true);

    d2.setNombre("Impresora");
    d2.setTipo("Recurso");
    d2.setActivo(false);

    d1.mostrarInformacion();
    d1.mostrarEstado();
    d2.mostrarEstado();
    d2.mostrarInformacion();


}
