import package1.*;
class C{
	int x=100,y=200;
	public void setX(int z)
	{
		x=z;
	}
	public void setY(int y)
	{
		this.y=y;
	}
	public int getSum(){
		return x+y;
	}
}

class B { 
  public static void main(String[] args) {
	C c1 ;
	c1 = new C();
	c1.setX(-100);
	c1.setY(-200);
	System.out.println(" 从类 A 中访问 Clock hour="+c1.getSum());


  }
}