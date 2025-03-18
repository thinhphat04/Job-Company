package com.thinhphat.companyms.company;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/companies")
public class CompanyController {
    private CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    // Get all companies
    @GetMapping
    public ResponseEntity<List<Company>> findAll(){
        return ResponseEntity.ok(companyService.getAllCompanies());
    }

    // Create a company
     @PostMapping
        public ResponseEntity<String> createCompany(@RequestBody Company company) {
            companyService.createCompany(company);
            return new ResponseEntity<>("Company add Success", HttpStatus.OK);
        }

     // Get a company by id
        @GetMapping("/{id}")
            public ResponseEntity<Company> getCompanyById(@PathVariable Long id) {
                Company company = companyService.getCompanyById(id);
                if (company != null) {
                    return new ResponseEntity<>(company, HttpStatus.OK);
                }
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }

     // Delete a company
        @DeleteMapping("/{id}")
            public ResponseEntity<String> deleteCompany(@PathVariable Long id) {
                boolean deleted = companyService.deleteCompanyById(id);
                if (deleted) {
                    return new ResponseEntity<>("Company deleted success!", HttpStatus.OK);
                } else {
                    return new ResponseEntity<>("Company not found", HttpStatus.NOT_FOUND);
                }
            }

        // Update a company
        @PutMapping("/{id}")
            public ResponseEntity<String> updateCompany(@PathVariable Long id,
                                                        @RequestBody Company updatedCompany) {
                boolean updated = companyService.updateCompany(id, updatedCompany);
                if(updated){
                    return new ResponseEntity<>("Company Updated!", HttpStatus.OK);
                }
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }


}
