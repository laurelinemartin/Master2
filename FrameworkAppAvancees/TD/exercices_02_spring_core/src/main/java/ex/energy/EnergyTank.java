package ex.energy;

import ex.Base;

public class EnergyTank extends Base{

  private float level;
  private float initialQuantity;

  public EnergyTank(float initialQuantity) {
    this.initialQuantity = initialQuantity;
    this.level = initialQuantity;
    
    System.out.println(" --> Initialization with "
    		+ " initialQuantity="+this.initialQuantity
    		+", level="+this.level);
  }

  
}
