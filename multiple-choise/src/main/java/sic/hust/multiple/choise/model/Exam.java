package sic.hust.multiple.choise.model;

@Data
public class Exam {
    private int id;
    private String name;
    private int quantityQues;
    private String idQues;
    private List<Question> listQuestions;
}