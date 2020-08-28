package ex;

import org.springframework.stereotype.Component;

import ex.command.CommandUnit;
import ex.energy.EnergySupplier;
import ex.radio.RadioTransmitter;

/**
 * Robot class
 */
@Component
public class Robot extends Base {
	
	private RadioTransmitter transmitter;
	private EnergySupplier energySupplier;
	private CommandUnit commandUnit;
		
	/**
	 * 
	 * @param commandUnit
	 * @param transmitter
	 * @param energySupplier
	 */
	public Robot(CommandUnit commandUnit, RadioTransmitter transmitter, EnergySupplier energySupplier) {
		this.commandUnit = commandUnit;
		this.transmitter = transmitter;
		this.energySupplier = energySupplier;
		System.out.println(" Wiring  "+this+"  -> Robot("+commandUnit+", "+transmitter+", "+energySupplier+")");
	}

	/**
	 * Run the robot
	 */
	public void run() {
    System.out.println("Look Mom, I run !");
  }
}
