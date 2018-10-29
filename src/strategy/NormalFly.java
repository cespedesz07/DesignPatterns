package strategy;

public class NormalFly implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.println( "-> Normal Fly" );
		
	}

}
