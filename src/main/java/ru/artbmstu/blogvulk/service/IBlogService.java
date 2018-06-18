package ru.artbmstu.blogvulk.service;

import ru.artbmstu.blogvulk.PublicationEntity.BlogEntity;

import java.util.List;

public interface IBlogService {
    List<BlogEntity> getAllPublications();
    void addPublication(BlogEntity publication);
}
