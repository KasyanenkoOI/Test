package com.example.tests;

public class GropData {
    private final String name;
    private final String headerName;
    private final String footerName;

    public GropData(String name, String headerName, String footerName) {
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
