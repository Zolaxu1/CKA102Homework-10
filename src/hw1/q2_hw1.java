package hw1;
//請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
public class q2_hw1 {
    public static void main(String[] args) {
	    int numEgg = 200;
	    int unitNum = 12;
	    int dozens = numEgg/unitNum;
	    int remainder = numEgg%unitNum;
	    System.out.println(numEgg+"顆蛋共是"+dozens+"打"+remainder+"顆");
}
}
