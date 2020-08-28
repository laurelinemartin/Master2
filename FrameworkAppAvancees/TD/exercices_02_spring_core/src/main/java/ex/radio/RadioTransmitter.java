package ex.radio;

import org.springframework.stereotype.Component;

import ex.Base;

/**
 * Component in charge of communication par radio
 */
@Component
public class RadioTransmitter extends Base {
	
	private RadioDriver driver;
	
	public void setDriver(RadioDriver driver) {
		this.driver = driver;
		System.out.println(" Wiring  "+this+" -> setDriver("+driver+")");
	}
}
