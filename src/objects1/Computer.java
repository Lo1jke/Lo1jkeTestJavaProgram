package objects1;
 
        
public class Computer extends ElectronicDevice {

    
    public Computer(String name, boolean cdWriteble) {
        super(name, cdWriteble);
    }

    @Override
    public void connect() {
        System.out.println("Соединяюсь...(компутер)");
    }

    
    
    @Override
    public void on(){
        super.on();
        //print("Колдухтер включается...");
        for (int i = 0; i < 3; i++) {
            print(Integer.toString(i));
        }
    }
    
    @Override
    public void off(){
        super.off();
        //print("Колдухтер выключается...");
        for (int i = 0; i < 3; i++) {
            print(Integer.toString(i));
        } 
    }

    @Override
    public void print(String message) {
        super.print(message); 
    }
    
    @Override
    public void writeCd() {
        super.writeCd();
    }

    @Override
    public void getInfo() {
        super.getInfo(); 
    }
    
    
    
}
