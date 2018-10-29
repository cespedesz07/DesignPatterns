package strategy;

public class Main {
	
	public static void main(String[] args) {
//		A la instancia se le pasan como parámetros los comportamientos que va a tener
		System.out.println( "Normal Duck (:|) :" );
		Duck duckNormal = new Duck( new NormalFly(), new NormalQuack() );
		duckNormal.executeFly();
		duckNormal.executeQuack();
		
		System.out.println( "\nMonster Duck (:D) :" );
		Duck monsterDuck = new Duck( new JetFly(), new CreepyQuack() );
		monsterDuck.executeFly();
		monsterDuck.executeQuack();
	}

}
