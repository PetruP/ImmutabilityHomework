import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductReCreated {
    private String name;
    private int price;
    private final List<Category> categories;
    private String description;

    public ProductReCreated() {
        this.categories = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductReCreated product = (ProductReCreated) o;
        return price == product.price && Objects.equals(name, product.name) && Objects.equals(categories, product.categories) && Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, categories, description);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", categories=" + categories +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder{
        ProductReCreated product;

        public Builder() {
            product = new ProductReCreated();
        }

        public static Builder product() {
            return new Builder();
        }

        public Builder name(String name) {
            product.name = name;
            return this;
        }
        public Builder price(int price) {
            product.price = price;
            return this;
        }
        public Builder category(String category) {
            product.categories.add(Category.valueOf(category));
            return this;
        }
        public Builder description(String description) {
            product.description = description;
            return this;
        }
        public ProductReCreated build(){
            return product;
        }
    }
}