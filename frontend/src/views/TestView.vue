<template>
  <div>
    <button @click="getUser">Get User</button>
    <p>{{ user }}</p>
  </div>
</template>

<script>
import axios from 'axios'

export default {
  data() {
    return {
      user: null
    }
  },
  methods: {
    getUser() {
      axios.get('http://localhost:8081/user/')
        .then(response => {
          console.log(response.data);
        })
        .catch(error => {
          console.log(error);
        });
    }
  }
}
</script>
