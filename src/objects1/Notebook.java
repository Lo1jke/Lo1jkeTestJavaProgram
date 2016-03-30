package objects1;

public class Notebook extends Computer{
    
    public Notebook(String name, boolean cdWriteble) {
        super(name, cdWriteble);
    }

    @Override
    public void print(String message) {
        super.print(message); 
    }

    @Override
    public void on() {
        super.on(); 
    }

    @Override
    public void off() {
        super.off(); 
    }

    @Override
    public void writeCd() {
        super.writeCd();
    }

    @Override
    public void connect() {
        System.out.println("Соединяюсь...(ноут)");
    }

    
  
    @Override
    public void getInfo() {
        super.getInfo(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void wifiOn(){
        print("Включили вай-фай");
    }
    
    public void wifiOff(){
        print("Выключили вай-фай");
    }
    
    public void touchPadOn(){
        print("Включили тачпад");
    }
    
    public void touchPadOff(){
        print("Выключили тачпад. Работаем мышью");
    }
    
    
    
    
}
