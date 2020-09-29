
function AdminUserServiceClient() {
    this.createUser = createUser;
    this.findAllUsers = findAllUsers;
    this.findUserById = findUserById;
    this.deleteUser = deleteUser;
    this.updateUser = updateUser;
    this.url = 'https://wbdv-generic-server.herokuapp.com/api/dongyu/users';
    var self = this;
    function createUser(user) {
        return fetch('https://wbdv-generic-server.herokuapp.com/api/dongyu/users',{
            method:'POST',
            body: JSON.stringify(user),
            headers:{
                'content-type':'application/json'
            }
        }).then(response => response.json())
    }
    function findAllUsers() {
        return fetch('https://wbdv-generic-server.herokuapp.com/api/dongyu/users')
        .then( (response) => response.json()

        )

    }
    function findUserById(userId) { }
    function updateUser(userId, user) {
        return fetch(`https://wbdv-generic-server.herokuapp.com/api/dongyu/users/${userId}`,{
            method: 'PUT',
            body: JSON.stringify(user),
            headers:{
                'content-type':'application/json'
            }
        }).then(response => response.json())
    }
    function deleteUser(userId) {
        return fetch('https://wbdv-generic-server.herokuapp.com/api/dongyu/users/'+userId,{
            method: 'DELETE'
        })
    }
}

