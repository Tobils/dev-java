 import java.util.*;

 public class UjiKalender {
 public static void main(String[] args) {
 // Menciptakan suatu kalender Gregorian untuk tanggal dan waktu saat ini
 Calendar calendar = new GregorianCalendar();
 System.out.println("Waktu sekarang adalah " + new Date());
 System.out.println("YEAR:\t" + calendar.get(Calendar.YEAR));
 System.out.println("MONTH:\t" + calendar.get(Calendar.MONTH));
 System.out.println("DATE:\t" + calendar.get(Calendar.DATE));
 System.out.println("HOUR:\t" + calendar.get(Calendar.HOUR));
 System.out.println("HOUR_OF_DAY:\t" +
 calendar.get(Calendar.HOUR_OF_DAY));
 System.out.println("MINUTE:\t" + calendar.get(Calendar.MINUTE));
 System.out.println("SECOND:\t" + calendar.get(Calendar.SECOND));
 System.out.println("DAY_OF_WEEK:\t" +
 calendar.get(Calendar.DAY_OF_WEEK));
 System.out.println("DAY_OF_MONTH:\t" +
 calendar.get(Calendar.DAY_OF_MONTH));
 System.out.println("DAY_OF_YEAR: " +
 calendar.get(Calendar.DAY_OF_YEAR));
 System.out.println("WEEK_OF_MONTH: " +
 calendar.get(Calendar.WEEK_OF_MONTH));
 System.out.println("WEEK_OF_YEAR: " +
 calendar.get(Calendar.WEEK_OF_YEAR));
 System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));

 // Menciptakan kalender untuk 11 September 2001
 Calendar calendar1 = new GregorianCalendar(2001, 8, 11);
 System.out.println("September 11, 2001 adalah hari " +
 dayNameOfWeek(calendar1.get(Calendar.DAY_OF_WEEK)));
 }

 public static String dayNameOfWeek(int dayOfWeek) {
 switch (dayOfWeek) {
 case 1: return "Minggu";
      case 2: return "Senin";
      case 3: return "Selasa";
      case 4: return "Rabu";
      case 5: return "Kamis";
      case 6: return "Jumat";
      case 7: return "Sabtu";
 default: return null;
 }
 }
 }