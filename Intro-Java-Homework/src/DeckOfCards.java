import java.io.FileOutputStream;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class DeckOfCards {
	public static void main(String[] args) {
		try {
			//CREATING PDF DOCUMENT
			Document pdfDoc = new Document();
			PdfWriter.getInstance(pdfDoc, new FileOutputStream("Cards.pdf"));
			pdfDoc.open();
			//CREATING CARDS BODY
			PdfPTable cardsBody = new PdfPTable(4);
			cardsBody.setWidthPercentage(55);
			cardsBody.getDefaultCell().setFixedHeight(110);
			//FONT
			BaseFont font = BaseFont.createFont("arial.ttf", BaseFont.IDENTITY_H, true);
			Font black = new Font(font,24f, 0, BaseColor.BLACK);
			Font red = new Font(font, 24f, 0, BaseColor.RED);
			//PRINTING THE DEC
			char color = ' ';
			String card = "";
			//CARDS NUMBERS
			for (int n = 2; n <= 14; n++) {
				switch (n){
				case 11: card = "A"; break;
				case 12: card = "J"; break;
				case 13: card = "Q"; break;
				case 14: card = "K"; break;
				default: card = n + ""; break;
				}
				//CARDS MARK
				for (int mark = 0; mark < 4; mark++){
					switch (mark) {
					case 0: color = '♠'; cardsBody.addCell(new Paragraph(card + color + "", black)); 
					break;
					case 1: color = '♥'; cardsBody.addCell(new Paragraph(card + color + "", red)); 
					break;
					case 2: color = '♣'; cardsBody.addCell(new Paragraph(card + color + "", black)); 
					break;
					case 3: color = '♦'; cardsBody.addCell(new Paragraph(card + color + "", red));
					break;
					}
				}
			}
			
			pdfDoc.add(cardsBody);
			pdfDoc.close();
			
		} catch (Exception e) {
			System.err.println("Error");
			System.out.println(e);
		}
	}
}
