
package dr.edu.uricer;


public class Hello {
    
    private String nome = "";
    
    public Hello(){
        
    }
    
    public Hello(String nome){
        this.nome = nome;
    }
    
    public String getMessage(){
        return ("Hello " + nome).trim();
    }
}
