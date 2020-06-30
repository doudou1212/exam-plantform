package exam.quizBankContext.domain.model.quizBank;

import exam.quizBankContext.domain.model.blankQuiz.BlankQuiz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class QuizBankTest {
    private QuizBank quizBank;

    @BeforeEach
    public void setUp() {
        List<BlankQuiz> blankQuizList = new ArrayList<>();
        BlankQuiz blankQuiz = new BlankQuiz();
        BlankQuiz bq = blankQuiz.builder().id(1).question("question1").build();
        blankQuizList.add(bq);

        quizBank = new QuizBank(blankQuizList);
    }

    @Test
    void getBlankQuiz() {
        assertThat(this.quizBank.getBlankQuiz().size()).isEqualTo(1);
    }

    @Test
    void addBlankQuiz() {
        BlankQuiz blankQuiz = new BlankQuiz();
        BlankQuiz bq = blankQuiz.builder().id(1).question("question1").build();
        this.quizBank.addBlankQuiz(bq);
        assertThat(this.quizBank.getBlankQuiz().size()).isEqualTo(2);
    }

    @Test
    void deleteBlankQuiz() {
        assertThat(this.quizBank.getBlankQuiz().size()).isEqualTo(1);
        this.quizBank.deleteBlankQuiz(0);
        assertThat(this.quizBank.getBlankQuiz().size()).isEqualTo(0);
    }

    @Test
    void updateBlankQuiz() {
        this.quizBank.updateBlankQuiz(0, "question2");
        assertThat(this.quizBank.getBlankQuiz().get(0).getQuestion()).isEqualTo("question2");
    }
}
