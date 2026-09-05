def call() {
    sh 'ansible-playbook -i ~/ansible_repo inventory ~/ansible_repo/site.yml'
}