package com.server.bugtracker.Bug;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
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

    /**
     * Update a bug
     * @param id
     * @param title
     * @param bug_description
     * @param due_date
     * @param assigned_to
     * @param created_by
     * @param severity
     * @param bug_status
     */
    @Modifying
    @Query(value = "UPDATE bug AS b SET b.id = ?1, b.title = ?2, b.bug_description = ?3,  b.due_date = ?4, " +
            "b.assigned_to = ?5, b.created_by = ?6, b.severity = ?7, b.bug_status = ?8 WHERE b.id = ?1", nativeQuery = true)
    public void updateBug( @Param("id") long id, @Param("title") String title, @Param("bug_description") String bug_description,
                           @Param("due_date") String due_date, @Param("assigned_to") long assigned_to,
                           @Param("created_by") long created_by, @Param("severity") String severity, @Param("bug_status") String bug_status);

}
