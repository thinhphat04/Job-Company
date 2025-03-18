package com.thinhphat.jobms.job.clients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.thinhphat.jobms.job.external.Company;
@FeignClient(name = "COMPANYMS", url = "${companyms.url}")
public interface CompanyClient {
    @GetMapping("/companies/{id}")
    Company getCompany(@PathVariable("id") Long id);
}
