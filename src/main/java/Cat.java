import org.springframework.stereotype.Component;

@Component
public class Cat {
    private String message;
    public Cat(){

    }

    public Cat(String message) {
        this.message = message;
    }
    public String getMessage(){
        return message;
    }
}
