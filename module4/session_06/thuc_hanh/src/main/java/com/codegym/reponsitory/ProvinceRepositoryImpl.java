package com.codegym.reponsitory;

import com.codegym.model.Customer;
import com.codegym.model.Province;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Repository
public class ProvinceRepositoryImpl implements ProvinceRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Province> findAll() {
        TypedQuery<Province> query = em.createQuery("select c from Province c", Province.class);
        return query.getResultList();
    }

    @Override
    public Province findById(Long id) {
        TypedQuery<Province> query = em.createQuery("select c from Province c where  c.id=:id", Province.class);
        query.setParameter("id", id);
        try {
            return query.getSingleResult();
        }catch (NoResultException e){
            return null;
        }
    }

    @Override
    public void save(Province model) {
        if(model.getId() != null){
            em.merge(model);
        } else {
            em.persist(model);
        }
    }

    @Override
    public void remove(Long id) {
        Province province = findById(id);
        if(province != null){
            em.remove(province);
        }
    }
}
