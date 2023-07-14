import java.text.SimpleDateFormat;

public class Animal {
    private String name;
    private String command;
    private SimpleDateFormat birthDay;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SimpleDateFormat getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(SimpleDateFormat birthDay) {
        this.birthDay = birthDay;
    }

    public Animal(String name, String type, SimpleDateFormat birthDay) {
        this.name = name;
        this.birthDay = birthDay;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }

}
