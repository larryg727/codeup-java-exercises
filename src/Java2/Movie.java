package Java2;

/**
 * Created by larryg on 5/18/17.
 */
public class Movie {

    private String name;
    private String category;

    public Movie(String name, String category){
        this.name = name;
        this.category = category;
    }

    public String getName(){
        return this.name;
    }

    public String getCategory(){
        return this.category;
    }


}
