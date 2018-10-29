package strategy;

public class CreepyQuack implements IQuackBehavior {
	
	@Override
	public void quack() {
		System.out.println( "-> Creepy Quack" );
	}

}
