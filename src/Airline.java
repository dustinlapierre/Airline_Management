import java.util.ArrayList;

public class Airline {

	
	private String name;
	private ArrayList<Plane> planes;
	
	
	Airline(){
		name = "";
		planes = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Plane> getPlanes() {
		return planes;
	}
	
	public void addPlane(Plane plane) {
		planes.add(plane);
	}
	
	
}
