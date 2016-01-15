
public class Demo {
	public static void main(String[] args) {
		
		soldier ghost = new soldier (8,1500);
		ghost.takeDamage(150);
		System.out.println("soldier");
		System.out.println("Hit Point: "+ ghost.getremainingHitpoint()+"/" + ghost.getHitPoints());
		System.out.println("Lives: "+ghost.getLives());
		System.out.println();
		
		super supersoldier=new SuperSoldier(12,1499);
		if (supersoldier.checkHitpoints()){
			System.out.println("Super Soldier");
			supersoldier.takeDamage(100)
		}
		
		
		
		
	

	}

}
