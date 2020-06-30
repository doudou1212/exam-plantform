package exam.quizBankContext.domain.model.quizBank;

import exam.quizBankContext.domain.model.blankQuiz.BlankQuiz;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Component
public class QuizBank {
    private List<BlankQuiz> blankQuizList = new ArrayList<>();

    public List<BlankQuiz> getBlankQuiz() {
        return this.blankQuizList;
    }

    public void addBlankQuiz(BlankQuiz blankQuiz) {
        this.blankQuizList.add(blankQuiz);
    }

    public void deleteBlankQuiz(Integer blankQuizId) {
        this.blankQuizList.remove(blankQuizId.intValue());
    }

    public void updateBlankQuiz(Integer blankQuizId, String question) {
        this.blankQuizList.get(blankQuizId.intValue()).setQuestion(question);
    }
}
