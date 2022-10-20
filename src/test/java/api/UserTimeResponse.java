package api;

public class UserTimeResponse extends UserTime{
    private String updatedAt;
    public UserTimeResponse(String name, String gob, String updatedAt) {
        super(name, gob);
        this.updatedAt = updatedAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
}
