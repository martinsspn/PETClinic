<template>
  <div>
    <div class="container pt-5">
        <h1 class="text-center">Insira os dados do seu pet</h1>
        <b-form @submit.prevent="onSubmit">
            
            <b-form-group id="grupo1" label="Nome:" label-for="input1">
                <b-form-input id="input1" v-model="form.nome" placeholder="Insira o nome do pet" required>
                </b-form-input>
            </b-form-group>
            
            <b-form-group id="grupo2" label="Aniversário:" label-for="input2">
                <b-form-input id="date" v-model="form.aniversario" placeholder="Insira o aniversário do pet" required>
                </b-form-input>
            </b-form-group>
            
            <b-form-group id="grupo3" label="Dono:" label-for="input3">
                <b-form-input id="input3" v-model="form.idDono" placeholder="Insira o id do dodo do pet" required>
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
              aniversario: '',
              idDono: 0
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
