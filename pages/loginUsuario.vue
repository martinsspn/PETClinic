<template>
  <div>
    <div class="container pt-5">
        <b-form @submit.prevent="onSubmit">
            <b-form-group id="grupo1" label="Email:" label-for="input1">
                <b-form-input id="input1" v-model="form.email" placeholder="Insira seu email" required>
                </b-form-input>
            </b-form-group>
            <b-button type="submit" variant="primary">Submit
            </b-button>
        </b-form>
    </div>   
  </div>
</template>

<script>
export default {
  name: 'Login',
  data(){
      return{
          form:{
              email: ''
          }
      }
  },
  methods:{
      onSubmit(){
          console.log(this.form);
          this.$router.push("/usuario/pets");
      }   
  }
}
</script>
