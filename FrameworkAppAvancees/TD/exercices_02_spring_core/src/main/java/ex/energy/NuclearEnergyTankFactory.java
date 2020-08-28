package ex.energy;

import ex.Base;

public class NuclearEnergyTankFactory extends Base{
	
	private String name;

	public NuclearEnergyTankFactory(String name) {
		this.name = name;
	}
	
	public EnergyTank getNuclearTank() {
		System.out.println(" #-> NuclearEnergyTankFactory->getNuclearTank()");
		return new NuclearEnergyTank(10000);
	}

}
