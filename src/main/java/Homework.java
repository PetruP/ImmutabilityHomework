import java.util.List;

public class Homework {

    public static void main(String[] args) {
        immutableProduct();
    }

    private static void immutableProduct() {
        Product product = Product.Builder.product()
                .name("Marius")
                .price(120)
                .build();
        Product product2 = Product.Builder.product()
                .description("asafasf")
                .category("CLOTHES")
                .category("FOOD")
                .category("ELECTRONICS")
                .category("DYI")
                .build();
        Product product3 = Product.Builder.product()
                .description("fafsfgg")
                .categories(List.of(Category.CLOTHES, Category.ELECTRONICS))
                .build();
        System.out.println(product.toString());
        System.out.println(product2.toString());
        System.out.println(product3.toString());

        ProductReCreated productReCreated = ProductReCreated.Builder.product()
                .description("recreated project")
                .price(100)
                .name("recreated")
                .category("CLOTHES")
                .category("FOOD")
                .build();
        System.out.println(productReCreated.toString());
    }

}
