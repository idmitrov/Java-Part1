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
			// CREATING PDF DOCUMENT
			Document pdfDoc = new Document();
			PdfWriter.getInstance(pdfDoc, new FileOutputStream(
					"Playing-Cards-Deck.pdf"));
			// OPENING THE PDF
			pdfDoc.open();
			// CREATING CARDS BODY
			PdfPTable cardsBody = new PdfPTable(13);
			cardsBody.setWidthPercentage(113.4f);
			cardsBody.getDefaultCell().setPaddingTop(-1);
			cardsBody.getDefaultCell().setFixedHeight(82);
			cardsBody.getDefaultCell().setBackgroundColor(BaseColor.WHITE);
			cardsBody.getDefaultCell().setBorderWidth(0);
			cardsBody.getDefaultCell().setBorderWidthTop(0.5f);
			cardsBody.getDefaultCell().setBorderWidthLeft(0.5f);
			cardsBody.getDefaultCell().setBorderColor(BaseColor.LIGHT_GRAY);
			BaseFont fontFamily = BaseFont.createFont("./font/times.ttf",
					BaseFont.IDENTITY_H, true);
			Font blackColor = new Font(fontFamily, 12, 0, BaseColor.BLACK);
			Font redColor = new Font(fontFamily, 12, 0, BaseColor.RED);
			// LOOPING CARDS INTO DECK
			char cardSign = ' ';
			String cardValue = "";
			Font color = null;
			// CARD SIGN
			for (int sign = 0; sign < 4; sign++) {
				switch (sign) {
				case 0:
					cardSign = '♠';
					color = blackColor;
					break;
				case 1:
					cardSign = '♥';
					color = redColor;
					break;
				case 2:
					cardSign = '♦';
					color = redColor;
					break;
				case 3:
					cardSign = '♣';
					color = blackColor;
					cardsBody.getDefaultCell().setBorderWidthBottom(0.5f);
					break;

				}
				// CARD VALUE
				for (int card = 2; card <= 14; card++) {
					switch (card) {
					case 11:
						cardValue = "A";
						break;
					case 12:
						cardValue = "J";
						break;
					case 13:
						cardValue = "Q";
						break;
					case 14:
						cardValue = "K";
						cardsBody.getDefaultCell().setBorderWidthRight(0.5f);
						break;
					default:
						cardValue = card + "";
						cardsBody.getDefaultCell().setBorderWidthRight(0);
						break;
					}
					cardsBody.addCell(new Paragraph(cardValue + cardSign + "",
							color));
				}
			}
			// PRINT ALL CARDS AND CLOSE THE PDF
			pdfDoc.add(cardsBody);
			pdfDoc.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
