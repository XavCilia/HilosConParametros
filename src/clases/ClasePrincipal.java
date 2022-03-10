package clases;

public class ClasePrincipal {
    public static void main(String[] args) {

        Proceso hilo1 = new Proceso(" hilo1");
        Proceso hilo2 = new Proceso(" hilo2");
        Proceso hilo3 = new Proceso(" hilo3");
        
        hilo1.ValorDelaCondicion(5);
        hilo2.ValorDelaCondicion(10);
        hilo3.ValorDelaCondicion(5);

        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
