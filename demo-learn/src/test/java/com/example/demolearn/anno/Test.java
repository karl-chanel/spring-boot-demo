package com.example.demolearn.anno;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.Arrays;

/**
 * @author jasper
 * @email jaspersteelxx@gmail.com
 * @create 2022-12-19 06:23
 **/
@Apis({@Api(type = 10, level = "hello", value = "world"),
    @Api(type = 18, level = "karl", value = "chanel"),
    @Api(type = 15, level = "jasper", value = "steel")})
class Test {
    public static void main(String[] args) {
//        Annotation[] annotations = Test.class.getAnnotations();
//        for (Annotation annotation : annotations) {
//            Api api = annotation instanceof Api ? ((Api) annotation) : null;
//            System.out.println(api.level());
//            System.out.println(api.type());
//            System.out.println(api.value());
//        }
//        Annotation[] annotations = Test.class.getAnnotations();
//        Apis apis = annotations[0] instanceof Apis ? ((Apis) annotations[0]) : null;
//        Api[] value = apis.value();
//        for (Api api : value) {
//            System.out.println(api.type());
//            System.out.println(api.level());
//            System.out.println(api.value());
//            System.out.println("==================");
//        }
        Marker marker1 = Person.class.getAnnotation(Marker.class);
        for (Annotation annotation : marker1.annotationType().getAnnotations()) {
            Retention retention = annotation instanceof Retention ? ((Retention) annotation) : null;
            if (retention != null) {
                System.out.println(retention.value());
            }
            Target target = annotation instanceof Target ? ((Target) annotation) : null;
            if (target != null) {
                System.out.println(Arrays.toString(target.value()));
            }
//            System.out.println(annotation+"maker=======================");
        }
        Annotation[] annotations = Person.class.getAnnotations();
        for (Annotation annotation : annotations) {
            Apis apis = annotation instanceof Apis ? ((Apis) annotation) : null;
            if (apis != null) {
                Class<? extends Annotation> type = apis.annotationType();
                Annotation[] typeAnnotations = type.getAnnotations();
                for (Annotation typeAnnotation : typeAnnotations) {
                    System.out.println(typeAnnotation);
                    Marker marker = typeAnnotation instanceof Marker ? ((Marker) typeAnnotation) : null;
                    if (marker != null) {
                        System.out.println(marker.value());
                    }
                }
                System.out.println(apis.getClass());
//                for (Api api : apis.value()) {
//                    System.out.println(api.type());
//                    System.out.println(api.level());
//                    System.out.println(api.value());
//                }
            }
            Marker marker = annotation instanceof Marker ? ((Marker) annotation) : null;
            if (marker != null) {
//                System.out.println(marker.value());
            }
        }
    }

    @Marker("hook")
    static class Person extends Test {

    }

}
