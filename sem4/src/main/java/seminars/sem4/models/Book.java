package seminars.sem4.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    private String title;
    private String nameAuthor;
    private int year;
}
