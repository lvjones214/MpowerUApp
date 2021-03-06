package WCCIAlums2020.MPowerUApp.controllers;

import WCCIAlums2020.MPowerUApp.resources.CategoryGrouping;
import WCCIAlums2020.MPowerUApp.storage.CategoryGroupingStorage;
import WCCIAlums2020.MPowerUApp.storage.OrganizationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class CategoryController {

    private CategoryGroupingStorage categoryGroupingStorage;
    private OrganizationRepository organizationRepo;

    public CategoryController(CategoryGroupingStorage categoryGroupingStorage, OrganizationRepository organizationRepo) {
        this.categoryGroupingStorage = categoryGroupingStorage;
        this.organizationRepo = organizationRepo;
    }
    
    @GetMapping("/api/categories")
    public Iterable<CategoryGrouping> retrieveAllCategories(){
        return categoryGroupingStorage.retrieveAllCategoryGroupings();
    }

    @GetMapping("/api/categories{id}")
    public CategoryGrouping retrieveCategoryById(@PathVariable Long id){
        return categoryGroupingStorage.retrieveCategoryGroupingById(id);
    }


}
