package OOPs;

public class Demo2 extends Demo1 {
	int a=12;
	String b="Bytesquare";
	char d = 'f';
	
	void OOPsDemo1() {
	
		System.out.println("All Revision related to Java" + super.a);
		
	}
	void abc() {
		System.out.println("Bytesqare tech Pune"  +super.Nm);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo2 d=new Demo2();
		System.out.println(d.a);
		d.OOPsDemo1();
		d.OOPsDemo1();
		System.out.println(d.a);
		d.abc();
	}

}
