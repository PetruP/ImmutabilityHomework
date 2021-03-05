import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Project {
    private final String name;
    private final int price;
    private final List<Category> categories;
    private final String description;


    public Project(String name, int price, List<Category> categories, String description) {
        this.name = name;
        this.price = price;
        this.categories = categories;
        this.description = description;
    }

    private Project(Builder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.categories = builder.categories;
        this.description = builder.description;
    }

    public static class Builder {
        private String name;
        private int price;
        private List<Category> categories;
        private String description;

        public Builder() {
            this.categories = new ArrayList<>();
        }

        public static Builder project() {
            return new Builder();
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder price(int price) {
            this.price = price;
            return this;
        }

        public Builder category(String category) {
            this.categories.add(Category.valueOf(category));
            return this;
        }

        public Builder categories(List<Category> categories) {
            if (categories != null) {
                this.categories.addAll(categories);
            }
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Project build() {
            return new Project(this);
        }
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
        Project project = (Project) o;
        return price == project.price && Objects.equals(name, project.name) && Objects.equals(categories, project.categories) && Objects.equals(description, project.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, categories, description);
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", categories=" + categories +
                ", description='" + description + '\'' +
                '}';
    }
}
