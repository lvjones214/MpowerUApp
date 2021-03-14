package WCCIAlums2020.MPowerUApp;

import WCCIAlums2020.MPowerUApp.resources.CategoryGrouping;
import WCCIAlums2020.MPowerUApp.resources.Organization;
import WCCIAlums2020.MPowerUApp.storage.CategoryGroupingStorage;
import WCCIAlums2020.MPowerUApp.storage.OrganizationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {

    private CategoryGroupingStorage categoryGroupingStorage;
    private OrganizationRepository organizationRepo;

    public Populator(CategoryGroupingStorage categoryGroupingStorage, OrganizationRepository organizationRepo){
        this.categoryGroupingStorage = categoryGroupingStorage;
        this.organizationRepo = organizationRepo;
    }

    @Override
    public void run(String... args) throws Exception{

        CategoryGrouping unemployment = new CategoryGrouping("Unemployment");
        categoryGroupingStorage.saveCategory(unemployment);
        Organization odjfs= new Organization(unemployment, "Ohio Department of Job and Family Services", "https://unemploymenthelp.ohio.gov/", "(877) 644-6562", "P.O. Box 182212, Columbus, OH 43218-2212", "M-F: 7AM-7PM || SA: 9AM-5PM || SU: 9AM-1PM", "Unemployment Insurance Benefits", "https://jfs.ohio.gov/ouio/ClaimInformationPage.stm");
        organizationRepo.save(odjfs);

        CategoryGrouping healthcare = new CategoryGrouping("Healthcare");
        categoryGroupingStorage.saveCategory(healthcare);
        Organization cobra= new Organization(healthcare, "Consolidated Omnibus Budget Reconciliation Act", "https://www.dol.gov/general/topic/health-plans/cobra", "(866) 444-3272", "Department of Labor's Employee Benefits Security Administration at askebsa.dol.gov", "N/A", "Healthcare benefit provisions amend the Employment Retirement Income Security Act, the Internal Revenue Code and the Public Health Service Act to require group health plans to provide a temporary continuation of group health coverage that otherwise might be terminated", "If you are entitled to elect COBRA coverage, you must be given an election period of at least 60 days (starting on the later of the date you are furnished the election notice or the date you would lose coverage) to choose whether or not to elect continuation coverage. https://www.dol.gov/sites/dolgov/files/EBSA/about-ebsa/our-activities/resource-center/faqs/cobra-continuation-health-coverage-consumer.pdf");
        organizationRepo.save(cobra);
        Organization medicaid= new Organization(healthcare, "Medicaid", "https://medicaid.ohio.gov/", "Provider Hotline: 1-800-686-1516 || Consumer Hotline: 1-800-324-8680", "Online: https://jfs.ohio.gov/County/County_Directory.pdf", "24/7", "Launched in July 2013, the Ohio Department of Medicaid (ODM) is Ohio's first Executive-level Medicaid agency. With a network of approximately 130,000 active providers, ODM delivers health care coverage to more than 2.9 million residents of Ohio on a daily basis. Working closely with stakeholders, advocates, medical professionals, and fellow state agencies, the agency continues to find new ways to modernize Medicaid in Ohio", "https://ssp.benefits.ohio.gov/apspssp/indexOHLanding.jsp");
        organizationRepo.save(medicaid);
        Organization hmp= new Organization(healthcare, "Healthcare Marketplace", "", "", "", "", "", "");
        organizationRepo.save(hmp);
        Organization rma= new Organization(healthcare, "RMA/Retirement Funds", "", "", "", "", "", "");
        organizationRepo.save(rma);

        CategoryGrouping childcare = new CategoryGrouping("Childcare");
        categoryGroupingStorage.saveCategory(childcare);
        Organization publiclyfundedchildcare= new Organization(childcare, "Publicly Funded Child Care", "https://ohio.gov/wps/portal/gov/site/residents/resources/child-care-assistance", "(614) 466-1213", "Depends on County: https://jfs.ohio.gov/County/County_Directory.pdf", "", "", "");
        organizationRepo.save(publiclyfundedchildcare);

        CategoryGrouping reemployment = new CategoryGrouping("Re-employment");
        categoryGroupingStorage.saveCategory(reemployment);
        Organization jfs= new Organization(reemployment, "Jewish Family Services", "", "", "", "", "", "");
        organizationRepo.save(jfs);
        Organization jsfg= new Organization(reemployment, "Job Search Focus Group", "", "", "", "", "", "");
        organizationRepo.save(jsfg);
        Organization omj= new Organization(reemployment, "Ohio Means Jobs", "https://ohiomeansjobs.ohio.gov/", "(888) 296-7541", "Depends on County: https://ohiomeansjobs.ohio.gov/wps/portal/gov/omj/job-seekers/find-a-job/local-help/local-help", "Depends on County: https://ohiomeansjobs.ohio.gov/wps/portal/gov/omj/job-seekers/find-a-job/local-help/local-help", "Services for re-employment. Resume building, workforce development, education opportunities, job fairs.", "Contact your county office and get assigned to a counselor.");
        organizationRepo.save(omj);
        Organization jth= new Organization(reemployment, "Journey To Hope", "", "", "", "", "", "");
        organizationRepo.save(jth);
        Organization lhh= new Organization(reemployment, "Lee Hecht Harrison", "", "", "", "", "", "");
        organizationRepo.save(lhh);
        Organization nkyag= new Organization(reemployment, "Northern Kentucky Accountability Group", "", "", "", "", "", "");
        organizationRepo.save(nkyag);
        Organization jb= new Organization(reemployment, "Job Boards", "", "", "", "", "", "");
        organizationRepo.save(jb);
        Organization ccc= new Organization(reemployment, "College Career Center", "", "", "", "", "", "");
        organizationRepo.save(ccc);

        CategoryGrouping food = new CategoryGrouping("Food");
        categoryGroupingStorage.saveCategory(food);
        Organization wic= new Organization(food, "WIC", "", "", "", "", "", "");
        organizationRepo.save(wic);
        Organization snap= new Organization(food, "SNAP", "", "", "", "", "", "");
        organizationRepo.save(snap);
        Organization foodpantries= new Organization(food, "Food Pantries", "", "", "", "", "", "");
        organizationRepo.save(foodpantries);

        CategoryGrouping moneyresources = new CategoryGrouping("Money Resources");
        categoryGroupingStorage.saveCategory(moneyresources);
        Organization uw= new Organization(moneyresources, "United Way", "", "", "", "", "", "");
        organizationRepo.save(uw);
        Organization urbanleague= new Organization(moneyresources, "Urban League", "", "", "", "", "", "");
        organizationRepo.save(urbanleague);
        Organization impact= new Organization(moneyresources, "Impact", "", "", "", "", "", "");
        organizationRepo.save(impact);
        Organization cota= new Organization(moneyresources, "Central Ohio Transit Authority", "", "", "", "", "", "");
        organizationRepo.save(cota);

        CategoryGrouping otherResources = new CategoryGrouping("Other Resources");
        categoryGroupingStorage.saveCategory(otherResources);
        Organization csc= new Organization(otherResources, "Can't Stop Columbus", "", "", "", "", "", "");
        organizationRepo.save(csc);
        Organization wfco= new Organization(otherResources, "Women's Fund of Central Ohio", "", "", "", "", "", "");
        organizationRepo.save(wfco);
        Organization severance= new Organization(otherResources, "Severance", "", "", "", "", "", "");
        organizationRepo.save(severance);
        Organization cf= new Organization(otherResources, "The Columbus Foundation", "", "", "", "", "", "");
        organizationRepo.save(cf);


        CategoryGrouping housing = new CategoryGrouping("Housing");
        categoryGroupingStorage.saveCategory(housing);
        Organization cmha= new Organization(housing, "Columbus Metropolitan Housing Association", "", "", "", "", "", "");
        organizationRepo.save(cmha);
        Organization hud= new Organization(housing, "Housing Urban Development", "", "", "", "", "", "");
        organizationRepo.save(hud);

        CategoryGrouping educationOrTraining = new CategoryGrouping("Education Or Training");
        categoryGroupingStorage.saveCategory(educationOrTraining);
        Organization filler4= new Organization(educationOrTraining, "Ohio Department of Job and Family Services", "", "", "", "", "", "");
        organizationRepo.save(filler4);
        Organization filler4= new Organization(educationOrTraining, "Ohio Department of Job and Family Services", "", "", "", "", "", "");
        organizationRepo.save(filler4);
        Organization filler4= new Organization(educationOrTraining, "Ohio Department of Job and Family Services", "", "", "", "", "", "");
        organizationRepo.save(filler4);
        Organization filler4= new Organization(educationOrTraining, "Ohio Department of Job and Family Services", "", "", "", "", "", "");
        organizationRepo.save(filler4);
        Organization filler4= new Organization(educationOrTraining, "Ohio Department of Job and Family Services", "", "", "", "", "", "");
        organizationRepo.save(filler4);
        Organization filler4= new Organization(educationOrTraining, "Ohio Department of Job and Family Services", "", "", "", "", "", "");
        organizationRepo.save(filler4);
        Organization filler4= new Organization(educationOrTraining, "Ohio Department of Job and Family Services", "", "", "", "", "", "");
        organizationRepo.save(filler4);


        CategoryGrouping supportGroups = new CategoryGrouping("Support Groups");
        categoryGroupingStorage.saveCategory(supportGroups);
        Organization filler5= new Organization(supportGroups, "Ohio Department of Job and Family Services", "https://unemploymenthelp.ohio.gov/", "(877) 644-6562", "P.O. Box 182212, Columbus, OH 43218-2212", "M-F: 7AM-7PM || SA: 9AM-5PM || SU: 9AM-1PM", "Unemployment Insurance Benefits", "https://jfs.ohio.gov/ouio/ClaimInformationPage.stm");
        organizationRepo.save(filler5);





    }

}
