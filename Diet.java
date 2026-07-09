public enum Diet {
	OMNIVORE (1),
	CARNIVORE (1.5),
	PISCIVORE (1.4),
	INSECTIVORE (1.2),
	HERBIVORE (0.5),
	FRUGIVORE (1.2),
	FOLIVORE (1.2);
	
	public final double careMultiplier;
	private Diet(double careMultiplier) {
		this.careMultiplier = careMultiplier;
	}

	public double getMultiplier() {
		return careMultiplier;
	}
}
