package hw2;
//阿文很熱衷大樂透(1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//輸出結果為阿文可以選擇的數字有哪些？總共有幾個？

public class q5_hw2 {
   public static void main (String[] args) {
	   int number = 0;
	   for(int i =1;i<=49;i++) {
		   int tens = i/10;
		   int units = i%10;
		   if (tens!=4 && units!=4) {
			   number++;
			   System.out.print(i+" ");
		   }
	   }
	   System.out.println();
	   System.out.print("總共有"+number+"個");
   }
}