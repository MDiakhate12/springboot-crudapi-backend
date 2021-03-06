package sn.diakhate.crudapi.compte;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Integer> {
    
    public Compte findById(int id);

    public List<Compte> findAllComptesByAgenceId(int id);
    public List<Compte> findAllComptesByClientId(int id);

}
