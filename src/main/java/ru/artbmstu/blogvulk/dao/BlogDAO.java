package ru.artbmstu.blogvulk.dao;

import org.springframework.stereotype.Repository;
import ru.artbmstu.blogvulk.PublicationEntity.BlogEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class BlogDAO implements IBlogDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    @Override
    public List<BlogEntity> getAllPublications() {
        String hql = "from BlogEntity as be ORDER BY be.id";
        return (List<BlogEntity>) entityManager.createQuery(hql).getResultList();
    }

    @Override
    public void addPublication(BlogEntity publication) {
        entityManager.persist(publication);
    }
}
