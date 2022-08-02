package student_Vladislavs_Solims.class_exersizes.lesson_15;

import student_Vladislavs_Solims.class_exersizes.lesson_4.Cat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StrimDemo {
    public static void main(String[] args) {
        Summable summable = (a, b) -> a + b;
        int a = summable.sum(2, 5);
        System.out.println(a);
        summable = (c, b) -> c + b + c;
        a = summable.sum(1 , 4);
        System.out.println(a);

        Predicate<Integer> isBigger18 = (number) -> number > 18;
        if(isBigger18.test(189)){
            System.out.println("Big number");
        }else{
            System.out.println("Number less than 18");
        }
        Function<String, Integer> charCounter = (text) -> text.length();
        System.out.println(charCounter.apply("123"));
        //Функциональный интерфейс , первый параметр то что будем давать ,
        //второй параметр то что будем получать .
        UnaryOperator<Cat> unaryOperator = (cat) ->{cat.makeNoise() ;
            return cat;
        };//что получил , то и отдал .
        BinaryOperator<Integer> binaryOperator = (v, b) -> v + b;
        System.out.println(binaryOperator.apply(2, 5));
        //пишем какой тип , потом пишум 2 параметра

        Supplier<Integer> maxInt = () -> Integer.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            System.out.println(maxInt.get());
        }

        Consumer<Integer> printer = (number) -> System.out.println(number);
        printer.accept(maxInt.get());

        Stream.of("a", "b", "c");
        List<String> names = new ArrayList<>();
        names.addAll(List.of("Den", "Ben", "Dzenn", "Arbuz", "ZOntic", "Unik"));

        List<Integer> newNames = names.stream()

                .skip(1)
                //.filter(s->s.charAt(0) == 'D' )
                .map(s -> s.concat("JIM"))
                .filter(s -> s.length() > 4)
                .map((s) ->{
                    return s.length();
                })
                .limit(10)
                .sorted()
                .toList()
               ;

        newNames.forEach(System.out::println);//ссылка на метод

       Map<Integer , String> nameMap = names.stream().collect(Collectors.toMap(
                (s) -> s.length(),
                Function.identity(),
                (i, j) -> i + j
        ));

        System.out.println(nameMap);




    }


}
