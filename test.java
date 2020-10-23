import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
 
public class test {
 
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
 
		Date fechaInicial=dateFormat.parse("2018-02-14");
		Date fechaFinal=dateFormat.parse("2018-03-22");
 
		int dias=(int) ((fechaFinal.getTime()-fechaInicial.getTime())/86400000);
 
		System.out.println("Hay "+dias+" dias de diferencia");
	}
}