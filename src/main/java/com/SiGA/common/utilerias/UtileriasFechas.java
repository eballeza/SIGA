package  com.SiGA.common.utilerias;

import java.util.Calendar;

public class UtileriasFechas {
	
	public static String devuelveCalendarEnTexto(Calendar fechaCalendar){
		String fecha = "";
		fecha = ( (Integer)fechaCalendar.get( Calendar.DAY_OF_MONTH  )).toString();
		fecha += " / ";
		fecha += ( fechaCalendar.get(Calendar.MONTH)+1 ); 
		fecha += " / ";
		fecha += fechaCalendar.get(Calendar.YEAR );
		return fecha;
	}
	
	public static void main(String[] args){
		System.out.println( UtileriasFechas.devuelveCalendarEnTexto(Calendar.getInstance()) );
	}

}
