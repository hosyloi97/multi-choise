package sic.hust.multiple.choise.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Exam {
    private int id;
    private String name;
    private int quantityQues;
    private String idQues;
    private List<Question> listQuestions;
}