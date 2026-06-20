public class Documents {
    public static void main(String[] args) {
        DocumentFactory factory = new PdfDocumentFactory();
        Document document = factory.createDocument();
        System.out.println(document.doc());
    }
}
interface Document{
    String doc();
}
class WordDocument implements Document{
    public String doc(){
        return "Opening WordDocument";
    }
}
class PdfDocument implements Document{
    public String doc(){
        return "Opening PdfDocument";
    }
}
class ExcelDocument implements Document{
    public String doc(){
        return "Opening ExcelDocument";
    }
}
interface DocumentFactory{
    Document createDocument();
}
class WordDocumentFactory implements DocumentFactory{
    public Document createDocument(){
        return new WordDocument();
    }
}
class PdfDocumentFactory implements DocumentFactory{
    public Document createDocument(){
        return new PdfDocument();
    }
}
class ExcelDocumentFactory implements DocumentFactory{
    public Document createDocument(){
        return new ExcelDocument();
    }
}