node{
    stage("Pull Repo"){
        git "https://github.com/Madina89/packer_april.git"
    }
    stage("Build AMI"){
        sh "packer build updated/updated.json"
    }
}