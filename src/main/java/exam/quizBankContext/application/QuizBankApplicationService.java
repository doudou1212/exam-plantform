package exam.quizBankContext.application;

import exam.quizBankContext.domain.model.blankQuiz.BlankQuiz;
import exam.quizBankContext.domain.model.quizBank.QuizBank;
import exam.quizBankContext.domain.model.service.QuizBankClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizBankApplicationService {
    private QuizBankClient quizBankClient;

    @Autowired
    public QuizBankApplicationService(QuizBankClient quizBankClient) {
        this.quizBankClient = quizBankClient;
    }

    public QuizBank getQuizBank() {
        return this.quizBankClient.getQuizBank();
    }

    public void updateBlankQuiz(Integer blankQuizId, String question) {
        this.quizBankClient.updateBlankQuiz(blankQuizId, question);
    }

    public void deleteBlankQuiz(Integer blankQuizId) {
        this.quizBankClient.deleteBlankQuiz(blankQuizId);
    }

    public void addBlankQuiz(BlankQuiz blankQuiz) {
        this.quizBankClient.addBlankQuiz(blankQuiz);
    }
}
