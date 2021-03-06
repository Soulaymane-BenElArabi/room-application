package ma.ensa.room.entity;

public class Salle {
    private int id;
    private String code;
    private String type;

    @Override
    public String toString() {
        return "Salle{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public Salle(int id, String code, String type) {
        this.id = id;
        this.code = code;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
