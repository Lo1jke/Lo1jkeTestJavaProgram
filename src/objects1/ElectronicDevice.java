package objects1;

import printclasses.PrintClass;

public class ElectronicDevice {
    
    protected String name;
    protected boolean cdWriteble;
   
    public ElectronicDevice(){
        
    }
    
    
    public void connect(){
        System.out.println("Соединяюсь...(Девайс)");
    }
    
    public ElectronicDevice(String name, boolean cdWriteble) {
        this.name = name;
        this.cdWriteble = cdWriteble;
    }
   
    public ElectronicDevice(String name){
        this.name = name;
    }
    
    public void getInfo(){
        print(this.name);
    }
    
    public void print(String message){
       PrintClass printer = new PrintClass();
       printer.print(message);
    }
    
    public void writeCd(){
        if (this.cdWriteble) {
            print("Записываю диск!");
        }else{
            print("Привод на устройстве "+this.name+" не установлен!");
        }
    }
    
    public void on(){
        print("Включаюсь...");
        for (int i = 1; i>4;i++){
            print(Integer.toString(i));
        }
    }
    
    public void off(){
        print("Выключаюсь...");
        int i=1;
        while (i==4){
            print(Integer.toString(i));
            i++;
        }
    } 
    
}
