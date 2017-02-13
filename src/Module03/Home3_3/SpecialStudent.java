package Module03.Home3_3;

public class SpecialStudent extends CollegeStudent {
     private long secretKey;
    private String email;

    public SpecialStudent(String collegeName, int rating, long id) {
        super(collegeName, rating, id);
    }
    public SpecialStudent(long secretKey) {
        this.secretKey = secretKey;
    }


    public SpecialStudent() {

    }

    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
