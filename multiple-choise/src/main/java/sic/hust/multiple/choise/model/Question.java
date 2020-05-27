package sic.hust.multiple.choise.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {
    private int id;
    private String title;
    private int topicId;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String answer;

}