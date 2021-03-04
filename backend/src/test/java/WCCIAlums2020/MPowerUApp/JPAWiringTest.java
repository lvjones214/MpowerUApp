package WCCIAlums2020.MPowerUApp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest

public class JPAWiringTest {
 @Test
 public void organizationObjectShouldHaveCategoryObject(){
     Organization testOrganization = new Organization("name", "website", "phone", "adress", "hours", "description", "instructions");


    }

}

