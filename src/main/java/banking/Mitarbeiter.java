package banking;

public class Mitarbeiter {
    private String mitarbeiterId;
    private String password;

    public Mitarbeiter(String mitarbeiterId, String password) {
        this.mitarbeiterId = mitarbeiterId;
        this.password = password;
    }

    public String getMitarbeiterId() {
        return mitarbeiterId;
    }

    public void setMitarbeiterId(String mitarbeiterId) {
        this.mitarbeiterId = mitarbeiterId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
