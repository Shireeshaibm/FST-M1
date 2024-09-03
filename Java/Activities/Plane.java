import java.security.PublicKey;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Plane {
	
	
	private List<String> passengers;
	private Date lasttimetookoff;
	private Date lasttimelanded;
	private int maxPassengers;
	
	
	
	
	public Plane(int maxPassengers) {
		this.maxPassengers= maxPassengers;
		this.passengers=new ArrayList<>();
		}
	
	public void Onboard(String passenger) {
		
	    this.passengers.add(passenger);
			}

	
	public Date takeOff() {
		this.lasttimetookoff=new Date(maxPassengers);
		return lasttimetookoff;
		
		
		
	}
	
public void land() {
		this.lasttimelanded= new Date(maxPassengers);
		this.passengers.clear();
		
	}

public Date getLastTimeLanded() {
	return lasttimelanded;
}

public List<String> getPassesngers() {
	
	return passengers;
}

}
