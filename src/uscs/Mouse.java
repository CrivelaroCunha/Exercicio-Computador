
package uscs;

public class Mouse {
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
      public Mouse(String fabricante, String cor, String numS){
          this.cor = cor;
          this.fabricante = fabricante;
          this.numS = numS;
      }
      public Mouse(){
          
      }
      void imprimeMouse(){
          System.out.println("Dados do Mouse: " + fabricante + " " + cor + " " + numS);
      }
}
