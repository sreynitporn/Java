package Project.Hw2;

import Arrays.Str;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private Integer courseID;
    private String courseTitle;
    private String courseStartDate;
    private String courseEndedDate;
    private Boolean isAvailable;
}
