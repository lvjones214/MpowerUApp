package WCCIAlums2020.MPowerUApp.controllers;

import WCCIAlums2020.MPowerUApp.resources.Organization;
import WCCIAlums2020.MPowerUApp.storage.CategoryGroupingStorage;
import WCCIAlums2020.MPowerUApp.storage.OrganizationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class OrganizationController {
    private OrganizationRepository organizationRepo;
    private CategoryGroupingStorage categoryGroupingStorage;

    public OrganizationController(OrganizationRepository organizationRepo, CategoryGroupingStorage categoryGroupingStorage) {
        this.organizationRepo = organizationRepo;
        this.categoryGroupingStorage = categoryGroupingStorage;
    }

    @GetMapping("/api/allOrganizations")
    public Iterable<Organization> retrieveAllOrganizations(){
        return organizationRepo.findAll();
    }

    @GetMapping("/api/organization/{id}")
    public Optional<Organization> retrieveOrganizationById(@PathVariable Long id){
        return organizationRepo.findById(id);
    }


}
