
package uscs;

public class Monitor {
    private String numS;
    private String fabricante;
    private String cor;
    
    public String getnumS(){
        return numS;
    }
     public String getfabricante(){
        return fabricante;
    }
      public String getcor(){
        return cor;
    }
      public Monitor(String fabricante, String cor, String numS){
          this.cor = cor;
          this.fabricante = fabricante;
          this.numS = numS;
      }
      public Monitor(){
          
      }
      void imprimeMonitor(){
          System.out.println("Dados do Monitor: " + fabricante + " " + cor + " " + numS);
      }

    
}
