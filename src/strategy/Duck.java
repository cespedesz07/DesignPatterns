package strategy;

public class Duck {
	
//	Esta clase corresponde al cliente que usará las interfaces
	private IFlyBehavior flyBehavior;
	private IQuackBehavior quackBehavior;
	
	public Duck( IFlyBehavior flyBehavior, IQuackBehavior quackBehavior ) {
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior;
	}
	
	public void executeFly() {
		this.flyBehavior.fly();
	}
	
	public void executeQuack() {
		this.quackBehavior.quack();
	}

}
