package com.tick42.quicksilver.models.DTOs;

import java.util.List;

public class PageDTO<T> {
    private int currentPage;
    private int totalPages;
    private Long totalResults;
    private List<T> extensions;

    public PageDTO() {

    }

    public PageDTO(List<T> extensions, int currentPage, int totalPages, Long totalResults) {
        this.currentPage = currentPage;
        this.totalResults = totalResults;
        this.extensions = extensions;
        this.totalPages = totalPages;
    }
    public PageDTO(PageDTO pageDTO) {
        this.currentPage = pageDTO.getCurrentPage();
        this.totalResults = pageDTO.getTotalResults();
        this.totalPages = pageDTO.getTotalPages();
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public Long getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public List<T> getExtensions() {
        return extensions;
    }

    public void setExtensions(List<T> extensions) {
        this.extensions = extensions;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}
