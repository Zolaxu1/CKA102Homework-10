package hw2;
//請設計一隻Java程式，輸出結果為以下：
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF
public class q7_hw2 {
    public static void main(String[] args) {
    	    int i;
        for(i=1;i<=6;i++) {
        	    char word = (char)('A'+(i-1));
        	    for(int j=1;j<=i;j++) {
        	    	System.out.print(word);
        	    }
        	System.out.println();
        }
}
}