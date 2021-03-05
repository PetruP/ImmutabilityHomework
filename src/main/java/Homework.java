import java.util.List;

public class Homework {

    public static void main(String[] args) {
        immutableProject();
    }

    private static void immutableProject() {
        Project project = Project.Builder.project()
                .name("Marius")
                .price(120)
                .build();
        Project project2 = Project.Builder.project()
                .description("asafasf")
                .category("CLOTHES")
                .category("FOOD")
                .category("ELECTRONICS")
                .category("DYI")
                .build();
        Project project3 = Project.Builder.project()
                .description("fafsfgg")
                .categories(List.of(Category.CLOTHES, Category.ELECTRONICS))
                .build();
        System.out.println(project.toString());
        System.out.println(project2.toString());
        System.out.println(project3.toString());
    }

}
