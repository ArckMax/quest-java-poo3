public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

	@Override
	public void takeOff() {
		System.out.println("The " + this.getName() + " takes off ! ");		
	}

	@Override
	public int ascend(int meters) {
		System.out.println("The " + this.getName() + " flies upward " + meters + " !");		
		return 0;
	}

	@Override
	public int descend(int meters) {
		System.out.println("The " + this.getName() + " flies downward " + meters + " !");		
		return 0;
	}

	@Override
	public void land() {
		System.out.println("The " + this.getName() + " lands !");		
	}
    
}
