
public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		Plane plane = new Plane(10);
		
		plane.Onboard("sree");
		plane.Onboard("siree");
		plane.Onboard("shree");
		plane.Onboard("sriee");
		plane.Onboard("sioree");
		
		
		System.out.println("plane took off"+plane.takeOff());
		
		System.out.println("people on plane "+plane.getPassesngers());
		Thread.sleep(5000);
		
		plane.land();
		System.out.println("plane landed at "+plane.getLastTimeLanded());
		
		System.out.println("people on plane "+plane.getPassesngers());
		
	}

}
