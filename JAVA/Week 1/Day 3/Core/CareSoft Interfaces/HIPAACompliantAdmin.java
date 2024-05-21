package com.caresoft.clinicapp;

import java.util.ArrayList;

public interface HIPAACompliantAdmin {
	abstract ArrayList<String> reportSecurityIncidents();
    
    // METHODS
    public default void printSecurityIncidents() {
        System.out.println(reportSecurityIncidents());
    }
    
    //  PASS/FAIL | Q/A
    public default boolean adminQATest(ArrayList<String> expectedIncidents) {
        if (reportSecurityIncidents().equals(expectedIncidents)) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }
        return reportSecurityIncidents().equals(expectedIncidents);
    }
}
