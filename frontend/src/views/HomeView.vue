<template>
  <div class="home">
    <HelloWorld msg="Welcome to Your Vue.js App"/>
    <TodoList/>
  </div>
</template>

<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue'
import TodoList from '@/components/TodoList.vue'

export default {
  name: 'HomeView',
  components: {
    HelloWorld,
    TodoList
  }
}
</script>
