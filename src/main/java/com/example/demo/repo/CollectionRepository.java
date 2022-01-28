package com.example.demo.repo;

import com.example.demo.models.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface CollectionRepository extends JpaRepository<Collection,Long> {


    //public void DeleteCollection(int collectionID)=> dBContent.Collection.Remove(dBContent.Collection.FirstOrDefault(c => c.ID == collectionID));

    @Query ("SELECT c FROM Collection c where c.user.id=:userId")
    Set<Collection> CollectionsByUserID(@Param("userId") Long userId);

    @Query("SELECT c FROM Collection c where c.id=:id")
    Collection CollectByID(@Param("id") Long id);
}
