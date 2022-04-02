<template>
  <div>
    <div class="container pt-5">
        <h1 class="text-center">Insira os dados do seu pet</h1>
        <b-form @submit.prevent="onSubmit">
            
            <b-form-group id="grupo1" label="Data:" label-for="input1">
                <b-form-input type="date" id="input1" v-model="form.data" placeholder="Insira a data da consulta" required>
                </b-form-input>
            </b-form-group>
            
            <b-form-group id="grupo2" label="Dono:" label-for="input2">
                <b-form-select id="input2" v-model="veterinario" :options="opcoes" required>
                </b-form-select>
            </b-form-group>



            <b-button type="submit" variant="primary">Submit
            </b-button>
        </b-form>
    </div>   
  </div>
</template>

<script>
export default {
  name: 'Consulta_id',
  data(){
      return{
          veterinario: null,
          form:{
              data: ''           
          },
          opcoes: [
              {value: null, text: "Escolha o veterinário"}
          ]
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
