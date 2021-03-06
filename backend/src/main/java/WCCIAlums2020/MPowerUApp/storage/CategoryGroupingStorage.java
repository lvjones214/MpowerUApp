package WCCIAlums2020.MPowerUApp.storage;

import WCCIAlums2020.MPowerUApp.resources.CategoryGrouping;
import org.springframework.stereotype.Service;

@Service
public class CategoryGroupingStorage {

    private CategoryGroupingRepository categoryGroupingRepo;


    public CategoryGroupingStorage(CategoryGroupingRepository categoryGroupingRepo) {
        this.categoryGroupingRepo = categoryGroupingRepo;
    }

    public CategoryGrouping retrieveCategoryGroupingById(Long id){
        return categoryGroupingRepo.findById(id).get();
    }

    public Iterable<CategoryGrouping> retrieveAllCategoryGroupings(){
        return categoryGroupingRepo.findAll();
    }

    public CategoryGroupingRepository getCategoryGroupingRepo() {
        return categoryGroupingRepo;
    }
}
