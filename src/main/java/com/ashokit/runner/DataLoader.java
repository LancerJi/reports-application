package com.ashokit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.ashokit.entity.CitizenPlan;
import com.ashokit.repository.CitizenPlanRepo;

import java.time.LocalDate;

@Component
public class DataLoader implements ApplicationRunner {
	
	@Autowired
	private CitizenPlanRepo citizenPlanRepo;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		CitizenPlan c1 = new CitizenPlan();
		c1.setCitizenName("John");
		c1.setGender("Male");
		c1.setPlanName("Cash");
		c1.setPlanStatus("Approved");
		c1.setPlanStartDate(LocalDate.now());
		c1.setPlanEndDate(LocalDate.now().plusMonths(6));
		c1.setBenefitAmt(5000.00);

		CitizenPlan c2 = new CitizenPlan();
		c2.setCitizenName("Smith");
		c2.setGender("Male");
		c2.setPlanName("Cash");
		c2.setPlanStatus("Denied");
		c2.setPlanStartDate(LocalDate.now());
		c2.setPlanEndDate(LocalDate.now().plusMonths(6));
		c2.setBenefitAmt(5000.00);
		c2.setDenialReason("Rental Income");

		CitizenPlan c3 = new CitizenPlan();
		c3.setCitizenName("Camila");
		c3.setGender("Female");
		c3.setPlanName("Cash");
		c3.setPlanStatus("Denied");
		c3.setPlanStartDate(LocalDate.now());
		c3.setPlanEndDate(LocalDate.now().minusMonths(6));
		c3.setBenefitAmt(5000.00);
		c3.setTerminatedDate(LocalDate.now());
		c3.setTerminationReason("Employed");
		}
}
