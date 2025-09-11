package com.ashokit.Service;

import com.ashokit.entity.CitizenPlan;
import com.ashokit.request.SearchRequest;

import java.util.List;


public interface ReportService {
    public List<String> getPlanNames();

    public List<String> getPlanStatus();

    public List<CitizenPlan> search(SearchRequest request);

    public Boolean exportExcel();

    public Boolean exportPdf();

}
