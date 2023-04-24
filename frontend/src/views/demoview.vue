<template>
    <div class="form">
      <form>
        <div class="form-group">
          <label for="name">姓名</label>
          <input type="text" id="name" v-model="form.name">
        </div>
        <div class="form-group">
          <label for="age">年龄</label>
          <input type="text" id="age" v-model="form.age">
        </div>
        <div class="form-group">
          <label for="email">邮箱</label>
          <input type="email" id="email" v-model="form.email">
        </div>
        <button type="submit" @click.prevent="submitForm">提交</button>
      </form>
    </div>
  </template>
  
  <script>
  export default {
    data() {
      return {
        form: {
          name: '',
          age: '',
          email: '',
        },
      };
    },
    methods: {
      submitForm() {
        // 处理表单提交逻辑
        console.log(this.form);
      },
    },
  };
  </script>
  
  <style scoped>
  .form {
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
  }
  
  form {
    display: flex;
    flex-direction: column;
    width: 400px;
    padding: 20px;
    border: 1px solid #ccc;
  }
  
  .form-group {
    display: flex;
    flex-direction: column;
    margin-bottom: 10px;
  }
  
  label {
    font-weight: bold;
    margin-bottom: 5px;
  }
  </style>
  