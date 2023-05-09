package myexample.demo;
import org.springframework.stereotype.Component;


public class YourFriend {
    private String name;
    private int years;

    public YourFriend(String name, int years) {
        this.name = name;
        this.years = years;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }


    public void printToString() {
        System.out.println("YourFriend{" +
                "name='" + name + '\'' +
                ", this is how long you have known each other (years): " + years +
                '}');
    }
}
