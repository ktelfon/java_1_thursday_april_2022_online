package student_Vladislavs_Solims.class_exersizes.lesson_15.training;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProductDEmo {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        String category = "Books";
        final String toyCategory = "Toys";
        final String bookCategory = "Books";
        products.addAll(List.of(
                new Product(category, 100),
                new Product("food", 1),
                new Product(null, 101),
                new Product(category, 5)
        ));

        List<Product> filteredProducts = products.stream()
                .filter(filterExpensiveBooks(category))
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
                .sorted(Comparator.comparing(Product :: getPrice))
                .limit(1)
                .findFirst();
        System.out.println(cheapestProduct);


       Optional<Double> reduce = products.stream()
             //   .map(Product::getPrice)     // мап переделывает то что было в то что задали
               .map(product -> product.getPrice())//второй вариаент предыдущей записи
               .reduce((i, j) ->{
            System.out.println(i);
            System.out.println(j);
            return i + j;                //reduce принимает 2 вези , а вохвращает одну
        });
        System.out.println(reduce);

        Map<String , Double> total = products.stream()
                .collect(Collectors.toMap(
                   p -> p.getCategory(),//ключ
                   p -> p.getPrice(),//value
                        (i, j) -> i + j
                ));
        System.out.println(total);
    }
    private static Predicate<Product> filterExpensiveBooks(String category) {
        return book -> category.equals(book.getCategory()) && book.getPrice() > 100.0;
    }

}

