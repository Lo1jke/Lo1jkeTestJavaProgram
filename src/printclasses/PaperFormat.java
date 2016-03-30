package printclasses;

public enum PaperFormat {
    
    A5(10, "A5"),
    A4(15, "A4"),
    A3(20, "A3");
    
    private  int length;
    private String name;
    
    public int getLength(){
        return length;
    }
    
    public String getName(){
        return name;
    }
    
    private PaperFormat(int length, String name) {
        this.length = length;
        this.name = name;
    }
    
}
