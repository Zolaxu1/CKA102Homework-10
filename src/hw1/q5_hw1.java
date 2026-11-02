package hw1;
//某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//金加利息共有多少錢 (用複利計算,公式請自行google)
public class q5_hw1 {
    public static void main(String[] args) {
    	    int totalMoney = 1500000;
    	    double rate = 0.02;
    	    //複利計算公式：本利和 = 本金 × (1 + 年利率)^期間
    	    double compoundInterest = totalMoney*Math.pow(1+rate,10);
    	    int finalTotalMoney = (int)Math.round(compoundInterest);
    	    System.out.println("10年後本金加利息一共是"+finalTotalMoney+"元。");
    }  
}
