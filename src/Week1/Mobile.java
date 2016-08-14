package Week1;

public class Mobile {

public static void main(String aa[])
{
MobileDes obj1 = new MobileDes();
MobileDes obj2 = new MobileDes();

obj1.color="Black";
obj1.weight=30;
obj1.size=30.32;

obj2.color="White";
obj2.weight=60;
obj2.size=60.32;

obj1.talk();

obj2.talk();

	
	
	}
}
class MobileDes
{
	String color;
	int weight;
	double size;
void talk()
	{
		System.out.println("I m for talking"+" "+ color+" "+weight+" "+size+" ");
	}

}