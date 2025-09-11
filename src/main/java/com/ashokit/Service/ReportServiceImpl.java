package com.ashokit.Service;

import com.ashokit.entity.CitizenPlan;
import com.ashokit.repository.CitizenPlanRepo;
import com.ashokit.request.SearchRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    private CitizenPlanRepo citizenPlanRepo;

    @Override
    public List<String> getPlanNames() {
        return List.of();
    }

    @Override
    public List<String> getPlanStatus() {
        return List.of();
    }

    @Override
    public List<CitizenPlan> search(SearchRequest request) {
        return List.of();
    }

    @Override
    public Boolean exportExcel() {
        return null;
    }

    @Override
    public Boolean exportPdf() {
        return null;
    }
}
