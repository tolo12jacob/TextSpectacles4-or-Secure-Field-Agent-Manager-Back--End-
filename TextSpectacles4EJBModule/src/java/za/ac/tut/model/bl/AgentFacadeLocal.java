/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.tut.model.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.model.entity.Agent;

/**
 *
 * @author Jacob
 */
@Local
public interface AgentFacadeLocal {

    void create(Agent agent);

    void edit(Agent agent);

    void remove(Agent agent);

    Agent find(Object id);

    List<Agent> findAll();

    List<Agent> findRange(int[] range);

    int count();
    
    List<Agent> findOfGender(String gender);
    
    List<Agent> findOfGenderAndMarrital(String marrital,String gender);
    
    List<Agent> findBetweenAges(Integer minAge, Integer maxAge);
    
    Agent findOldestAgent();
    
}
