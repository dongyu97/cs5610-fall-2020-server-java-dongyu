(function () {
    let users = [
        {
            username: 'alice',
            password: '',
            first: 'Alice',
            last: 'WonderLand',
            role: "FACULTY"
        },
        {
            username: 'bob',
            password: '',
            first: 'Bob',
            last: 'Smith',
            role: "FACULTY"
        }

    ]
    let tbody
    let template
    let clone
    let $createBtn
    let $usernameFld, $firstNameFld, $lastNameFld, $roleFld
    const userService = new AdminUserServiceClient()

    const deleteUser1 = (event) => {
        const deleteBtn = $(event.currentTarget)
        deleteBtn.parents("tr.wbdv-template").remove()
    }
    const deleteUser2 = (_index) => {
        const user=users[_index]
        const userId=user._id
        userService.deleteUser(userId)
            .then(response =>{
                users.splice(_index,1)
                renderUsers(users)
            })
        // users.splice(index, 1)
        // renderUsers(users)
    }
    let selectUserIndex =-1
    const selectUser =(index) =>{
        selectUserIndex =index
        $("#usernameFld").val(users[index].username)
        $("#firstNameFld").val(users[index].first)
        $("#lastNameFld").val(users[index].last)
        $("#roleFld").val(users[index].role)

    }

    const renderUsers = (users) => {

        tbody.empty()
        const ul = $("<ul>")

        for (let i = 0; i < users.length; i++) {
            const user = users[i]


            clone = template.clone()
            clone.removeClass("wbdv-hidden")
            clone.find(".wbdv-username").html(user.username)
            // clone.find(".wbdv-first-name").html(user.fName)
            clone.find(".wbdv-first-name").html(user.first)
            clone.find(".wbdv-last-name").html(user.last)
            clone.find(".wbdv-role").html(user.role)
            clone.find(".wbdv-remove").click(() => deleteUser2(i))
            clone.find(".wbdv-edit").click(() =>selectUser(i))

            //clone.find(".wbdv-remove").on('click', (i) => deleteUser2)
            tbody.append(clone)
        }

        window.container.append(ul)

    }
    const createUser = () =>{
        console.log("create")
        const userName= $usernameFld.val()
        const firstName=$firstNameFld.val()
        const lastName=$lastNameFld.val()
        const role=$roleFld.val()
        $usernameFld.val("")
        $firstNameFld.val("")
        $lastNameFld.val("")
        $roleFld.val("")
        const newUser ={
            username: userName,
            first: firstName,
            last: lastName,
            role: role
        }
        userService.createUser(newUser)
            .then(actualNewUser =>{
                users.push(actualNewUser)
                renderUsers(users)
            })
        // users.push(newUser)
        // renderUsers(users)
    }

    const updateSelectUser =() =>{
        const newUserName = $("#usernameFld").val()
        const newFirstName = $("#firstNameFld").val()
        const newLastName = $("#lastNameFld").val()
        const newRole =$("#roleFld").val()
        const userId = users[selectUserIndex]._id
        userService.updateUser(userId,{
            username: newUserName,
            first: newFirstName,
            last: newLastName,
            role: newRole
        })
            .then(response =>{
                users[selectUserIndex].username=newUserName
                users[selectUserIndex].first=newFirstName
                users[selectUserIndex].last = newLastName
                users[selectUserIndex].role = newRole
                renderUsers(users)
            })
    }


    const findAllUsers = () =>{
        userService.findAllUsers()
            .then((data) =>{
                console.log(data)
                users = data

                renderUsers(users)
            })
    }
    const main = () => {



        const heading1 = jQuery("h1")
        window.container = $(".container")
        // container.promise().done((container)=>renderUsers(users))
//         var div = $( "<div>" );
//         div.promise().done(function( arg1 ) {
// // Will fire right away and alert "true"
//             alert( this === div && arg1 === div );
//         });
        tbody = $("tbody")
        template = $("tr.wbdv-template")
        findAllUsers()
        // userService.findAllUsers()
        //     .then((data) =>{
        //         console.log(data)
        //         users = data
        //
        //         renderUsers(users)
        //     })
        // renderUsers(users)
        $createBtn = $(".wbdv-create").click(createUser)
        $firstNameFld=$("#firstNameFld")
        $usernameFld = $("#usernameFld")
        $lastNameFld = $("#lastNameFld")
        $roleFld = $("#roleFld")


        $(".wbdv-update").click(updateSelectUser)

    }
    $(main)
})()
