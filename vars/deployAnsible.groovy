def call() {
   sshagent(['ansible-controller-ssh']) {
    sh '''
        ssh -o strictHostkeyChecking=no ubuntu@10-0-1-117 \
       "cd ~/ansible_repo && ansible-playbook -i inventory site.yml"
     '''
   }
}