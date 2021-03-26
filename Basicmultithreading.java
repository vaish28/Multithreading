package multithreading;
import java.lang.Thread;

class mythread1 extends Thread 
{
	private String name,msg;
	public mythread1(String name,String msg)
	{
		this.name=name;
		this.msg=msg;
	}
	
	
	public void run()
	{
		System.out.println(name+" Starts its execution");
		for(int i=0;i<5;i++)
		{
			System.out.println(name+" says "+msg);
			try
			{
				Thread.sleep(5000);//delay of 5000ms
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
		System.out.println(name+" finished execution");
	}
	

	}


public class mythread {

	public static void main(String[] args) {
		mythread1 m1=new mythread1("vaishnavi","hi");//object of MyThread class
		mythread1 m2=new mythread1("vaishnavi1","hello");//object of MyThread class
		m1.start();//starting m1
		m2.start();//starting m2
	}

}

/*

vaishnavi Starts its execution
vaishnavi says hi
vaishnavi1 Starts its execution
vaishnavi1 says hello
vaishnavi says hi
vaishnavi1 says hello
vaishnavi says hi
vaishnavi1 says hello
vaishnavi says hi
vaishnavi1 says hello
vaishnavi1 says hello
vaishnavi says hi
vaishnavi finished execution
vaishnavi1 finished execution
*/
