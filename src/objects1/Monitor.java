package objects1;

public class Monitor extends ElectronicDevice{
    
    public double weight;
    
    public Monitor(){
        
    }
    
    public Monitor(String name){
        super(name);
    }
    
    public Monitor(String name, double weight){
        super(name);
        this.weight = weight;
    }
    
    public void connectDevice(Computer comp){
        if(comp instanceof Notebook){
            ((Notebook)comp).touchPadOn();
        }
        if(comp instanceof IPad){
            ((IPad)comp).hasLoginAppStore();
        }
            
        comp.connect();
    
    }
    
    
}
