
package uscs;


public class Computador {
    private String numS;
    private String Monitor;
    private String Teclado;
    private String Mouse;
    private String Gabinete;
    
    public String getnumS(){
        return numS;
    }
     public String getMonitor(){
        return Monitor;
    }
      public String getTeclado(){
        return Teclado;
    }
      public String getMouse(){
          return Mouse;
      }
      public String getGabinete(){
          return Gabinete;
      }
      
      public Computador(String Monitor, String Teclado, String Mouse, String Gabinete, String numS){
          this.Monitor = Monitor;
          this.Teclado = Teclado;
          this.Mouse = Mouse;
          this.Gabinete = Gabinete;
          this.numS = numS;
      }
      
      public Computador(){
          
      }
      
      void imprimeComputador(){
          System.out.println("Dados do Computador e seus Perifericos: " + Monitor + " " + Teclado + " " + Mouse + " " + Gabinete + " " + numS);
      }
}
