/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model.bl;

import java.util.List;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.model.entity.Agent;

/**
 *
 * @author Jacob
 */
@Stateless
public class AgentFacade extends AbstractFacade<Agent> implements AgentFacadeLocal {

    @PersistenceContext(unitName = "TextSpectacles4EJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AgentFacade() {
        super(Agent.class);
    }

    @RolesAllowed("tutor")
    @Override
    public List<Agent> findOfGender(String gender) {
        
        String queryStr = "SELECT a FROM Agent a WHERE a.gender = ?1";
        
        Query query = em.createQuery(queryStr);
        query.setParameter(1, gender);
        
        List<Agent> agents = query.getResultList();
        
        return agents;
        
    }

    @RolesAllowed("tutor")
    @Override
    public List<Agent> findOfGenderAndMarrital(String marrital, String gender) {
        
        String queryStr = "SELECT a FROM Agent a WHERE a.marrital =?1 AND a.gender = ?2";
        
        Query query = em.createQuery(queryStr);
        query.setParameter(1, marrital);
        query.setParameter(2, gender);
        
        List<Agent> agents = query.getResultList();
        
        return agents;
        
    }

    @RolesAllowed("tutor")
    @Override
    public List<Agent> findBetweenAges(Integer minAge, Integer maxAge) {
        
        String queryStr = "SELECT a FROM Agent a WHERE a.age >= ?1 AND a.age <= ?2";
        
        Query query = em.createQuery(queryStr);
        query.setParameter(1, minAge);
        query.setParameter(2, maxAge);
        
        List<Agent> agents = query.getResultList();
        
        return agents;
        
    }

    @RolesAllowed( "admin" )
    @Override
    public Agent findOldestAgent() {
        
        
        String queryStr = "SELECT a FROM Agent a WHERE a.age = (SELECT MAX(b.age) FROM Agent b)";
        
        Query query = em.createQuery(queryStr);
        
        Agent agent = (Agent)query.getSingleResult();
        
        
        return agent;
    }
    
}
