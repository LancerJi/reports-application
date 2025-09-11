package com.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ashokit.entity.CitizenPlan;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CitizenPlanRepo extends JpaRepository<CitizenPlan, Integer> {

    @Query("SELECT DISTINCT c.planName FROM CitizenPlan c")
    public List<String> getPlanNames();

    @Query("SELECT DISTINCT c.planStatus FROM CitizenPlan c")
    public List<String> getStatus();
}