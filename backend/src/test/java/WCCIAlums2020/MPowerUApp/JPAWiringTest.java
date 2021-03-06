package WCCIAlums2020.MPowerUApp;

import WCCIAlums2020.MPowerUApp.resources.CategoryGrouping;
import WCCIAlums2020.MPowerUApp.resources.Organization;
import WCCIAlums2020.MPowerUApp.storage.CategoryGroupingRepository;
import WCCIAlums2020.MPowerUApp.storage.OrganizationRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest

public class JPAWiringTest {

    @Autowired
    private OrganizationRepository organizationRepo;

    @Autowired
    private CategoryGroupingRepository categoryGroupingRepo;

    @Autowired
    private TestEntityManager entityManager;

    private void flushAndClear(){
        entityManager.flush();
        entityManager.clear();
    }

    @Test
    public void categoryRepoShouldSaveAndRetrieveCategories(){
        CategoryGrouping testCategoryGrouping = new CategoryGrouping("category");
        categoryGroupingRepo.save(testCategoryGrouping);
        flushAndClear();
        CategoryGrouping retrievedTestCategoryGrouping = categoryGroupingRepo.findById(testCategoryGrouping.getId()).get();
        assertThat(retrievedTestCategoryGrouping).isEqualTo(testCategoryGrouping);
    }

    @Test
    public void organizationRepoShouldSaveAndRetrieveOrganizations(){
        CategoryGrouping testCategoryGrouping = new CategoryGrouping("category");
        categoryGroupingRepo.save(testCategoryGrouping);
        Organization testOrganization = new Organization(testCategoryGrouping, "name", "website", "phone", "address", "hours", "description", "instructions");
        organizationRepo.save(testOrganization);
        flushAndClear();
        Organization retrievedOrganization = organizationRepo.findById(testOrganization.getId()).get();
        assertThat(retrievedOrganization).isEqualTo(testOrganization);
    }

    @Test
    public void organizationObjectShouldHaveCategoryObject(){
     CategoryGrouping testCategoryGrouping = new CategoryGrouping("category");
     categoryGroupingRepo.save(testCategoryGrouping);
     Organization testOrganization = new Organization(testCategoryGrouping, "name", "website", "phone", "address", "hours", "description", "instructions");
     organizationRepo.save(testOrganization);
     flushAndClear();
     Organization retrievedOrganization = organizationRepo.findById(testOrganization.getId()).get();
     assertThat(retrievedOrganization.getCategoryGrouping()).isEqualTo(testCategoryGrouping);
    }

}

