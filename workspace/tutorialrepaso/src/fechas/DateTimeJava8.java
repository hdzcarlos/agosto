package fechas;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class DateTimeJava8 {

	public static void main(String[] args) {
		
		
		Date fecha = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss:ms");
		System.out.println(fecha.getTime());
		System.out.println(dateFormat.format(fecha));
		
		//CALENDAR  JAVA 8
		Calendar calendar = Calendar.getInstance();
		System.out.println("Calendar");
		
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println("============ id 2");
		LocalDate id2 = LocalDate.of(2000, 11, 20);
		System.out.println(id2);
		System.out.println("=========== Local now");
		
		LocalDate id = LocalDate.now();
		System.out.println(id);
		
		
		
		

	}

}
