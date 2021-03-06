package WCCIAlums2020.MPowerUApp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest

public class JPAWiringTest {

    @Autowired
    private OrganzationRepository organizationRepo;

    @Autowired
    private CategoryGroupingRepository categoryGroupingRepo;

    @Autowired
    private TestEntityManager entityManager;

    private void flushAndClear(){
        entityManager.flush();
        entityManager.clear();
    }

 @Test
 public void organizationObjectShouldHaveCategoryObject(){
     CategoryGrouping testCategoryGrouping = new CategoryGrouping("category");
     categoryGroupingRepo.save(testCategoryGrouping);
     Organization testOrganization = new Organization(testCategoryGrouping, "name", "website", "phone", "address", "hours", "description", "instructions");
     organizationRepo.save(testOrganization);
     flushAndClear();
     Organization retrievedOrganization = organizationRepo.findById(testOrganization.getId()).get();
     assertThat(retrievedOrganization.getCategoryName()).isEqualTo(testCategoryGrouping);


    }

}

