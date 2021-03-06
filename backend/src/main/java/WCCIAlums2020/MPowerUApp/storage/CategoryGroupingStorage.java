package WCCIAlums2020.MPowerUApp.storage;

import WCCIAlums2020.MPowerUApp.resources.CategoryGrouping;
import WCCIAlums2020.MPowerUApp.resources.Organization;
import org.springframework.stereotype.Service;

@Service
public class CategoryGroupingStorage {

    private CategoryGroupingRepository categoryGroupingRepo;
    private OrganizationRepository organizationRepo;


    public CategoryGroupingStorage(CategoryGroupingRepository categoryGroupingRepo) {
        this.categoryGroupingRepo = categoryGroupingRepo;
    }

    public CategoryGrouping retrieveCategoryGroupingById(Long id){
        return categoryGroupingRepo.findById(id).get();
    }

    public Iterable<CategoryGrouping> retrieveAllCategoryGroupings(){
        return categoryGroupingRepo.findAll();
    }

    public Organization retrieveOrganizationById(Long id){
        return organizationRepo.findById(id).get();
    }
    public Iterable<Organization> retrieveAllOrganizations(){
        return organizationRepo.findAll();
    }

    public CategoryGroupingRepository getCategoryGroupingRepo() {
        return categoryGroupingRepo;
    }
}
