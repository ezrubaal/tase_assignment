# tase_assignment
Project repository for the home assignment: https://github.com/ezrubaal/tase_assignment.git 

## Groovy project:
### New repository pipeline on Jenkins:
* Set up a new pipeline for the repository.
* Triggers -> Poll SCM -> H/5 * * * * (Every 5 minutes, this of course can be changed. I went with the simpler option for this home assignment, of course webhook triggers can be used as well)
* SCM: Git
* Repository URL: https://github.com/ezrubaal/tase_assignment.git
* Credentials: None
* Script path: Groovy/Jenkinsfile
* Branch Specifier: */main (not must, but avoids problems with leaving empty or using ** - again, used for the simplicity of this home assignment)

### Configure Jenkins:

    Manage Jenkins -> System -> Global Trusted Pipeline Libraries: 
    Library: jenkins-library    
    Default version: main
    Project repo: https://github.com/ezrubaal/tase_assignment.git
    library path: Groovy\jenkins-library/

## Ansible:
* Go to the Ansible folder
* Run ansible-playbook -i localhost, -c local playbook.yml
* If you want to see the counter with a browser, simply go to localhost:80
* If you're using CURL, check the counter: curl http://localhost/counter

## Bash
Has its own ReadMe
