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

    public List<Bug> getBug(long assigned_to) { return bugRepo.getBug(assigned_to); }

    /**
     * Adds bug to Bug table
     * @param bug
     */
    public void createBug(Bug bug)
    {
        bugRepo.save(bug);
    }
}
