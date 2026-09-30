//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Dispositivo d1 = new Dispositivo();
    Dispositivo d2 = new Dispositivo();

    d1.nombre = "Teléfono";
    d1.tipo = "Comunicación";
    d1.activo = true;

    d2.nombre = "Impresora";
    d2.tipo = "Recurso";
    d2.activo = false;

    d1.mostrarInformacion();
    d1.mostrarEstado();
    d2.mostrarEstado();
    d2.mostrarInformacion();
}
