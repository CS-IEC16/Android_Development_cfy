package bjfu.it.cfy.beer_adviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands(String color){
        List<String> brands = new ArrayList<String>();
        if(color.equals("amber")){
            brands.add("Jack Amber");
            brands.add("I Love amber beer!");
        }
        else if(color.equals("light")){
            brands.add("Jail light");
            brands.add("I Love light beer!");
        }
        else if(color.equals("brown")){
            brands.add("Cindy brown");
            brands.add("I Love brown beer!");
        }
        else{
            brands.add("Ploy dark");
            brands.add("I Love dark beer!");
        }
        return brands;
    }
}
