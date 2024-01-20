import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

public @interface DevelopmentHistory {
    int version() default 1;
    String developer() default "developer";
    String tester() default "tester";
}
