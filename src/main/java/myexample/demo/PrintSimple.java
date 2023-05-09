package myexample.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PrintSimple {

    @Autowired
    private Words words;

    public void printLittleThing(String yourText) {
            System.out.println(yourText);
    }

    @Override
    public String toString() {
        return "PrintSimple{" +
                "words=" + words +
                '}';
    }
}
