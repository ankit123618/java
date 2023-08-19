package colored_room;
import java.util.*;
class area{
	private static  float length;
	private static  float breadth;
	private static  float height;
	public static final void setDimension(float l,float b,float h){
        length=l;breadth=b;height=h;}
        public static final void calArea(){
	float a=length*breadth*height;
        System.out.println("your room area is "+a +"sqm");}
}
class color{
	public char quality;
	public float m=5000;
	public float h=10000;
	public float l=3000;
	public void choose(char q){
		quality=q;}
}
class calPrice{
	float p;
	System.out.println("your price is "+p);}
public class ColorRoom{
	public static void main(String[] args){
		area a1=new area();
		Scanner i=new Scanner(System.in);
		System.out.println("enter length,bredth and height of the room");
		a1.setDimension(i.nextFloat(),i.nextFloat(),i.nextFloat());
		a1.calArea();
	        color c1=new color();
	        calPrice cp1=new calPrice();
	        if(quality==h)
                     p=10000*a;
                if(quality==m)
                       p=5000*a;
                if(quality==l)
                       p=3000*a;
	}
}
