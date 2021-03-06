package by.tms.bootstore.entity.books;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Genres {

    private long id;
    private String name;

    public Genres(long id) {
        this.id = id;
    }
}
