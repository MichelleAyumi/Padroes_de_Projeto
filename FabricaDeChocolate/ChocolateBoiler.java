package fabricachocolate;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    
    /*
    public ChocolateBoiler(boolean empty, boolean boiled) {
        this.empty = empty;
        this.boiled = boiled;
    }
    */
    private ChocolateBoiler(){
        empty = true; // esse código só é iniciado quando a caldeira está vazia
        boiled = false;
    }
    
    public void fill(){
        // para encher a caldeira, ela deve estar vazia e, quando ela estiver cheia
       //configuramos os indicadores de empty é boiled
        if(isEmpty()){ 
            empty = false;
            boiled = false;
            //preencha a caldeira com uma mistura de leite e chocolate
        }
        
    }
    
    public void drain(){
       //Para drenar a caldeira, ela deve estar (nao vazia) e ta,bém em ebulição
       //Depois configuramos empty como true novamente
        if(isEmpty() && isBoiled()){
            //drene o leite e o chocolate fervidos
            empty = true;
        }
        
    }
    
    public void boil(){
        //para ferver a mistura, a caldeira deve estar cheia e ainda deve ter fervido.
        //Depois de ferver configuramos o indicador boiled como true
        if(isEmpty() && isBoiled()){
           // coloque o conteudo em ebolição
        }
        
    }
    
    public boolean isEmpty(){
        return empty;
    }
    
    public boolean isBoiled(){
        return boiled;
    }
    
    
    
    
    
}
