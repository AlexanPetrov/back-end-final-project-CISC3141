package com.server.bugtracker.Bug;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Scope("session")
@Repository
@Transactional(readOnly = false)    // If necessary, can delete database entries
public interface BugRepo extends CrudRepository<Bug, Long>, JpaRepository<Bug, Long>
{

    /**
     * Gets all of the users from the Bug table
     * @return JSON array of bugs
     */
    @Query(value = "SELECT * FROM bug", nativeQuery = true)
    public List<Bug> getBugs();

    @Query(value = "SELECT b.id , b.title, b.bug_description, b.due_date, b.assigned_to, b.created_by, b.severity, b.bug_status FROM bug AS b WHERE b.id = ?1" , nativeQuery = true)
    public Bug getBug( @Param ("id") long id);

    @Query(value = "DELETE b.id, b.title, b.bug_description, b.due_date, b.assigned_to, b.created_by, b.severity, b.bug_status FROM bug AS b WHERE b.id = ?1" , nativeQuery = true)
    public Bug deleteBug( @Param("b.id") long id );
}