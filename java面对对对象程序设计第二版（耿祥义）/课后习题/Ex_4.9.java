class C{
	int n;
	static int sum=0;
	void setN(int n){
		this.n=n;
	}
	int getSum(){
		for(int i=1;i<=n;i++){
			sum=sum+i;
		}
		return sum;
	}
}

public class B { 
  public static void main(String[] args) {
	C c1=new C() ;
	C c2 = new C();
	c1.setN(3);
	c2.setN(5);
	int s1=c1.getSum();
	int s2=c2.getSum();
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s1+s2);


  }
}