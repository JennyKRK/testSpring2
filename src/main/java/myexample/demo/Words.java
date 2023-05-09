package myexample.demo;


import org.springframework.stereotype.Component;

@Component("words")
public class Words {
    public String format() {
        return "this is only a little message";
    }
}
