package AssignAbstract;

public abstract class Vehicle {
	private int speed;
	private long distance;
	
	Vehicle (){}
	Vehicle (int speed, long distance){
		
	}
	
	public void fuel(int x) {
		
	}
	public void fuel(float x, String y) {
		
	}

	public void fuel(char x , int y) {
	
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public long getDistance() {
		return distance;
	}
	
	public void setDistance(long distance) {
		this.distance = distance;
	}
	
	abstract void run();
	abstract void stop();
	
	
	
	
	

}
