package teacher.lesson_15_streams.lessoncode;

import teacher.vet.animals.Cat;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        Summable summable = (a, b) -> a + b;
        int a = summable.sum(1, 2);
        System.out.println(a);
        summable = (c, b) -> {
            int g = c + b + c;
            System.out.println("lkjsdfhg");
            return g;
        };
        a = summable.sum(1, 4);

        Predicate<Integer> isBigger18 = (number) -> number > 18;
        if (isBigger18.test(189)) {
            System.out.println("Big number");
        } else {
            System.out.println("Number less then 18");
        }

        Function<String, Integer> charCounter = (text) -> text.length();
        System.out.println(charCounter.apply("123"));

        UnaryOperator<Cat> unaryOperator =
                (cat) -> {
                    cat.makeNoise();
                    return cat;
                };

        BinaryOperator<Integer> binaryOperator = (v, b) -> v + b;
        System.out.println(binaryOperator.apply(1, 2));
        Supplier<Integer> maxInt = () -> Integer.MAX_VALUE;
        Consumer<Integer> printer = (number) -> System.out.println(number);
        for (int i = 0; i < 10; i++) {
            printer.accept(maxInt.get());
        }

        Stream.of("a", "b", "c");
        List<String> names = new ArrayList<>();
        names.addAll(List.of("Den", "Ben", "Dzenn", "ARBUZ", "ZOnk", "Unik"));

        List<Integer> newNames = names.stream()
                .peek(s -> System.out.println(s))
                .skip(1)
                .filter(s -> s.charAt(0) == 'D')
                .map(s -> s.concat("JIM"))
                .filter(s -> s.length() > 4)
                .map((s) -> {
                    return s.length();
                })
                .limit(10)
                .sorted()
                .toList();

        newNames.forEach(System.out::println);

        Map<Integer, String> nameMap = names.stream()
                .collect(Collectors.toMap(
                        (s) -> s.length(),
                        Function.identity(),
                        (i, j) -> i + j
                ));

        System.out.println(nameMap);

        List<Product> products = new ArrayList<>();
        final String bookCategory = "Books";
        final String toyCategory = "Toys";
        products.addAll(List.of(
                new Product(bookCategory, 1000),
                new Product("Food", 1),
                new Product(null, 101),
                new Product(toyCategory, 501),
                new Product(toyCategory, 1201),
                new Product(null, 101),
                new Product(bookCategory, 5)
        ));

        List<Product> filteredProducts = products.stream()
                .filter(filterExpensiveBooks(bookCategory))
                .toList();

        System.out.println(filteredProducts);

        List<Product> toysWithDiscount = products.stream()
                .filter(product -> toyCategory.equals(product.getCategory()))
                .map(product -> {
                    product.setPrice(product.getPrice() * 0.9);
                    return product;
                })
                .toList();

        System.out.println(toysWithDiscount);

        Optional<Product> cheapestProduct = products.stream()
                .filter(product -> bookCategory.equals(product.getCategory()))
                .sorted(Comparator.comparing(Product::getPrice))
                .findFirst();

        System.out.println(cheapestProduct);

        Optional<Double> reduce = products.stream()
//                .map(Product::getPrice)
                .map(product -> product.getPrice())
                .reduce((i, j) -> {
                    System.out.println(i);
                    System.out.println(j);
                    return i + j;
                });

        System.out.println(reduce);

        Map<String, Double> total = products.stream()
                .collect(Collectors.toMap(
                        p -> p.getCategory(),
                        p -> p.getPrice(),
                        (i, j) -> i + j
                ));
        System.out.println(total);

    }

    private static Predicate<Product> filterExpensiveBooks(String category) {
        return book -> category.equals(book.getCategory()) && book.getPrice() > 100.0;
    }
}
