package test;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
	/** * @param args * @throws IOException */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		long milliseconds = c.getTimeInMillis();
		System.out.println("当前时间毫秒值:" + milliseconds); 
		System.out.println("当前时间毫秒值:" + System.currentTimeMillis()); 
		// 当前时间 SimpleDateFormat
		// sdf=new
		// SimpleDateFormat("yyyy-MM-dd
		// hh:mm:ss");
		// System.out.println("直接格式化毫秒值输出:"+sdf.format(milliseconds));
		// //2011-08-20 04:27:16
		// Date d=new
		// Date(milliseconds);
		// //转换成Date对象
		// System.out.println("Date对象输出时间:"+sdf.format(d));
		// Calendar
		// c2=Calendar.getInstance();
		// System.out.println("Calendar设置前毫秒值:"+c2.getTimeInMillis());
		// c2.setTime(d);
		// //通过setTime方法转换回Calendar对象
		// System.out.println("Calendar设置后毫秒值:"+c2.getTimeInMillis());
		// } }
	}
}