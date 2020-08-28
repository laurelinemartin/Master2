package ex.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import ex.Robot;
import ex.command.CommandUnit;
import ex.energy.EnergySupplier;
import ex.radio.RadioTransmitter;

@Configuration
@ComponentScan("ex")
public class MainConfig {

	// @Bean
	// public RadioTransmitter radioTransmitter() {
	// 	System.out.println(".....@Bean RadioTransmitter transmitter()");
	// 	return new RadioTransmitter();
	// }
	
	// @Bean
	// public EnergySupplier energySupplier() {
	// 	System.out.println(".....@Bean EnergySupplier energySupplier");
	// 	return new EnergySupplier();
	// }
	
	// @Bean
	// public CommandUnit commandUnit() {
	// 	System.out.println(".....@Bean CommandUnit commandUnit");
	// 	return new CommandUnit();
	// }  
	
	// @Bean 
	// public Robot robot(CommandUnit commandUnit, RadioTransmitter transmitter, EnergySupplier energySupplier) {
	// 	System.out.println(".....@Bean Robot robot");
	// 	Robot robot = new Robot(commandUnit, transmitter, energySupplier);
	// 	return robot;
	// }
}
