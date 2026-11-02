package hw1;
//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
public class q3_hw1 {
    public static void main(String[]args) {
	    int totalSec = 256559;
	    int dayNum = totalSec/86400;
	    int remainder = totalSec%86400;
	    int hourNum = remainder/3600;
	    remainder = remainder%3600;
	    int minNum = remainder/60;
	    int secNum = remainder%60;
	    System.out.println(totalSec+"秒一共是"+dayNum+"天"+hourNum+"時"+minNum+"分"+secNum+"秒");
 }
}
