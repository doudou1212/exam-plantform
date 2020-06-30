package exam.quizBankContext.domain.model.service;

import exam.quizBankContext.domain.model.blankQuiz.BlankQuiz;
import exam.quizBankContext.domain.model.quizBank.QuizBank;

import java.util.ArrayList;

public class QuizBankClientImpl implements QuizBankClient {
    private QuizBank quizBank = null;
    private QuizBankClientImpl() {
        if(this.quizBank == null) {
            this.quizBank = new QuizBank(new ArrayList<BlankQuiz>());
        }
    }

    @Override
    public QuizBank getQuizBank() {
        return this.quizBank;
    }

    @Override
    public void updateBlankQuiz(Integer blankQuizId, String question) {
        this.quizBank.updateBlankQuiz(blankQuizId, question);
    }

    @Override
    public void deleteBlankQuiz(Integer blankQuizId) {
        this.quizBank.deleteBlankQuiz(blankQuizId);
    }

    @Override
    public void addBlankQuiz(BlankQuiz blankQuiz) {
        this.quizBank.addBlankQuiz(blankQuiz);
    }
}
