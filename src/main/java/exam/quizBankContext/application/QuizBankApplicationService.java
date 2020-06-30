package exam.quizBankContext.application;

import exam.quizBankContext.domain.model.blankQuiz.BlankQuiz;
import exam.quizBankContext.domain.model.quizBank.QuizBank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizBankApplicationService {
    private QuizBank quizBank;

    @Autowired
    public QuizBankApplicationService(QuizBank quizBank) {
        this.quizBank = quizBank;
    }

    public QuizBank getQuizBank() {
        return this.quizBank;
    }

    public void updateBlankQuiz(Integer blankQuizId, String question) {
        this.quizBank.updateBlankQuiz(blankQuizId, question);
    }

    public void deleteBlankQuiz(Integer blankQuizId) {
        this.quizBank.deleteBlankQuiz(blankQuizId);
    }

    public void addBlankQuiz(BlankQuiz blankQuiz) {
        this.quizBank.addBlankQuiz(blankQuiz);
    }
}
