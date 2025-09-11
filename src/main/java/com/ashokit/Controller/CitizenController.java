package com.ashokit.Controller;

import com.ashokit.Service.ReportService;
import com.ashokit.request.SearchRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CitizenController {

    @Autowired
    private ReportService reportService;

    @GetMapping("/")
    public String indexPage(Model model){

        SearchRequest searchRequest= new SearchRequest();
        model.addAttribute("search", searchRequest);

        return "index";
    }
}
