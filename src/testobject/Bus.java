package testobject;

public class Bus {
    public int countseats;
    public int routenumber;
    public String drivername;
    
    public void moveon(String nameStop, int countStop){
        System.out.println("Автобус двигается с остановки № "+countStop+ " под названием "+nameStop);
    }
    
    public void stop(String nameStop, int countStop){
        System.out.println("Автобус двигается с остановки № "+countStop+ " под названием "+nameStop);
    }
    
    public void inPassangers(int countPassangers){
        System.out.println("В автобус сели "+countPassangers+ " пассажиров");
    }
    
    public void outPassangers(int countPassangers){
        System.out.println("Из автобуса вышли "+countPassangers+ " пассажиров");
    }
    
    public void getCountSeats(){
        System.out.println("Количество мест в автобусе: "+countseats);
    }
    
    public void getRouteNumber(){
        System.out.println("Маршрут автобуса № "+routenumber);
    }
    
    public void getDriverName(){
        System.out.println("Имя водителя автобуса: "+drivername);
    }
    
}
