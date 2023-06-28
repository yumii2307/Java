package ch11_api.sec07_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex01_Date {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss");
		System.out.println(sdf);
	}

}
