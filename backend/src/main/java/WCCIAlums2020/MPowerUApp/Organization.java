package WCCIAlums2020.MPowerUApp;

import javax.persistence.*;
import java.util.Locale;

@Entity
public class Organization {
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

    @ManyToOne
    private CategoryGrouping categoryGrouping;

    public Organization() {
    }

    public Organization(String name, String website, String phone, String address, String hours, String description, String instructions) {
        this.name = name;
        this.website = website;
        this.phone = phone;
        this.address = address;
        this.hours = hours;
        this.description = description;
        this.instructions = instructions;

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
}
