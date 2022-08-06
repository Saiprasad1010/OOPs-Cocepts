package OOPs;
public class ThisKeyWord {
	int a=10;
	String b ="Bytesquare";
	void abc() {
		int a=15,b=35;
		System.out.println(a);
		System.out.println(this.a);
	}
	void abc1() {
		int data=40;
		System.out.println(a);
		this.abc();
		System.out.println(this.a);
	}
	void abc2() {
		System.out.println("No Argument Cons");
		this.abc1();
	}
	void abc3() {
		this.abc2();
		int a=45,b=5;
		System.out.println(a+b);
		System.out.println(this.a);
	}
	ThisKeyWord(){
	this.abc1();
	int a=12;
	System.out.println("Saiprasad");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyWord f=new ThisKeyWord();
		System.out.println(f.a);
		f.abc();
		f.abc1();
//		f.abc2();
//		f.abc3();
	}

}
