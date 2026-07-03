public class FactoryMethodPattern{
    public static void main(String[] args) {
        Factory factory = new Factory();
        file wordFile = factory.createFile("word");
        wordFile.create();
        file pdfFile = factory.createFile("pdf");
        pdfFile.create();
        file excelFile = factory.createFile("excel");
        excelFile.create();
    }
}
class Factory{
    public file createFile(String fileType){
        if(fileType.equalsIgnoreCase("word")){
            return new WordDocument();
        }
        else if(fileType.equalsIgnoreCase("pdf")){
            return new PdfDocument();
        }
        else if(fileType.equalsIgnoreCase("excel")){
            return new ExcelDocument();
        }
        else{
            return null;
        }
    }

}
interface file{
    public void create();
}
class WordDocument implements file{
    public void create(){
        System.out.println("Word doc created.");
    }
}
class PdfDocument implements file{
    public void create(){
        System.out.println("PDF doc created.");
    }
}
class ExcelDocument implements file{
    public void create(){
        System.out.println("Excel doc created.");
    }
}