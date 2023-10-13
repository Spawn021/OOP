package com.crawler.link;

public interface Link {
    final String baseFilePath = "E:\\Dowloads\\history-master (13)\\history-master\\src\\main\\resources\\";
    void writeToFile(String fileName);
    void crawl(String url);
}
