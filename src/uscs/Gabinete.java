
package uscs;


public class Gabinete {
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
      public Gabinete(String fabricante, String cor, String numS){
          this.cor = cor;
          this.fabricante = fabricante;
          this.numS = numS;
      }
      public Gabinete(){
          
      }
      void imprimeGabinete(){
          System.out.println("Dados do Gabinete: " + fabricante + " " + cor + " " + numS);
      }
}
