package kit;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class TimeTest {

	@Test
	public void testGet_current_time() {
		Date date = new Date();
		Time time = new Time();
		SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String datestring=form.format(date);
		assertEquals(datestring,time.get_current_time());
	}
	
	@Test
	public void testGet_current_time2() {
		Time time = new Time();
		String datestring="2011-01-08 14:29:50";
		SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		assertNotSame(datestring,time.get_current_time());
	}

	@Test
	public void testGet_date() {
		Time time = new Time();
		String datastring = "2011-01-08 14:29:50";
		assertEquals("2011-01-08",time.get_date(datastring));
		
	}
	
	@Test
	public void testGet_date2() {
		Date date = new Date();
		Time time = new Time();
		SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = form.format(date);
		assertEquals("2011-01-08",time.get_date(dateString));
		
	}

}
