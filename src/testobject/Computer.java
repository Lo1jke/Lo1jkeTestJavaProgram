package testobject;

public class Computer {
   private String name;
   private int ram;
   private int hdd;
   private double weight;
   
   
   public String getName(){
       return name;
   }
   
   public void setName(String newName){
       name = newName;
   }
   
   public int getRam(){
       return ram;
   }
   
   public void setRam(int newRam){
       if (newRam > 0){
           ram = newRam;
       }else{
           System.out.println("Переданнное значение "+newRam+" не может быть отридцательным!");
       }
   }
   
    public int getHdd(){
       return hdd;
   }
   
   public void setHdd(int newHdd){
       if (newHdd > 0){
           hdd = newHdd;
       }else{
           System.out.println("Переданнное значение "+newHdd+" не может быть отридцательным!");
       }
   }
   
   
   public void on(){
       System.out.println("Я включился. Моя модель: "+name);
   }
   
   public void off(){
       System.out.println("Я выключился ");
   }
   
   public void load() {
       System.out.println("Я загружаюсь: Мой объем жесткого диска равер: "+hdd+"гб");
   }
    
}
