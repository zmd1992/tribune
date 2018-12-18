package com.tribune;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FieldComment {
    /**
     * string值默认 空字符串
     * @return
     */
    String value() default "";

    /**
     * 请求默认false
     * @return
     */
    boolean required() default false;

    /**
     * 字符串 默认值 默认空字符串
     * @return
     */
    String defaultValue() default "";
}
