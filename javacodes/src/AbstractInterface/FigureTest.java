package AbstractInterface;

interface Figure
{
	
	
		
	
	//void setVolume(int a,int b,int c);
	int getArea();
	int getvolume();
	
	//int getvolume();
}

class rect implements Figure
{

	int l=0;
	int b=0;
	int h=0;
	
	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return l*b;
	}


	
	public void setArea(int a, int z) {
		l=a;
	    b=z;
		
	}

	@Override
	public int  getvolume() {
	return l*b*h;
	}

	
	
	
}

class cube implements Figure
{
	int l;
	int b;
	int h;
	
	public void setVolume(int x, int y,int z) {
		l=x;
		b=y;
		h=z;
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return l*b;
	}

	@Override
	public int getvolume() {
		// TODO Auto-generated method stub
		return l*b*h;
	}
}

public class FigureTest {
	
	public static void main(String[] a)
	{
		Figure re=new rect();
		System.out.println(re.getArea());
		re.setArea(10, 20);
		System.out.println(re.getArea());
		System.out.println(re.getvolume());
		
		/*Figure re1=new rect();
		((rect) re1).setArea(5, 15);
		System.out.println(re1.getArea());*/
		
		cube c1=new cube();
		System.out.println(c1.getArea());
		c1.setVolume(10, 5, 6);
		System.out.println(c1.getvolume());
		System.out.println(c1.getArea());
	}

}
