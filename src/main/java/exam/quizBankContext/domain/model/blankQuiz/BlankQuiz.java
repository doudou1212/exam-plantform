package exam.quizBankContext.domain.model.blankQuiz;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.OffsetDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BlankQuiz {
    @Id
    private Integer id;

    private String question;

    @CreatedDate
    @Column(name = "created_at", updatable = false)
    protected OffsetDateTime createdAt;

    @LastModifiedDate
    @Column(name = "updated_at")
    protected OffsetDateTime updatedAt;
}
