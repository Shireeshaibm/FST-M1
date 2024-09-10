
public class MountainBike extends BiCycle {

	

	
	public int seatHeight;
	
	public MountainBike(int gears,int currentSpeed,int startHeight) {
	
		super(gears,currentSpeed);
		seatHeight=seatHeight;
		
		
	}
	
	public String bicycleDesc() {
	  
		
		return(super.bicycleDesc()+"\nseatheight is "+ seatHeight);
		//return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed+"\nseatheight is "+ seatHeight);
	}
	public void setHeight(int newValue) {
	    seatHeight = newValue;
	}

}
