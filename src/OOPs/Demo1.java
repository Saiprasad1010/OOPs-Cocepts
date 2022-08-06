package OOPs;

public class Demo1 {
	int a=12;
	String Nm = "Saiprasad";
	char  b;
	void OOPsDemo1() {
		System.out.println("Bytesquare Technology pvt.ltd.");
	}
	
	void Demo(int a){
		System.out.println("Super Keyword in POlyMorphic");
	}
	void abc() {
		int a=10;
		String n="Bytesquare";
		char v='g';
		byte c=102;
		System.out.println(c+a);
		System.out.println(n);
		System.out.println(v);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 v=new Demo1();
		System.out.println(v.a);
		v.OOPsDemo1();
		v.Demo(10);
		v.abc();
	}

}
