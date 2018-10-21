package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		System.out.println(d.toString());
		SimpleDateFormat ds1=new SimpleDateFormat();
		System.out.println(ds1.format(d));
		SimpleDateFormat ds2=new SimpleDateFormat("M/d/yyyy");
		System.out.println(ds2.format(d));
		

	}

}
