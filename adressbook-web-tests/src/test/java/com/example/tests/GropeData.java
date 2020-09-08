package com.example.tests;

public class GropeData {
    private final String name;
    private final String headerName;
    private final String footerName;

    public GropeData(String name, String headerName, String footerName) {
        this.name = name;
        this.headerName = headerName;
        this.footerName = footerName;
    }

    public String getName() {
        return name;
    }

    public String getHeaderName() {
        return headerName;
    }

    public String getFooterName() {
        return footerName;
    }
}
