import java.lang.annotation.*;

@Documented
@Target({ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)

public @interface DevelopmentHistoryWithReviewer {
    DevelopmentHistory developmentHistory();
    String[] reviewers() default {};
}