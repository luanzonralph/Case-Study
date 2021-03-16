public class DemoHorse{
	public static void main (String[] args){
	Horse horse = new Horse( "20", "Vice", "Red", "2000");

	System.out.println("NAME : "+horse.getName());
	System.out.println("COLOR: "+horse.getColor());
	System.out.println("BIRTHYEAR: "+horse.getBirthYear());
	System.out.println("RACE COMPLETED : "+horse.getRaceCompleted());
}
}