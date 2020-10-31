package com.towelong.zhihu.common.annotation;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RouteMeta {
    String permission() default "";
    String module() default "";
    boolean mount() default false;
}
