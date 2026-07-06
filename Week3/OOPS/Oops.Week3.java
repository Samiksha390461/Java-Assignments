package WEEK_3.OOPS;

import java.util.Random;

abstract class Compartment{
    public abstract String notice();

}
class FirstClass extends Compartment{

    @Override
    public String notice() {
       return "FirstClass Compartment";
    }
    
}
class Ladies extends Compartment{
    @Override
    public String notice(){
        return "Ladies Compartment";
    }
}
class General extends Compartment{
    @Override
    public String notice(){
        return "General Compartment";

    }
}
class Luggage extends Compartment{
    @Override
    public String notice(){
        return "Luggage Compartment";

    }
}
public class TestCompartment {

    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];
        Random rand = new Random();
        for(int i = 0; i<compartments.length; i++){
            int num = rand.nextInt(4)+1;
            if(num==1){
                compartments[i] = new FirstClass();;
            }
            else if(num==2){
                compartments[i] = new Ladies();
            }
            else if(num==3){
                compartments[i] = new General();
            }
            else if(num==4){
                compartments[i] = new Luggage();
            }
            System.out.println("Compartment " + (i + 1) + ":"+ compartments[i].notice());
        }
    }
}
