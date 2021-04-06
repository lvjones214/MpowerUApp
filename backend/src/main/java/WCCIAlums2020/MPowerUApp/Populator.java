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
        Organization cobra= new Organization(healthcare, "Consolidated Omnibus Budget Reconciliation Act", "https://www.dol.gov/general/topic/health-plans/cobra", "(866) 444-3272", "Department of Labor's Employee Benefits Security Administration at askebsa.dol.gov", "N/A", "Healthcare benefit provisions require group health plans to provide a temporary continuation of group health coverage", "If you are entitled to elect COBRA coverage, you must be given an election period of at least 60 days.");
        organizationRepo.save(cobra);
        Organization medicaid= new Organization(healthcare, "Medicaid", "https://medicaid.ohio.gov/", "Provider Hotline: 1-800-686-1516 || Consumer Hotline: 1-800-324-8680", "Online: https://jfs.ohio.gov/County/County_Directory.pdf", "24/7", "Ohio Department of Medicaid (ODM) working closely with stakeholders, advocates, medical professionals, and fellow state agencies, finds new ways to modernize Medicaid in Ohio", "https://ssp.benefits.ohio.gov/apspssp/indexOHLanding.jsp");
        organizationRepo.save(medicaid);
        Organization hmp= new Organization(healthcare, "Healthcare Marketplace", "https://www.healthcare.gov/", "1-800-318-2596", "7500 Security Boulevard, Baltimore, MD 21244", "24/7", "A federal government website managed and paid for by the U.S. Centers for Medicare & Medicaid Services.", "Enter the following URL into your search browser: HealthCare.gov.  Launch the Health Insurance Marketplace home page.   \n");
        organizationRepo.save(hmp);
        Organization rma= new Organization(healthcare, "RMA/Retirement Funds", "", "", "", "", "", "");
        organizationRepo.save(rma);

        CategoryGrouping childcare = new CategoryGrouping("Childcare");
        categoryGroupingStorage.saveCategory(childcare);
        Organization publiclyfundedchildcare= new Organization(childcare, "Publicly Funded Child Care", "https://ohio.gov/wps/portal/gov/site/residents/resources/child-care-assistance", "(614) 466-1213", "Depends on County: https://jfs.ohio.gov/County/County_Directory.pdf", "", "", "");
        organizationRepo.save(publiclyfundedchildcare);

        CategoryGrouping reemployment = new CategoryGrouping("Re-employment");
        categoryGroupingStorage.saveCategory(reemployment);
        Organization jfs= new Organization(reemployment, "Jewish Family Services", "https://www.jfscolumbus.org/", "(614) 231-1890", "1070 College Ave Ste A, Columbus, OH 43209", "Monday - Friday 9am-5pm", "We guide. We counsel. We mentor. We teach. We strengthen relationships. We prepare people for jobs.", "Access JFS resources by:\n 1. Jewish Family Services (JFS) website\n 2. Email\n 3. Phone");
        organizationRepo.save(jfs);
        Organization jsfg= new Organization(reemployment, "Job Search Focus Group", "https://jsfg.com/", "(513) 979-8167", "1345 Grace Ave, Cincinnati, OH 45208 ", "Monday Noon-3pm\n Tuesday - Friday 9am-3pm", "Job Search Focus Group is an all-volunteer outreach for professionals in career transition. JSFG members successfully navigate their career transition and job search", "First-time visitors interested in membership are asked to contact Nan Stricker at 513-575-2005 to learn about the benefits of JSFG and how to get started");
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
        Organization filler5= new Organization(educationOrTraining, "Ohio Department of Job and Family Services", "", "", "", "", "", "");
        organizationRepo.save(filler5);
        Organization filler6= new Organization(educationOrTraining, "Ohio Department of Job and Family Services", "", "", "", "", "", "");
        organizationRepo.save(filler6);
        Organization filler7= new Organization(educationOrTraining, "Ohio Department of Job and Family Services", "", "", "", "", "", "");
        organizationRepo.save(filler7);
        Organization filler8= new Organization(educationOrTraining, "Ohio Department of Job and Family Services", "", "", "", "", "", "");
        organizationRepo.save(filler8);
        Organization filler9= new Organization(educationOrTraining, "Ohio Department of Job and Family Services", "", "", "", "", "", "");
        organizationRepo.save(filler9);
        Organization filler10= new Organization(educationOrTraining, "Ohio Department of Job and Family Services", "", "", "", "", "", "");
        organizationRepo.save(filler10);


        CategoryGrouping supportGroups = new CategoryGrouping("Support Groups");
        categoryGroupingStorage.saveCategory(supportGroups);
        Organization filler11= new Organization(supportGroups, "Ohio Department of Job and Family Services", "https://unemploymenthelp.ohio.gov/", "(877) 644-6562", "P.O. Box 182212, Columbus, OH 43218-2212", "M-F: 7AM-7PM || SA: 9AM-5PM || SU: 9AM-1PM", "Unemployment Insurance Benefits", "https://jfs.ohio.gov/ouio/ClaimInformationPage.stm");
        organizationRepo.save(filler11);





    }

}
