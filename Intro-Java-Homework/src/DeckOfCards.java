import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
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
			cardsBody.setWidthPercentage(50);
			cardsBody.getDefaultCell().setFixedHeight(100);
			//FONT
			BaseFont font = BaseFont.createFont("Arial", BaseFont.IDENTITY_H, true);
			Font black = new Font(font,24f, 0, BaseColor.BLACK);
			Font red = new Font(font, 24f, 0, BaseColor.RED);
			
			//PRINTING THE DEC
			char color = ' ';
			String card = "";
			
			for (int n = 2; n <= 52; n++) {
				//CARDS NUMBER
				
				for (int mark = 0; mark < 4; mark++){
					//CARDS MARK
					switch (mark) {
					case 0: color = '♠';
							break;
					case 1: color = '♥';
							break;
					case 2: color = '♣';
							break;
					case 3: color = '♦';
							break;
					}
				}
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
