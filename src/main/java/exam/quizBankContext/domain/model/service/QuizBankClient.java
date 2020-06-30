package exam.quizBankContext.domain.model.service;

import exam.quizBankContext.domain.model.blankQuiz.BlankQuiz;
import exam.quizBankContext.domain.model.quizBank.QuizBank;

public interface QuizBankClient {
    public QuizBank getQuizBank();
    public void updateBlankQuiz(Integer blankQuizId, String question);
    public void deleteBlankQuiz(Integer blankQuizId);
    public void addBlankQuiz(BlankQuiz blankQuiz);
}
