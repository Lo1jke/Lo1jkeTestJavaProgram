package testobject;

public class DataBase {
    public String nameDB;
    public int length;
    
    public void getDBName(){
        System.out.println("СУБД : "+nameDB);
    }
    
    public void getDBLength(){
        System.out.println("Количество занятого дискового пространства(в гб): "+length);
    }
}
