<template>
  <div>
    <div class="container pt-5" >
      <div class="mx-auto mt-5" >
        <h1 class="text-center">Consultas</h1>
        <b-table striped hover :items="consultas" :fields="campos">
        
        </b-table>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'Consulta',
  data(){
      return{
          campos: [
            'nome', 'estado', 'veterinario'
          ],
          consultas: [
              {nome: 'Baby', estado: 0,veterinario: 'Gabriel'},
              {nome: 'Lily', estado: 1, veterinario: 'Luciara'},
              {nome: 'Leite', estado: 0, veterinario: 'Luciara'},
              {nome: 'Micheullon', estado: 1,veterinario: 'Gabriel'}   
          ]
      }
  }
}
</script>
