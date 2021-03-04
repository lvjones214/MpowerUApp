package WCCIAlums2020.MPowerUApp;

import javax.persistence.OneToMany;
import java.util.Set;

public class Category {
    private String categoryName;
    @OneToMany
    private Set<Organization> organizations;

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public Category() {
    }


    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
