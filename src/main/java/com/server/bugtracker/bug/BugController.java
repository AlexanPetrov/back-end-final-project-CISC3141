package com.server.bugtracker.bug;

import com.server.bugtracker.user.UserRepo;
import com.server.bugtracker.user.UserService;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Scope("session")
@RestController
public class BugController
{

    final BugService bugService;
    final BugRepo bugRepo;
    final UserRepo userRepo;
    final UserService userService;

    /**
     * Constructor injection
     * @param bugService
     * @param bugRepo
     * @param userRepo
     * @param userService
     */
    public BugController(BugService bugService, BugRepo bugRepo, UserRepo userRepo, UserService userService)
    {
        this.bugService = bugService;
        this.bugRepo = bugRepo;
        this.userRepo = userRepo;
        this.userService = userService;
    }

    /**
     * Gets all bugs in database
     * @return JSON array of bug entries
     */
    @RequestMapping(method = RequestMethod.GET, value = "/get-bugs")
    public List<Bug> getBugs()
    {
        return bugService.getBugs();
    }

    /**
     * Creates a new bug entry in database
     * @param bug
     * @return 201 status code (Created) if successful
     * @return 422 status code (Unprocessable Entity) if missing required data fields
     */
    @RequestMapping(method = RequestMethod.POST, value = "/create-bug")
    public ResponseEntity<String> createBug(@RequestBody Bug bug)
    {
        return bugService.createBug(bug);
    }

    /**
     * Updates a bug
     * @param bug
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/update-bug")
    public void updateBug(@RequestBody Bug bug)
    {
        // Backend send a list of all the bugs to the frontend -> as JSON
        // Frontend is going to parse it and populate the dashboard/table
        // When a user clicks "Edit" button, frontend is going to send data (JSON)
        // Send it as a Bug/JSON; current id saved in the JSON to be sent
        // Frontend will have to send who the bug is assigned to and created by
        // Due date comes from frontend

        bugService.updateBug(bug);
    }

    /**
     * Retrieves a single bug
     * @param bug
     * @return Bug database entry (JSON)
     */
    @RequestMapping(method = RequestMethod.POST, value = "/get-bug")
    public Bug getBug(@RequestBody Bug bug)
    {
        return  bugService.getBug( bug.getId() );
    }

        /**
     * Retrieves bugs
     * @param bug
     * @return Bug database entry (JSON)
     */
    @RequestMapping(method = RequestMethod.POST, value = "/search-bug")
    public Bug getBug(@RequestBody Bug bug)
    {
        return  bugService.getBug(bug.getTitle());
    }

    /**
     * Deletes a bug
     * @param bug
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/delete-bug")
    public void deleteBug(@RequestBody Bug bug)
    {
        bugService.deleteBug( bug );
    }

}
