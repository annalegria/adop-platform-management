// Constants
def gerritBaseUrl = "ssh://jenkins@gerrit:29418"
def cartridgeBaseUrl = gerritBaseUrl + "/cartridges"
def platformToolsGitUrl = gerritBaseUrl + "/platform-management"

// Folders
def workspaceFolderName = "${WORKSPACE_NAME}"

def projectFolderName = workspaceFolderName + "/${PROJECT_NAME}"
def projectFolder = folder(projectFolderName)

// MAINFOLDER After Project Folder

def TalentMainFolderName = projectFolderName + "/HCM-TALENT"
def TalentMainFolder = folder(TalentMainFolderName) { displayName('Oracle HCM Talent') }

def CoreMainFolderName = projectFolderName + "/HCM-CORE"
def CoreMainFolder = folder(CoreMainFolderName) { displayName('Oracle HCM Core') }

def TaleoMainFolderName = projectFolderName + "/TALEO"
def TaleoMainFolder = folder(TaleoMainFolderName) { displayName('Oracle Taleo') }


// SUBFOLDER of Talent

def talentsubFolderName = TalentMainFolderName + "/HCM_Talent_Per_Set"
def talentsubFolder = folder(talentsubFolderName) { displayName('Oracle HCM Talent(Per Set)') }

// Per Set Talent

def talentset1FolderName = talentsubFolderName + "/Set_1"
def talentset1Folder = folder(talentset1FolderName) { displayName('Set 1 and 2') }

def talentset3FolderName = talentsubFolderName + "/Set_3"
def talentset3Folder = folder(talentset3FolderName) { displayName('Set 3 and 4') }

def talentset5FolderName = talentsubFolderName + "/Set_5"
def talentset5Folder = folder(talentset5FolderName) { displayName('Set 5 and 6')}

def talentset7FolderName = talentsubFolderName + "/Set_7"
def talentset7Folder = folder(talentset7FolderName) { displayName('Set 7')}

// SUBFOLDER of TALEO

def ucFolderName = TaleoMainFolderName + "/Taleo_Per_Task"
def ucFolder = folder(ucFolderName) { displayName('Taleo Configuration(Per Task)') }

def ucPerSetFolderName = TaleoMainFolderName + "/Taleo_Per_Set"
def ucPerSetFolder = folder(ucPerSetFolderName) { displayName('Taleo Configuration(Per Set)') }

// TALEO Per task

// Set 1 per task
def uc1_FolderName = ucFolderName + "/Change_Operation_Mode_to_Maintenance"
def uc1_Folder = folder(uc1_FolderName) { displayName('Change Operation Mode to Maintenance')}

def uc2_FolderName = ucFolderName + "/Create_Organization_Structure"
def uc2_Folder = folder(uc2_FolderName) { displayName('Create Organization Structure')}

def uc3_FolderName = ucFolderName + "/Create_Locations"
def uc3_Folder = folder(uc3_FolderName) { displayName('Create Locations')}

def uc4_FolderName = ucFolderName + "/Create_Job_Fields"
def uc4_Folder = folder(uc4_FolderName) { displayName('Create Job Fields')}

def uc5_FolderName = ucFolderName + "/Manage_Configuration_Profile"
def uc5_Folder = folder(uc5_FolderName) { displayName('Manage Configuration Profile')}

def uc6_FolderName = ucFolderName + "/Manage_User_Types"
def uc6_Folder = folder(uc6_FolderName) { displayName('Manage User Types')}


// Set 2 per task
def uc7_FolderName = ucFolderName + "/Create_User_Accounts"
def uc7_Folder = folder(uc7_FolderName) { displayName('Create User Accounts')}

def uc8_FolderName = ucFolderName + "/Manage_User_Groups"
def uc8_Folder = folder(uc8_FolderName) { displayName('Manage User Groups')}

def uc9_FolderName = ucFolderName + "/Manage_Security_Policies"
def uc9_Folder = folder(uc9_FolderName) { displayName('Manage Security Policies')}

def uc10_FolderName = ucFolderName + "/Manage_Standard_Fields"
def uc10_Folder = folder(uc10_FolderName) { displayName('Manage Standard Fields')}

def uc11_FolderName = ucFolderName + "/Create_User_Defined_Fields"
def uc11_Folder = folder(uc11_FolderName) { displayName('Create User Defined Fields')}

// Set 3 per task
def uc12_FolderName = ucFolderName + "/Manage_Fields_Selection_List"
def uc12_Folder = folder(uc12_FolderName) { displayName('Manage Fields Selection List')}

def uc13_FolderName = ucFolderName + "/Create_Offer_Field_Layout"
def uc13_Folder = folder(uc13_FolderName) { displayName('Create Offer Field layout')}

def uc14_FolderName = ucFolderName + "/Create_User_Defined_Forms"
def uc14_Folder = folder(uc14_FolderName) { displayName('Create User Defined Forms')}

def uc15_FolderName = ucFolderName + "/Create_User_Defined_Files"
def uc15_Folder = folder(uc15_FolderName) { displayName('Create User Defined Files')}

def uc16_FolderName = ucFolderName + "/Manage_Candidate_File_Setup"
def uc16_Folder = folder(uc16_FolderName) { displayName('Manage Candidate File Setup')}

// Set 4 per task
def uc17_FolderName = ucFolderName + "/Manage_Requisition_File_Setup"
def uc17_Folder = folder(uc17_FolderName) { displayName('Manage Requisition File Setup')}

def uc18_FolderName = ucFolderName + "/Create_Matching_Candidate_Filter"
def uc18_Folder = folder(uc18_FolderName) { displayName('Create Matching Candidate Filter')}

def uc19_FolderName = ucFolderName + "/Create_Requisition_Matching_Criteria"
def uc19_Folder = folder(uc19_FolderName) { displayName('Create Requisition Matching Criteria')}

def uc20_FolderName = ucFolderName + "/Create_Candidate_Matching_Criteria"
def uc20_Folder = folder(uc20_FolderName) { displayName('Create Candidate Matching Criteria')}

def uc21_FolderName = ucFolderName + "/Create_Paragraphs"
def uc21_Folder = folder(uc21_FolderName) { displayName('Create Paragraphs')}

// TALEO Per Set

def Set1_FolderName = ucPerSetFolderName + "/Set_1"
def Set1_Folder = folder(Set1_FolderName) { displayName('Set 1')}

def Set2_FolderName = ucPerSetFolderName + "/Set_2"
def Set2_Folder = folder(Set2_FolderName) { displayName('Set 2')}

def Set3_FolderName = ucPerSetFolderName + "/Set_3"
def Set3_Folder = folder(Set3_FolderName) { displayName('Set 3')}

def Set4_FolderName = ucPerSetFolderName + "/Set_4"
def Set4_Folder = folder(Set4_FolderName) { displayName('Set 4')}


// ADOP Cartridge Management Folder

def cartridgeManagementFolderName= projectFolderName + "/Cartridge_Management"
def cartridgeManagementFolder = folder(cartridgeManagementFolderName) { displayName('Cartridge Management') }


// Cartridge List
def cartridge_list = []
readFileFromWorkspace("${WORKSPACE}/cartridges.txt").eachLine { line ->
    cartridge_repo_name = line.tokenize("/").last()
    local_cartridge_url = cartridgeBaseUrl + "/" + cartridge_repo_name
    cartridge_list << local_cartridge_url
}


// Jobs
def loadCartridgeJob = freeStyleJob(cartridgeManagementFolderName + "/Load_Cartridge")

// Setup Load_Cartridge
loadCartridgeJob.with{
    parameters{
        choiceParam('CARTRIDGE_CLONE_URL', cartridge_list, 'Cartridge URL to load')
    }
    environmentVariables {
        env('WORKSPACE_NAME',workspaceFolderName)
        env('PROJECT_NAME',projectFolderName)
    }
    wrappers {
        preBuildCleanup()
        injectPasswords()
        maskPasswords()
        sshAgent("adop-jenkins-master")
    }
    steps {
        shell('''#!/bin/bash -ex
        
# Clone Cartridge
git clone ${CARTRIDGE_CLONE_URL} cartridge

repo_namespace="${PROJECT_NAME}"
permissions_repo="${repo_namespace}/permissions"

# We trust everywhere
echo -e "#!/bin/sh\nexec ssh -o StrictHostKeyChecking=no \"\\\$@\"\n" > ${WORKSPACE}/custom_ssh
chmod +x ${WORKSPACE}/custom_ssh
export GIT_SSH="${WORKSPACE}/custom_ssh"

# Create repositories
mkdir ${WORKSPACE}/tmp
cd ${WORKSPACE}/tmp
while read repo_url; do
    if [ ! -z "${repo_url}" ]; then
        repo_name=$(echo "${repo_url}" | rev | cut -d'/' -f1 | rev | sed 's#.git$##g')
        target_repo_name="${repo_namespace}/${repo_name}"
        # Check if the repository already exists or not
        repo_exists=0
        list_of_repos=$(ssh -n -o StrictHostKeyChecking=no -p 29418 jenkins@gerrit gerrit ls-projects --type code)

        for repo in ${list_of_repos}
        do
            if [ ${repo} = ${target_repo_name} ]; then
                echo "Found: ${repo}"
                repo_exists=1
                break
            fi
        done

        # If not, create it
        if [ ${repo_exists} -eq 0 ]; then
            ssh -n -o StrictHostKeyChecking=no -p 29418 jenkins@gerrit gerrit create-project --parent "${permissions_repo}" "${target_repo_name}"
        else
            echo "Repository already exists, skipping create: ${target_repo_name}"
        fi
        
        # Populate repository
        git clone ssh://jenkins@gerrit:29418/"${target_repo_name}"
        cd "${repo_name}"
        git remote add source "${repo_url}"
        git fetch source
        git push origin +refs/remotes/source/*:refs/heads/*
        cd -
    fi
done < ${WORKSPACE}/cartridge/src/urls.txt

# Provision one-time infrastructure
if [ -d ${WORKSPACE}/cartridge/infra ]; then
    cd ${WORKSPACE}/cartridge/infra
    if [ -f provision.sh ]; then
        source provision.sh
    else
        echo "INFO: cartridge/infra/provision.sh not found"
    fi
fi

# Generate Jenkins Jobs
if [ -d ${WORKSPACE}/cartridge/jenkins/jobs ]; then
    cd ${WORKSPACE}/cartridge/jenkins/jobs
    if [ -f generate.sh ]; then
        source generate.sh
    else
        echo "INFO: cartridge/jenkins/jobs/generate.sh not found"
    fi
fi
''')
        systemGroovyCommand('''
import jenkins.model.*
import groovy.io.FileType

def jenkinsInstace = Jenkins.instance
def projectName = build.getEnvironment(listener).get('PROJECT_NAME')
def xmlDir = new File(build.getWorkspace().toString() + "/cartridge/jenkins/jobs/xml")
def fileList = []

xmlDir.eachFileRecurse (FileType.FILES) { file ->
    if(file.name.endsWith('.xml')) {
        fileList << file
    }
}
fileList.each {
	String configPath = it.path
  	File configFile = new File(configPath)
    String configXml = configFile.text
    ByteArrayInputStream xmlStream = new ByteArrayInputStream( configXml.getBytes() )
    String jobName = configFile.getName().substring(0, configFile.getName().lastIndexOf('.'))

    jenkinsInstace.getItem(projectName,jenkinsInstace).createProjectFromXML(jobName, xmlStream)
}
''')
        dsl {
            external("cartridge/jenkins/jobs/dsl/**/*.groovy")
        }

    }
    scm {
        git {
            remote {
                name("origin")
                url("${platformToolsGitUrl}")
                credentials("adop-jenkins-master")
            }
            branch("*/master")
        }
    }
}