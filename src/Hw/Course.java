package Hw;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private Integer courseId;
    private String courseTitle;
    private String courseStartDate;
    private String courseEndedDate;
    Boolean isAvailable;
}
