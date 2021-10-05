package co.micol.prj;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
	private Date date;
	private Calendar now;
	private SimpleDateFormat sd;
	
	void dateTest() {
//		sd = new SimpleDateFormat("yyyy-MM-dd : HH:mm:ss"); //날짜 표현 형식 정의
//		sd = new SimpleDateFormat("yyyy년 MM월 dd일");
		sd = new SimpleDateFormat("현재시간 hh:mm:ss");
		date = new Date(); //새로운 날짜 객체를 생성
		
		System.out.println(date);
		System.out.println(sd.format(date));
		
	}
	
	void calendarTest() {
		now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		int month = now.get(Calendar.MONTH)+1;
		System.out.println(month);
		int day = now.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		
	}

}
