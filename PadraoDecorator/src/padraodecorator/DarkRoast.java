package padraodecorator;


public class DarkRoast extends Beverage {
  public DarkRoast(){
      description = "Most Excellent Dark Roast";
  }
  
  
  @Override
  public double cost(){
      return  (double) (1.99 + super.cost());
  }
}
