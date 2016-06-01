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
def TalentMainFolder = folder(TalentMainFolderName) { displayName('Oracle HCM Talent')}
def CoreMainFolderName = projectFolderName + "/HCM-CORE"
def CoreMainFolder = folder(CoreMainFolderName) { displayName('Oracle HCM Core')}
def TaleoMainFolderName = projectFolderName + "/TALEO"
def TaleoMainFolder = folder(TalentMainFolderName) { displayName('Oracle Taleo')}


// SUBFOLDER of Talent

def talentsubFolderName = TalentMainFolderName + "/HCM_Talent_Per_Set"
def talentsubFolder = folder(talentsubFolderName) { displayName('Oracle HCM Talent(Per Set)')}

//Per Set Talent

def set1FolderName = talentsubFolderName + "/Set_1"
def set1Folder = folder(set1FolderName) { displayName('Set 1')}

// SUBFOLDER of TALEO

def ucFoldername = TaleoMainFolderName + "/Taleo_Per_Task"
def ucFolder = folder(ucFoldername) { displayName('Taleo Configuration(Per Task)')}

def ucPerSetFoldername = TaleoMainFolderName + "/Taleo_Per_Set"
def ucPerSetFolder = folder(ucPerSetFoldername) { displayName('Taleo Configuration(Per Set)')}

//Per task

// Set 1 per task
def uc1_FolderName = ucFoldername + "/Change_Operation_Mode_to_Maintenance"
def uc1_Folder = folder(uc1_FolderName) { displayName('Change Operation Mode to Maintenance')}

def uc2_FolderName = ucFoldername + "/Create_Organization_Structure"
def uc2_Folder = folder(uc2_FolderName) { displayName('Create Organization Structure')}

def uc3_FolderName = ucFoldername + "/Create_Locations"
def uc3_Folder = folder(uc3_FolderName) { displayName('Create Locations')}

def uc4_FolderName = ucFoldername + "/Create_Job_Fields"
def uc4_Folder = folder(uc4_FolderName) { displayName('Create Job Fields')}

def uc5_FolderName = ucFoldername + "/Manage_Configuration_Profile"
def uc5_Folder = folder(uc5_FolderName) { displayName('Manage Configuration Profile')}

def uc6_FolderName = ucFoldername + "/Manage_User_Types"
def uc6_Folder = folder(uc6_FolderName) { displayName('Manage User Types')}


// Set 2 per task
def uc7_FolderName = ucFoldername + "/Create_User_Accounts"
def uc7_Folder = folder(uc7_FolderName) { displayName('Create User Accounts')}

def uc8_FolderName = ucFoldername + "/Manage_User_Groups"
def uc8_Folder = folder(uc8_FolderName) { displayName('Manage User Groups')}

def uc9_FolderName = ucFoldername + "/Manage_Security_Policies"
def uc9_Folder = folder(uc9_FolderName) { displayName('Manage Security Policies')}

def uc10_FolderName = ucFoldername + "/Manage_Standard_Fields"
def uc10_Folder = folder(uc10_FolderName) { displayName('Manage Standard Fields')}

def uc11_FolderName = ucFoldername + "/Create_User_Defined_Fields"
def uc11_Folder = folder(uc11_FolderName) { displayName('Create User Defined Fields')}

/*
// Set 3 per task
def uc12_FolderName = ucFoldername + "/Manage_Fields_Selection_List"
def uc12_Folder = folder(uc12_FolderName) { displayName('Manage Fields Selection List')}

def uc13_FolderName = ucFoldername + "/Create_Offer_Field_Layout"
def uc13_Folder = folder(uc13_FolderName) { displayName('Create Offer Field layout')}

def uc14_FolderName = ucFoldername + "/Create_User_Defined_Forms"
def uc14_Folder = folder(uc14_FolderName) { displayName('Create User Defined Forms')}

def uc15_FolderName = ucFoldername + "/Create_User_Defined_Files"
def uc15_Folder = folder(uc15_FolderName) { displayName('Create User Defined Files')}

def uc16_FolderName = ucFoldername + "/Manage_Candidate_File_Setup"
def uc16_Folder = folder(uc16_FolderName) { displayName('Manage Candidate File Setup')}

// Set 4 per task
def uc17_FolderName = ucFoldername + "/Manage_Requisition_File_Setup"
def uc17_Folder = folder(uc17_FolderName) { displayName('Manage Requisition File Setup')}

def uc18_FolderName = ucFoldername + "/Create_Matching_Candidate_Filter"
def uc18_Folder = folder(uc18_FolderName) { displayName('Create Matching Candidate Filter')}

def uc19_FolderName = ucFoldername + "/Create_Requisition_Matching_Criteria"
def uc19_Folder = folder(uc19_FolderName) { displayName('Create Requisition Matching Criteria')}

def uc20_FolderName = ucFoldername + "/Create_Candidate_Matching_Criteria"
def uc20_Folder = folder(uc20_FolderName) { displayName('Create Candidate Matching Criteria')}

// Set 5 per task
def uc21_FolderName = ucFoldername + "/Create_Paragraphs"
def uc21_Folder = folder(uc21_FolderName) { displayName('Create Paragraphs')}

def uc22_FolderName = ucFoldername + "/Create_Message_Templates"
def uc22_Folder = folder(uc22_FolderName) { displayName('Create Message Templates')}

def uc23_FolderName = ucFoldername + "/Manage_Requisition_Types"
def uc23_Folder = folder(uc23_FolderName) { displayName('Manage Requisition Types')}

def uc24_FolderName = ucFoldername + "/Manage_Center_Stage"
def uc24_Folder = folder(uc24_FolderName) { displayName('Manage Center Stage')}

def uc25_FolderName = ucFoldername + "/Manage_Candidate_Duplicate_Check"
def uc25_Folder = folder(uc25_FolderName) { displayName('Manage Candidate Duplicate Check')}

def uc26_FolderName = ucFoldername + "/Manage_Candidate_Search_Page"
def uc26_Folder = folder(uc26_FolderName) { displayName('Manage Candidate Search Page')}

// Set 6 per task
def uc27_FolderName = ucFoldername + "/Manage_Welcome_Center_Content"
def uc27_Folder = folder(uc27_FolderName) { displayName('Manage Welcome Center Content')}

def uc28_FolderName = ucFoldername + "/Create_User_Defined_Forms_For_Career_Section"
def uc28_Folder = folder(uc28_FolderName) { displayName('Create User Defined Forms For Career Section')}

def uc29_FolderName = ucFoldername + "/Manage_Application_Flows"
def uc29_Folder = folder(uc29_FolderName) { displayName('Manage Application Flows')}

def uc30_FolderName = ucFoldername + "/Manage_Career_Sections"
def uc30_Folder = folder(uc30_FolderName) { displayName('Manage Career Sections')}

def uc31_FolderName = ucFoldername + "/Manage_Diversity_Form_List"
def uc31_Folder = folder(uc31_FolderName) { displayName('Manage Diversity Form List')}

// Set 7 per task
def uc32_FolderName = ucFoldername + "/Manage_Question_Type"
def uc32_Folder = folder(uc32_FolderName) { displayName('Manage Question Type')}

def uc33_FolderName = ucFoldername + "/Manage_Statements"
def uc33_Folder = folder(uc33_FolderName) { displayName('Manage Statements')}

def uc34_FolderName = ucFoldername + "/Manage_Themes"
def uc34_Folder = folder(uc34_FolderName) { displayName('Manage Themes')}

def uc35_FolderName = ucFoldername + "/Manage_Career_Portal_Brands"
def uc35_Folder = folder(uc35_FolderName) { displayName('Manage Career Portal Brands')}

def uc36_FolderName = ucFoldername + "/Manage_Career_Section_URLs"
def uc36_Folder = folder(uc36_FolderName) { displayName('Manage Career Section URLs')}

// Set 8 per task
def uc37_FolderName = ucFoldername + "/Manage_Personalized_Job_List"
def uc37_Folder = folder(uc37_FolderName) { displayName('Manage Personalized Job List')}

def uc38_FolderName = ucFoldername + "/Manage_Documents"
def uc38_Folder = folder(uc38_FolderName) { displayName('Manage Documents')}

def uc39_FolderName = ucFoldername + "/Create_Onboarding_User_Defined_Forms"
def uc39_Folder = folder(uc39_FolderName) { displayName('Create Onboarding User Defined Forms')}

def uc40_FolderName = ucFoldername + "/Manage_User_Defined_Selections"
def uc40_Folder = folder(uc40_FolderName) { displayName('Manage User Defined Selections')}

def uc41_FolderName = ucFoldername + "/Manage_Electronic_Signature"
def uc41_Folder = folder(uc41_FolderName) { displayName('Manage Electronic Signature')}

// Set 9 per task
def uc42_FolderName = ucFoldername + "/Manage_Task_Definitions"
def uc42_Folder = folder(uc42_FolderName) { displayName('Manage Task Definitions')}

def uc43_FolderName = ucFoldername + "/Manage_Process_Steps"
def uc43_Folder = folder(uc43_FolderName) { displayName('Manage Process Steps')}

def uc44_FolderName = ucFoldername + "/Manage_Onboarding_Paragraphs"
def uc44_Folder = folder(uc44_FolderName) { displayName('Manage Onboarding Paragraphs')}

def uc45_FolderName = ucFoldername + "/Manage_Onboarding_Documents"
def uc45_Folder = folder(uc45_FolderName) { displayName('Manage Onboarding Documents')}

def uc46_FolderName = ucFoldername + "/Manage_Onboarding_Message_Templates"
def uc46_Folder = folder(uc46_FolderName) { displayName('Manage Onboarding Message Templates')}

def uc47_FolderName = ucFoldername + "/Manage_Onboarding_Content_Pages"
def uc47_Folder = folder(uc47_FolderName) { displayName('Manage Onboarding Content Pages')}

def uc48_FolderName = ucFoldername + "/Manage_Images"
def uc48_Folder = folder(uc48_FolderName) { displayName('Manage Images')}

// Set 10 per task
def uc49_FolderName = ucFoldername + "/Manage_Worker_Goal_Setting_Lookups"
def uc49_Folder = folder(uc49_FolderName) { displayName('Manage Worker Goal Setting Lookups')}

def uc50_FolderName = ucFoldername + "/Manage_Goal_Value_Sets"
def uc50_Folder = folder(uc50_FolderName) { displayName('Manage Goal Value Sets')}

def uc51_FolderName = ucFoldername + "/Manage_Worker_Goal_Descriptive_Flexfields"
def uc51_Folder = folder(uc51_FolderName) { displayName('Manage Worker Goal Descriptive Flexfields')}

def uc52_FolderName = ucFoldername + "/Manage_Worker_Goal_Setting_Profile_Option_Values"
def uc52_Folder = folder(uc52_FolderName) { displayName('Manage Worker Goal Setting Profile Option Values')}

// Set 11 per task
def uc53_FolderName = ucFoldername + "/Manage_Goal_Management_Notification_Settings"
def uc53_Folder = folder(uc53_FolderName) { displayName('Manage Goal Management Notification Settings')}

def uc54_FolderName = ucFoldername + "/Manage_Goal_Library"
def uc54_Folder = folder(uc54_FolderName) { displayName('Manage Goal Library')}

def uc55_FolderName = ucFoldername + "/Manage_Review_Periods"
def uc55_Folder = folder(uc55_FolderName) { displayName('Manage Review Periods')}

def uc56_FolderName = ucFoldername + "/Manage_Goal_Plans"
def uc56_Folder = folder(uc56_FolderName) { displayName('Manage Goal Plans')}

// Set 12 per task
def uc57_FolderName = ucFoldername + "/Manage_Performance_Value_Sets"
def uc57_Folder = folder(uc57_FolderName) { displayName('Manage Performance Value Sets')}

def uc58_FolderName = ucFoldername + "/Manage_Performance_Lookups"
def uc58_Folder = folder(uc58_FolderName) { displayName('Manage Performance Lookups')}

def uc59_FolderName = ucFoldername + "/Manage_Worker_Performance_Descriptive_Flexfields"
def uc59_Folder = folder(uc59_FolderName) { displayName('Manage Worker Performance Descriptive Flexfields')}

def uc60_FolderName = ucFoldername + "/Manage_Worker_Performance_Profile_Option_Values"
def uc60_Folder = folder(uc60_FolderName) { displayName('Manage Worker Performance Profile Option Values')}

def uc61_FolderName = ucFoldername + "/Manage_Performance_Notifications"
def uc61_Folder = folder(uc61_FolderName) { displayName('Manage Performance Notifications')}

// Set 13 per task
def uc62_FolderName = ucFoldername + "/Manage_Performance_Roles"
def uc62_Folder = folder(uc62_FolderName) { displayName('Manage Performance Roles')}

def uc63_FolderName = ucFoldername + "/Manage_Talent_Eligibility_Profiles"
def uc63_Folder = folder(uc63_FolderName) { displayName('Manage Talent Eligibility Profiles')}

def uc64_FolderName = ucFoldername + "/Manage_Performance_Process_Flows"
def uc64_Folder = folder(uc64_FolderName) { displayName('Manage Performance Process Flows')}

def uc65_FolderName = ucFoldername + "/Manage_Performance_Template_Sections"
def uc65_Folder = folder(uc65_FolderName) { displayName('Manage Performance Template Sections')}

def uc66_FolderName = ucFoldername + "/Manage_Performance_Document_Types"
def uc66_Folder = folder(uc66_FolderName) { displayName('Manage Performance Document Types')}

// Set 14 per task
def uc67_FolderName = ucFoldername + "/Manage_Performance_Templates"
def uc67_Folder = folder(uc67_FolderName) { displayName('Manage Performance Templates')}

def uc68_FolderName = ucFoldername + "/Manage_Target_Ratings_Distribution"
def uc68_Folder = folder(uc68_FolderName) { displayName('Manage Target Ratings Distribution')}

def uc69_FolderName = ucFoldername + "/Manage_Performance_and_Potential_Box_Chart_Labels"
def uc69_Folder = folder(uc69_FolderName) { displayName('Manage Performance and Potential Box Chart Labels')}

// Set 15 per task
def uc70_FolderName = ucFoldername + "/Manage_Questionnaire_Lookups"
def uc70_Folder = folder(uc70_FolderName) { displayName('Manage Questionnaire Lookups')}

def uc71_FolderName = ucFoldername + "/Manage_Question_Library"
def uc71_Folder = folder(uc71_FolderName) { displayName('Manage Question Library')}

def uc72_FolderName = ucFoldername + "/Manage_Questionnaire_Template"
def uc72_Folder = folder(uc72_FolderName) { displayName('Manage Questionnaire Template')}

def uc73_FolderName = ucFoldername + "/Manage_Questionnaires"
def uc73_Folder = folder(uc73_FolderName) { displayName('Manage Questionnaires')}

// Set 16 per task
def uc74_FolderName = ucFoldername + "/Manage_Talent_Review_Lookups"
def uc74_Folder = folder(uc74_FolderName) { displayName('Manage Talent Review Lookups')}

def uc75_FolderName = ucFoldername + "/Manage_Talent_Review_Value_Sets"
def uc75_Folder = folder(uc75_FolderName) { displayName('Manage Talent Review Value Sets')}

def uc76_FolderName = ucFoldername + "/Manage_Talent_Review Descriptive_Flexfields"
def uc76_Folder = folder(uc76_FolderName) { displayName('Manage Talent Review Descriptive Flexfields')}

def uc77_FolderName = ucFoldername + "/Talent_Review_Notifications"
def uc77_Folder = folder(uc77_FolderName) { displayName('Talent Review Notifications')}

def uc78_FolderName = ucFoldername + "/Manage_Talent_Review_Dashboard_Options"
def uc78_Folder = folder(uc78_FolderName) { displayName('Manage Talent Review Dashboard Options')}

def uc79_FolderName = ucFoldername + "/Manage_Potential_Assessment"
def uc79_Folder = folder(uc79_FolderName) { displayName('Manage Potential Assessment')}

def uc80_FolderName = ucFoldername + "/Manage_Succession_Management_Lookups"
def uc80_Folder = folder(uc80_FolderName) { displayName('Manage Succession Management Lookups')}
*/

//Per Set

def Set1_FolderName = ucPerSetFoldername + "/Set_1"
def Set1_Folder = folder(Set1_FolderName) { displayName('Set 1')}

def Set2_FolderName = ucPerSetFoldername + "/Set_2"
def Set2_Folder = folder(Set2_FolderName) { displayName('Set 2')}

/*
def Set3_FolderName = ucPerSetFoldername + "/Set_3"
def Set3_Folder = folder(Set3_FolderName) { displayName('Set 3')}

def Set4_FolderName = ucPerSetFoldername + "/Set_4"
def Set4_Folder = folder(Set4_FolderName) { displayName('Set 4')}

def Set5_FolderName = ucPerSetFoldername + "/Set_5"
def Set5_Folder = folder(Set5_FolderName) { displayName('Set 5')}

def Set6_FolderName = ucPerSetFoldername + "/Set_6"
def Set6_Folder = folder(Set6_FolderName) { displayName('Set 6')}

def Set7_FolderName = ucPerSetFoldername + "/Set_7"
def Set7_Folder = folder(Set7_FolderName) { displayName('Set 7')}

def Set8_FolderName = ucPerSetFoldername + "/Set_8"
def Set8_Folder = folder(Set8_FolderName) { displayName('Set 8')}

def Set9_FolderName = ucPerSetFoldername + "/Set_9"
def Set9_Folder = folder(Set9_FolderName) { displayName('Set 9')}

def Set10_FolderName = ucPerSetFoldername + "/Set_10"
def Set10_Folder = folder(Set10_FolderName) { displayName('Set 10')}

def Set11_FolderName = ucPerSetFoldername + "/Set_11"
def Set11_Folder = folder(Set11_FolderName) { displayName('Set 11')}

def Set12_FolderName = ucPerSetFoldername + "/Set_12"
def Set12_Folder = folder(Set12_FolderName) { displayName('Set 12')}

def Set13_FolderName = ucPerSetFoldername + "/Set_13"
def Set13_Folder = folder(Set13_FolderName) { displayName('Set 13')}

def Set14_FolderName = ucPerSetFoldername + "/Set_14"
def Set14_Folder = folder(Set14_FolderName) { displayName('Set 14')}

def Set15_FolderName = ucPerSetFoldername + "/Set_15"
def Set15_Folder = folder(Set15_FolderName) { displayName('Set 15')}

def Set16_FolderName = ucPerSetFoldername + "/Set_16"
def Set16_Folder = folder(Set16_FolderName) { displayName('Set 16')}
*/

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