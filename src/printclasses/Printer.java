package printclasses;

public class Printer {
    
    public void print(PaperFormat paperFormat, String text){
        System.out.println("Длина текста "+ text.length() + " на формате бумаги "+ paperFormat.getName());
        
//        if(text.length() <= paperFormat.getLength()){
//            System.out.println("Печать теста "+ text + " возможна. На формате бумаги "+ paperFormat.getName());
//        } else {
            PaperFormat properPaperFormat = getPaperFormat(text.length());
            
            if( properPaperFormat != null) {
                if (properPaperFormat == paperFormat){
                    System.out.println("Печать теста "+ text + " возможна. Формат бумаги выбран верный "+ paperFormat.getName());
                } else {
                    System.out.println("Печать теста "+ text + " возможна. Формат бумаги рекоммендуется  "+ properPaperFormat.getName());
                }
            } else {
                System.out.println("Не существует нужного формата бумаги");
            }
                
//        }
        System.out.println();
        
        
    }
    
    
    
    
    
    
    private PaperFormat getPaperFormat(int textLength){
        for (PaperFormat paper : PaperFormat.values()){
            if(textLength <= paper.getLength()){
                return paper;
            }
        }
    return null;    
    }


}
