package AbstractInterface;



interface Turkey
{
	char s='a';
	String getTurkey();
	
}

class happyTurkey implements Turkey
{

	char s='b';
	@Override
	public String getTurkey() {
		
		return "happy";
	}
	
}

class sadTurkey implements Turkey
{
	char s='c';
	@Override
	public String getTurkey() {
		
		return "sad";
	}
	
}

public class TestTurkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Turkey.s);
		
		Turkey t1=new happyTurkey();
		System.out.println(t1.s);
		System.out.println(t1.getTurkey());
		
		Turkey t2=new sadTurkey();
		System.out.println(t2.s);
		System.out.println(t2.getTurkey());
		
		happyTurkey t3=new happyTurkey();
		System.out.println(t3.s);
		System.out.println(t3.getTurkey());
		
		sadTurkey t4=new sadTurkey();
		System.out.println(t4.s);
		System.out.println(t4.getTurkey());


	}

}
