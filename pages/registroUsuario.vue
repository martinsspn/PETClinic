<template>
  <div>
    <div class="container pt-5">
        <h1 class="text-center">Insira seus dados</h1>
        <b-form @submit.prevent="onSubmit">
            
            <b-form-group id="grupo1" label="Nome:" label-for="input1">
                <b-form-input id="input1" v-model="form.nome" placeholder="Insira seu nome" required>
                </b-form-input>
            </b-form-group>
            
            <b-form-group id="grupo2" label="Email:" label-for="input2">
                <b-form-input id="email" v-model="form.email" placeholder="Insira o seu email" required>
                </b-form-input>
            </b-form-group>

            <b-form-group id="grupo3" label="Telefone:" label-for="input3">
                <b-form-input id="input3" v-model="form.telefone" placeholder="Insira seu telefone" required>
                </b-form-input>
            </b-form-group>
            
            <b-form-group id="grupo4" label="Endereço:" label-for="input4">
                <b-form-input id="email" v-model="form.endereco" placeholder="Insira o seu endereço" required>
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
  name: 'CriarPet',
  data(){
      return{
          form:{
              nome: '',
              email: '',
              telefone: '',
              endereco: ''
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
