package com.server.bugtracker.Bug;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Scope("session")
@RestController
public class BugController
{

    @Autowired
    BugService bugService;
    @Autowired
    BugRepo bugRepo;

    /**
     * Gets all bugs in database
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "/get-bugs")
    public List<Bug> getBugs()
    {
        return bugService.getBugs();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/get-bug")
    public Bug getBug(@RequestBody String id)
    {
        return  bugService.getBug( id );
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/delete-bug")
    public void deleteBug(@RequestBody long id) { bugService.deleteBug( id ); }

    /**
     * Creates a bug request
     * POST request must be JSON format
     * @param bug
     */
    @RequestMapping(method = RequestMethod.POST, value = "/create-bug")
    public void createBug(@RequestBody Bug bug)
    {
        bugService.createBug(bug);
    }
}
