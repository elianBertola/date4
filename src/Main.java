import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        //creazione data
        OffsetDateTime date1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime date2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        //verificazione date
        boolean olderDate = date1.getYear() <= date2.getYear() && date1.getDayOfYear() < date2.getDayOfYear();
        if (olderDate) {
            System.out.println("La prima data e precedente alla seconda");
        }
        if (date1.getHour() == date2.getHour()) {
            System.out.println("Entrambe le date anno la stessa ora");
        }
    }
}