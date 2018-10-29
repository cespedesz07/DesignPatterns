package strategy;

public class NormalQuack implements IQuackBehavior {

	@Override
	public void quack() {
		System.out.println( "-> Normal Quack" );
	}

}
