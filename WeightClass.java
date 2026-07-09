
public enum WeightClass {
	SUPERLIGHT(1.5),
	LIGHT(1.2),
	STANDARD(1),
	HEAVY(1.2),
	SUPERHEAVY(1.5);
	public final double careMultiplier;
	private WeightClass(double careMultiplier) {
		this.careMultiplier = careMultiplier;
	}

}
