package WCCIAlums2020.MPowerUApp;

import WCCIAlums2020.MPowerUApp.resources.CategoryGrouping;
import WCCIAlums2020.MPowerUApp.resources.Organization;
import WCCIAlums2020.MPowerUApp.storage.CategoryGroupingRepository;
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

        CategoryGrouping childcare = new CategoryGrouping("Childcare");
        categoryGroupingStorage.saveCategory(childcare);
        Organization filler1= new Organization(childcare, "Ohio Department of Job and Family Services", "https://unemploymenthelp.ohio.gov/", "(877) 644-6562", "P.O. Box 182212, Columbus, OH 43218-2212", "M-F: 7AM-7PM || SA: 9AM-5PM || SU: 9AM-1PM", "Unemployment Insurance Benefits", "https://jfs.ohio.gov/ouio/ClaimInformationPage.stm");
        organizationRepo.save(filler1);

        CategoryGrouping reemployment = new CategoryGrouping("Re-employment");
        categoryGroupingStorage.saveCategory(reemployment);
        Organization ohioMeansJobs= new Organization(reemployment, "Ohio Means Jobs", "https://ohiomeansjobs.ohio.gov/", "(888) 296-7541", "Depends on County: https://ohiomeansjobs.ohio.gov/wps/portal/gov/omj/job-seekers/find-a-job/local-help/local-help", "Depends on County: https://ohiomeansjobs.ohio.gov/wps/portal/gov/omj/job-seekers/find-a-job/local-help/local-help", "Services for re-employment. Resume building, workforce development, education opportunities, job fairs.", "Contact your county office and get assigned to a counselor.");
        organizationRepo.save(ohioMeansJobs);

        CategoryGrouping food = new CategoryGrouping("Food");
        categoryGroupingStorage.saveCategory(food);
        Organization filler2= new Organization(food, "Ohio Department of Job and Family Services", "https://unemploymenthelp.ohio.gov/", "(877) 644-6562", "P.O. Box 182212, Columbus, OH 43218-2212", "M-F: 7AM-7PM || SA: 9AM-5PM || SU: 9AM-1PM", "Unemployment Insurance Benefits", "https://jfs.ohio.gov/ouio/ClaimInformationPage.stm");
        organizationRepo.save(filler2);

        CategoryGrouping housing = new CategoryGrouping("Housing");
        categoryGroupingStorage.saveCategory(housing);
        Organization filler3= new Organization(housing, "Ohio Department of Job and Family Services", "https://unemploymenthelp.ohio.gov/", "(877) 644-6562", "P.O. Box 182212, Columbus, OH 43218-2212", "M-F: 7AM-7PM || SA: 9AM-5PM || SU: 9AM-1PM", "Unemployment Insurance Benefits", "https://jfs.ohio.gov/ouio/ClaimInformationPage.stm");
        organizationRepo.save(filler3);

        CategoryGrouping educationOrTraining = new CategoryGrouping("Education Or Training");
        categoryGroupingStorage.saveCategory(educationOrTraining);
        Organization filler4= new Organization(educationOrTraining, "Ohio Department of Job and Family Services", "https://unemploymenthelp.ohio.gov/", "(877) 644-6562", "P.O. Box 182212, Columbus, OH 43218-2212", "M-F: 7AM-7PM || SA: 9AM-5PM || SU: 9AM-1PM", "Unemployment Insurance Benefits", "https://jfs.ohio.gov/ouio/ClaimInformationPage.stm");
        organizationRepo.save(filler4);

        CategoryGrouping supportGroups = new CategoryGrouping("Support Groups");
        categoryGroupingStorage.saveCategory(supportGroups);
        Organization filler5= new Organization(supportGroups, "Ohio Department of Job and Family Services", "https://unemploymenthelp.ohio.gov/", "(877) 644-6562", "P.O. Box 182212, Columbus, OH 43218-2212", "M-F: 7AM-7PM || SA: 9AM-5PM || SU: 9AM-1PM", "Unemployment Insurance Benefits", "https://jfs.ohio.gov/ouio/ClaimInformationPage.stm");
        organizationRepo.save(filler5);

        CategoryGrouping moneyresources = new CategoryGrouping("Money Resources");
        categoryGroupingStorage.saveCategory(moneyresources);
        Organization filler6= new Organization(moneyresources, "Ohio Department of Job and Family Services", "https://unemploymenthelp.ohio.gov/", "(877) 644-6562", "P.O. Box 182212, Columbus, OH 43218-2212", "M-F: 7AM-7PM || SA: 9AM-5PM || SU: 9AM-1PM", "Unemployment Insurance Benefits", "https://jfs.ohio.gov/ouio/ClaimInformationPage.stm");
        organizationRepo.save(filler6);

        CategoryGrouping otherResources = new CategoryGrouping("Other Resources");
        categoryGroupingStorage.saveCategory(otherResources);
        Organization filler7= new Organization(otherResources, "Ohio Department of Job and Family Services", "https://unemploymenthelp.ohio.gov/", "(877) 644-6562", "P.O. Box 182212, Columbus, OH 43218-2212", "M-F: 7AM-7PM || SA: 9AM-5PM || SU: 9AM-1PM", "Unemployment Insurance Benefits", "https://jfs.ohio.gov/ouio/ClaimInformationPage.stm");
        organizationRepo.save(filler7);

    }

}
