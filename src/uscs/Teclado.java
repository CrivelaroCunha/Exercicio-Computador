
package uscs;


public class Teclado {
    protected String numS;
    protected String fabricante;
    protected String cor;
    
    public String getnumS(){
        return numS;
    }
     public String getfabricante(){
        return fabricante;
    }
      public String getcor(){
        return cor;
    }
      public Teclado(String fabricante, String cor, String numS){
          this.cor = cor;
          this.fabricante = fabricante;
          this.numS = numS;
      }
      public Teclado(){
          
      }

      
    void imprimeTeclado(){
          System.out.println("Dados do Teclado: " + fabricante + " " + cor + " " + numS);
      }

    

    
    }

      
      