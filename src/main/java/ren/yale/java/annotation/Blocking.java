package ren.yale.java.annotation;

import java.lang.annotation.*;

/**
 * Created by yale on 2018/2/1.
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Blocking {
}