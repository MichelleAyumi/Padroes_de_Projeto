public class BeverageTestDrive {
    public static void main(String[] args){
        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();
        
        System.out.println("\n Making tea...");
        teaHook.prepareRecipe();
        
        System.out.println("\n Making coffee...");
        coffeeHook.prepareRecipe();
    }
    
}
