package hw1;
//請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
public class q4_hw1 {
    public static void main(String[] args) {
    	    final double PI = 3.1415;
    	    	int radius = 5;
    	    double area = radius*radius*PI;
    	    double circumference = radius*2*PI;
    	    System.out.println("半徑為"+radius+"，面積為:"+area+"，周長為:"+circumference);
    	    System.out.printf("半徑為%d，面積為:%.2f，周長為:%.2f%n", radius, area, circumference);
    }
}
