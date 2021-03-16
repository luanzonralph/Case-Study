public class Horse extends RedHorse{
  private String name, color, birthYear;

  
  public Horse(String raceCompleted, String name, String color, String birthYear){
	super(raceCompleted);
	setName(name);
	setColor(color);
	setBirthYear(birthYear);
	}
	
  public String getName(){
	return name;
	}
  public void setName (String name){
    this.name= name;
	}
	
  public String getColor(){
	return color;
	}
  public void setColor (String color){
    this.color = color;
	}
	
  public String getBirthYear(){
	return birthYear;
	}
  public void setBirthYear (String birthYear){
    this.birthYear= birthYear;
	}
}