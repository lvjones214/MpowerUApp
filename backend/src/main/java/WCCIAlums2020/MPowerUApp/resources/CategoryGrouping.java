package WCCIAlums2020.MPowerUApp.resources;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Objects;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryGrouping that = (CategoryGrouping) o;
        return Objects.equals(categoryName, that.categoryName) && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryName, id);
    }

    @Override
    public String toString() {
        return "CategoryGrouping{" +
                "categoryName='" + categoryName + '\'' +
                ", id=" + id +
                '}';
    }
}
