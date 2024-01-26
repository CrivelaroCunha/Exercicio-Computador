
package uscs;


public class TestaComputador {

    public static void main(String[] args) {
      Teclado teclado = new Teclado("Logitech", "Preto", "1232");
      Monitor monitor = new Monitor("Samsung", "Preto", "AFB876");
      Gabinete gabinete = new Gabinete("Logitech", "Preto", "HGY6654");
      Mouse mouse = new Mouse("Microsoft", "Preto", "HG6654");
      Computador computador = new Computador ("monitor", "teclado", "mouse", "gabinete", "76trde35");
    
     teclado.imprimeTeclado();
     monitor.imprimeMonitor();
     gabinete.imprimeGabinete();
     mouse.imprimeMouse();
     computador.imprimeComputador();
    }
    
}
