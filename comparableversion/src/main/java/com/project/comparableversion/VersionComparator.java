package com.project.comparableversion;

import java.util.Comparator;

import com.project.comparableversion.comparableversion.Software;

public class VersionComparator implements Comparator<Software>{

    @Override
    public int compare(Software software1, Software software2) {
        System.out.println(software1.getVersion().compareTo(software2.getVersion()));
        return software1.getVersion().compareTo(software2.getVersion());
    }
    
    
}
