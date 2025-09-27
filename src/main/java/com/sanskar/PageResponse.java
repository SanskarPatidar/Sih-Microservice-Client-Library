package com.sanskar;

import java.util.List;

// use this individually as sharing this class is hassle
public class PageResponse<T> {
        List<T> content;
        int page;
        int size;
        int totalPages;
        boolean last;

//        public PageResponse(Page<T> incomingPage) {
//            this.content = incomingPage.getContent();
//            this.page = incomingPage.getNumber();
//            this.size = incomingPage.getSize();
//            this.totalPages = incomingPage.getTotalPages();
//            this.last = incomingPage.isLast();
//        }

}