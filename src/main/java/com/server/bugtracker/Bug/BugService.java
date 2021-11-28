package com.server.bugtracker.Bug;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Scope("session")
@Service
public class BugService
{

    @Autowired
    BugRepo bugRepo;

    /**
     * Gets all bugs in Bug table
     * @return JSON array of bugs
     */
    public List<Bug> getBugs()
    {
        return bugRepo.getBugs();
    }

    public Bug getBug( String id )
    {
        return bugRepo.getBug( Long.parseLong( id ) );
    }

    public Bug deleteBug(long id) { return bugRepo.deleteBug(id); }

    /**
     * Adds bug to Bug table
     * @param bug
     */
    public void createBug(Bug bug)
    {
        bugRepo.save(bug);
    }
}
