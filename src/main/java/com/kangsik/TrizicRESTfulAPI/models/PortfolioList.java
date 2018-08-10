package com.kangsik.TrizicRESTfulAPI.models;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

 

@Document(collection = "Portfolios")
class PortfolioList {

    private int pageNumber;
    private int pageSize;
    private int numberOfPages;
    private int totalNumberOfElements;
    private List<Portfolio> page;

    public PortfolioList(int pageNumber, int pageSize, int numberOfPages, int totalNumberOfElements, List<Portfolio> page) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.numberOfPages = numberOfPages;
        this.totalNumberOfElements = totalNumberOfElements;
        this.page = page;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getTotalNumberOfElements() {
        return totalNumberOfElements;
    }

    public void setTotalNumberOfElements(int totalNumberOfElements) {
        this.totalNumberOfElements = totalNumberOfElements;
    }

    public List<Portfolio> getPage() {
        return page;
    }

    public void setPage(List<Portfolio> page) {
        this.page = page;
    }
}
