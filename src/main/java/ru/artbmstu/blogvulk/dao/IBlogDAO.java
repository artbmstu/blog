package ru.artbmstu.blogvulk.dao;

import ru.artbmstu.blogvulk.PublicationEntity.BlogEntity;

import java.util.List;

public interface IBlogDAO {

    List<BlogEntity> getAllPublications();
    void addPublication(BlogEntity publication);
}
