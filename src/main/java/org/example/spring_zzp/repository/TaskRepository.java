package org.example.spring_zzp.repository;

import org.example.spring_zzp.model.Status;
import org.example.spring_zzp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {

    @Query("SELECT t FROM tasks t WHERE t.owner.id = :userId")
    List<Task> getUsersTasks(Long userId);
}
