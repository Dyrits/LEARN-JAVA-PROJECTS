public class Droid {
	
	String name;
	int batteryLevel;
	
	public Droid(String droidName) {
		name = droidName;
		batteryLevel = 100;
	}
	
	public String toString() {
		return String.format("Hello, I'm a droid named %s!", name);
	}
	
	public void performTask(String task) {
		if (batteryLevel > 0) { 
			System.out.printf("Understood. %s will now be %s! %n", name, task);
			batteryLevel -= 10; 
		} else { 
			System.out.println("Not enough energy remaining in order to perform any task.");
		}
	}
	
	public void energyReport() {
		if(batteryLevel > 50) {
			System.out.printf("%s: The energy level is still high: %s percents! %n", name, batteryLevel);
		} else {
			System.out.printf("%s: The energy level is low: %s percents! %n", name, batteryLevel);
		}
	}
	
	public void energyTransfer(Droid targetDroid, int amountOfEnergy) {
		if(amountOfEnergy > batteryLevel) { amountOfEnergy = batteryLevel; }
		targetDroid.batteryLevel += amountOfEnergy;
		if (targetDroid.batteryLevel > 100) {
			amountOfEnergy = amountOfEnergy - (targetDroid.batteryLevel - 100);
			targetDroid.batteryLevel = 100;
		}
		batteryLevel -= amountOfEnergy;
		System.out.printf("%s percents of energy transferred from %s to %s! %n", amountOfEnergy, name, targetDroid.name);
	}
	
	public static void main(String[] args) {
		Droid codey = new Droid("Codey");
		System.out.println(codey);
		codey.performTask("cleaning the house");
		codey.performTask("walking out the dog");
		codey.energyReport();
		Droid yedoc = new Droid("Yedoc");
		yedoc.energyTransfer(codey, 50);
		codey.energyReport();
		yedoc.energyReport();
	}
}