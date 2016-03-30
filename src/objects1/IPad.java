package objects1;

public class IPad extends Notebook{
    
    protected boolean hasLoginAppStore;
    
    public IPad(String name, boolean hasLoginAppStore) {
        super(name, false);
        this.hasLoginAppStore = hasLoginAppStore;
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
    public void wifiOn() {
        super.wifiOn(); 
    }

    @Override
    public void wifiOff() {
        super.wifiOff(); 
    }

    @Override
    public void touchPadOn() {
        super.touchPadOn(); 
    }

    @Override
    public void touchPadOff() {
        super.touchPadOff(); 
    }

    @Override
    public void writeCd() {
        super.writeCd(); 
    }

    @Override
    public void print(String message) {
        super.print(message); 
    }

    @Override
    public void getInfo() {
        super.getInfo();
    }

    @Override
    public void connect() {
        System.out.println("Соединяюсь...(Айпад)");
    }
   
    
    
    public void hasLoginAppStore(){
        if(this.hasLoginAppStore){
            print("Логин в АппСтор есть!");
        }else{
            print("Логина в АппСтор нет!");
        } 
    }
    
    
}
