package Collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dictionary {
    private Integer id;
    private String word;
    private String classify;
    private String description;
}
