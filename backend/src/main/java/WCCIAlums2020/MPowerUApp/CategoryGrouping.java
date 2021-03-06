package WCCIAlums2020.MPowerUApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class CategoryGrouping {
    private String categoryName;

    @Id
    @GeneratedValue
    private Long id;

    public Long getId() {
        return id;
    }

    public Set<Organization> getOrganizations() {
        return organizations;
    }

    @OneToMany
    private Set<Organization> organizations;

    public CategoryGrouping(String categoryName) {
        this.categoryName = categoryName;
    }

    public CategoryGrouping() {
    }


    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
