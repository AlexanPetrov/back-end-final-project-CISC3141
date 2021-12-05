package com.server.bugtracker.Bug;

import org.springframework.context.annotation.Scope;

import javax.persistence.*;

@Scope("session")
@Entity
@Table(name = "Bug")
public class Bug {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bug_seq")
    @SequenceGenerator(name = "bug_seq", sequenceName = "bug_seq", initialValue = 1, allocationSize = 1)
    @Column(name = "id")
    private long id;
    @Column(name = "title")
    private String title;
    @Column(name = "bug_description")
    private String bug_description;
    @Column(name = "due_date")
    private String due_date;
    @Column(name = "assigned_to")
    private long assigned_to;
    @Column(name = "created_by")
    private long created_by;
    @Column(name = "severity")
    private String severity;
    @Column(name = "bug_status")
    private String bug_status;

    /**
     * No-arg constructor
     */
    public Bug() {
    }

    @Override
    public String toString() {
        return "[" + "id: " + id + ", " + "title: " + title + ", " + "bug_description: " + bug_description + ", " + "due_date: " + due_date +
                ", " + "assigned_to: " + assigned_to + ", " + "created_by: " + created_by + ", " +
                "severity: " + severity + ", " + "bug_status: " + bug_status + "]";
    }

    /**
     * Constructor
     *
     * @param id
     * @param title
     * @param due_date
     * @param assigned_to
     * @param created_by
     * @param severity
     * @param bug_status
     */
    Bug(long id, String title, String bug_description, String due_date, long assigned_to, long created_by,
        String severity, String bug_status) {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBug_description() {
        return bug_description;
    }

    public void setBug_description(String bug_description) {
        this.bug_description = bug_description;
    }

    public String getDue_date() {
        return due_date;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

    public long getAssigned_to() {
        return assigned_to;
    }

    public void setAssigned_to(long assigned_to) {
        this.assigned_to = assigned_to;
    }

    public long getCreated_by() {
        return created_by;
    }

    public void setCreated_by(long created_by) {
        this.created_by = created_by;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getBug_status() {
        return bug_status;
    }

    public void setBug_status(String bug_status) {
        this.bug_status = bug_status;
    }
}
