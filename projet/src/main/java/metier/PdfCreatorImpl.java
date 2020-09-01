//package metier;
//
//import java.util.*;
//import java.io.*;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Service;
//
//import com.itextpdf.text.*;
//import com.itextpdf.text.pdf.PdfWriter;
//
//import entities.Compte;
//import repository.DocPdfDAO;
//
//
//@Service("PdfCreatorMetier")
//public class PdfCreatorImpl implements PdfCreatorMetier{
//	
//	@Autowired
//	@Qualifier("docPdf")
//	private DocPdfDAO docPdfDAO;
//	
//	@Override
//	public  Document createDoc(String presentation, String photoProfil, String offre,Compte compte) {
//			Document document = new Document(PageSize.A4);
//	
//			
//	 
//	document.open();
//	 try {
//		 PdfWriter.getInstance(document,new FileOutputStream("CreateDoc.pdf"));
//		 document.open();
//		 Paragraph para = new Paragraph("HelloWorld");
//		 document.addAuthor("Admin");
//		 document.addTitle("Demo");	
//		Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
//		Chunk chunk = new Chunk("Hello World", font);
//			document.add(chunk);
//	
//	 }
//	 catch(Exception e){
//		 System.out.println(e);
//	 }
//	
//	 
//
//	document.close();
//	return document;
//	
//	
//	}
//
//	
//	
//	
//
//	
//	
//}
