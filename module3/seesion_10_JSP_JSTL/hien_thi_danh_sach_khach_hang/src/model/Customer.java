public class Customer {
    private int id;
    private String name;
    private String birthday;
    private String adress;
    private String img;

    public Customer(int id, String name, String birthday, String adress, String img) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.adress = adress;
        this.img = img;
    }

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
