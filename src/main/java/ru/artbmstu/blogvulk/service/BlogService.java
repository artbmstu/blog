package ru.artbmstu.blogvulk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.artbmstu.blogvulk.PublicationEntity.BlogEntity;
import ru.artbmstu.blogvulk.dao.IBlogDAO;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogDAO blogDAO;
    @Override
    public List<BlogEntity> getAllPublications() {
        return blogDAO.getAllPublications();
    }

    @Override
    public synchronized void addPublication(BlogEntity publication) {
        blogDAO.addPublication(publication);
    }
}
