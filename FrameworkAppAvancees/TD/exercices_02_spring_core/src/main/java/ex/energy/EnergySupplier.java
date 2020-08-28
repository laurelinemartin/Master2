package ex.energy;

import org.springframework.stereotype.Component;

import ex.Base;

/**
 * Component in charge of supplying energy
 */
@Component
public class EnergySupplier extends Base {

	public EnergySupplier() {
		super();
	}

	public EnergySupplier(EnergyTank tank) {
		super();
		addEnergyTank(tank);
	}

	void addEnergyTank(EnergyTank tank) {
		System.out.println(" --> add tank "+ tank);
	}
}
