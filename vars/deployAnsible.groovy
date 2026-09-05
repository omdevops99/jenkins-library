def call() {
    sh 'ansible-playbook -i ~/ansible_repo inventory inventory ~/ansible_repo/site.yml'
}