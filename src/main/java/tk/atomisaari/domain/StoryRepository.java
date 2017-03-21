package tk.atomisaari.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface StoryRepository extends CrudRepository<Story, Long> {

    List<Story> findById(Long Id);
    
}