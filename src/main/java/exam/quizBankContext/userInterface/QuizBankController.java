package exam.quizBankContext.userInterface;

import exam.quizBankContext.application.QuizBankApplicationService;
import exam.quizBankContext.domain.model.blankQuiz.BlankQuiz;
import exam.quizBankContext.domain.model.quizBank.QuizBank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class QuizBankController {
    private QuizBankApplicationService quizBankApplicationService;

    @Autowired
    public QuizBankController(QuizBankApplicationService quizBankApplicationService) {
        this.quizBankApplicationService = quizBankApplicationService;
    }

    @GetMapping("/quizbank") //读请求,获取倒序排列的Paper
    QuizBank getQuizBank() {
        return this.quizBankApplicationService.getQuizBank();
    }

    @PostMapping("/quizbank")
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    QuizBank addBlankQuiz(@RequestBody String question) {
        BlankQuiz blankQuiz = new BlankQuiz();
        BlankQuiz bq = blankQuiz.builder().question(question).build();
        this.quizBankApplicationService.addBlankQuiz(bq);
        return this.quizBankApplicationService.getQuizBank();
    }

    @PutMapping("/quizbank/{blankQuizId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void updateBlankQuiz(@PathVariable Integer blankQuizId, @RequestBody String question) {
        quizBankApplicationService.updateBlankQuiz(blankQuizId, question);
    }

    @DeleteMapping("/quizbank/{blankQuizId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteBlankQuiz(@PathVariable Integer blankQuizId) {
        quizBankApplicationService.deleteBlankQuiz(blankQuizId);
    }
}
