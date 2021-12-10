# Backend Final Project CISC 3141

## Team Members and Roles
List team members, contact/github info, and high level roles:

#### Team Members
* Alexander Petrovski, Github: AlexanPetrov, back-end
* Anastasia Gusenkov, GitHub : a-gusenkov, front-end
* Ariel Benzur, GitHub: ArielBenz171, float
* Eli Sultanov, Github: elisvcodes, manager
* Elvin Guliyev, Github: elvin9901 , front-end
* Jason Moreau, Github: JMCSci, back-end
* Michael Caridad , Github: Mike809 , back-end

#### GitHub Links
Frontend: https://github.com/a-gusenkov/front-end-final-project-CISC3141 <br />
Backend: https://github.com/AlexanPetrov/back-end-final-project-CISC3141


## Overview
#### What are you building? 
https://www.zoho.com/bugtracker/

#### Describe the bug tracker….
When a developer or a development team works on a project there are many instances when keeping track of bugs becomes difficult. A bug tracker will allow users to input information about the bugs found in their code allowing the user to track what needs to be done and keep a documentation of the process. The bug tracker will allow the user to create a bug tracker along with a description of what the bug is and update the bug tracker(whether that be changing the notes within the tracker or closing the tracker when the bug is fixed).

#### Who would use it?
Devs….

#### Goals
What do you plan to accomplish? Be as specific as possible with project features.

- Ability to register
- Create bugs
- Assign bugs
- Resolve bugs
- Non-Goals
- List out things that you agreed won’t be goals this semester. You can’t solve every problem

#### Templates
What the product needs: Category: Information Technology/ Organization

#### Technical Architecture
* Stack Frontend: JS, React, Redux, MUI(Material UI), React-Router-DOM, Axios 
* Backend: Java, SpringBoot, MySQL

#### List of Pages
- Homepage
- Login page
- Register page
- Dashboard
- Create bug
- Update Bug
- Mockups of each page //Will be done Nov 7th

#### API Routes
/login <br />
/register <br />
/create-bug <br />
/delete-bug <br />
/update-bug <br />
/get-bugs <br />
/get-bug <br />
/logout

#### Database Models
List database models/tables and associations you need.

User Model: name, email, password, role, organization, bugs assigned(array of ids)  <br />
Bug Model: Title, Description, Due date, assigned to, created by, @oneToMany

#### 3rd Party API’s
List any 3rd party api integrations. Where will this be added (page or api route) and how will they be used

Google Auth?

## Milestones
Demo Night is December 14, what do you plan to accomplish at specific milestones? (adjust dates so it works for your team)  <br />
Milestone 1: Oct 31st (Meet and create a project outline)  <br />
Milestone 2 : Nov 7th

## Open Questions
List any questions and decision points that the team was not able to answer. Maybe list the hardest part of the application.

Research and track possible solutions for a later decision.





