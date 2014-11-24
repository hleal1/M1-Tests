package Level3;

public class CarPanel {
	
	private int totalDistance;
	private float fuelConsume;
	private float fuelTank = 0;
	private int currentKm = 0;
	
	public CarPanel (int distance, float fuel)
	{
		this.totalDistance = distance;
		this.fuelConsume = fuel;
	}
	
	public float addFuel(int amount)
	{
		currentKm = totalDistance ;
		return fuelTank += amount;
	}
	
	public int getTotalKm()
	{
		return totalDistance;
	}
	
	public int getCurrentKm()
	{
		return totalDistance - currentKm;
	}
	
	public void addDistance (int distance)
	{
		totalDistance += distance;
	}
	
	public float getFuelConsume()
	{
		if (getCurrentKm() >= 100)
		{
			getCurrentFuel ;
		}
		
	}

	public float getCurrentFuel ()
	{
		return fuelTank;
	}
	
	public void setCurrentFuel(float fuel)
	{
		fuelTank = fuel; 
	}
}
