package hw1;
//請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//5 + 5
//5 + ‘5’
//5 + “5”
//並請用註解各別說明答案的產生原因
public class q6_hw1 {
    public static void main(String[] args) {
        System.out.println(5+5); //數字加數字，所以純粹數字相加
        System.out.println(5 +'5'); //數字加字元，'5' 會被自動轉型為對應的 Unicode/ASCII 數值 (53)，再進行數學相加 (5 + 53 = 58)
        System.out.println(5 +"5"); //數字加字串，數字5會變成字串和後面的字串串聯再一起
    }
}
