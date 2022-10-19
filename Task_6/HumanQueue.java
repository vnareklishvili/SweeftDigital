import java.util.LinkedList;

public class HumanQueue extends LinkedList<String> {

    private String description;

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String desc) {
        this.description = desc;
    }

}
