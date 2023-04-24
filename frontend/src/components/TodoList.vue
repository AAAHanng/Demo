<template>
    <div class="todo-app">
        <h1>This TodoList App</h1>
        <div class="todo-form">
            <input type="text" placeholder="This input thing" v-model="newTo">
            <button @click="addTodo">ADD</button>
        </div>
        <ul>
            <li v-for="(todo,index) in todos " :key="index">
                <input type="checkbox">
                <span>{{ todo.text }}</span>
                <button @click="delect(index)">Delect</button>
            </li>
        </ul>
    </div>
</template>

<script>
    export default{
        name : 'TodoAPP',
        data(){
            return{
                newTo :'',
                todos:[
                    {text:"one"},
                    {text:"two"},
                    {text:"three"}
                ]
            }
        },

        methods :{
            addTodo(){
                this.todos.push({text:this.newTo})
                this.newTo = ''
            },

            delect(index){
                this.todos.splice(index,1)
            }
        }
    }
</script>