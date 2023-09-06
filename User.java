import java.util.Date;
import java.util.List;

public class User {
    private Date birthdate;
    private int size;
    private List<Photo> photos;
    private Adress address;

    public User() {}

    public User(Date birthdate, int size, List<Photo> photos, Address address) {
        this.birthdate = birthdate;
        this.size = size;
        this.photos = photos;
        this.address = address;
    }
}