package Project2;

public class PriceExeption extends Exception {
    public PriceExeption(String message) {
        super(message); // מעביר את הודעת השגיאה למחלקת האב
    }
}
