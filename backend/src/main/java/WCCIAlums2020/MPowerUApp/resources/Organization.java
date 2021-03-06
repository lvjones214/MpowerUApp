package WCCIAlums2020.MPowerUApp.resources;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Organization {
    @ManyToOne
    private CategoryGrouping categoryGrouping;
    private String name;
    private String website;
    private String phone;
    private String address;
    private String hours;
    private String description;
    private String instructions;
    @Id
    @GeneratedValue
    private Long id;


    public Organization() {
    }

    public Organization(CategoryGrouping categoryGrouping, String name, String website, String phone, String address, String hours, String description, String instructions) {
        this.categoryGrouping = categoryGrouping;
        this.name = name;
        this.website = website;
        this.phone = phone;
        this.address = address;
        this.hours = hours;
        this.description = description;
        this.instructions = instructions;
    }

    public Long getId() {
        return id;
    }

    public CategoryGrouping getCategoryGrouping() {
        return categoryGrouping;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Organization that = (Organization) o;
        return Objects.equals(categoryGrouping, that.categoryGrouping) && Objects.equals(name, that.name) && Objects.equals(website, that.website) && Objects.equals(phone, that.phone) && Objects.equals(address, that.address) && Objects.equals(hours, that.hours) && Objects.equals(description, that.description) && Objects.equals(instructions, that.instructions) && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryGrouping, name, website, phone, address, hours, description, instructions, id);
    }

    @Override
    public String toString() {
        return "Organization{" +
                "categoryGrouping=" + categoryGrouping +
                ", name='" + name + '\'' +
                ", website='" + website + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", hours='" + hours + '\'' +
                ", description='" + description + '\'' +
                ", instructions='" + instructions + '\'' +
                ", id=" + id +
                '}';
    }
}
