<template>
  <div>
    <div class="container pt-5" >
      <div class="mx-auto mt-5" >
        <h1 class="text-center">Consultas abertas</h1>
        <b-row class="mx-auto">
          <b-button size="sm" class="mr-2" to="/usuario/pets/criar">Adicionar novo Pet</b-button>
        </b-row>
        <b-table striped hover :items="pets" :fields="campos">
            <template #cell(Ações)="row">
                <b-button size="sm" class="mr-2" @click="aceitar">
                    Aceitar
                </b-button>
                <b-button size="sm" class="mr-2" @click="recusar">
                    Recusar
                </b-button>
            </template>
        </b-table>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'Pets',
  data(){
      return{
          campos: [
              'dono', 'data', 'veterinario', 'Ações'
          ],
          consultas: [
              {nome: 'Baby', data: '22-09-2993', dono: 'Gabriel'},
              {nome: 'Lily', data: '22-09-2993', dono: 'Luciara'},
              {nome: 'Leite', data: '22-09-2993', dono: 'Luciara'},
              {nome: 'Micheullon', data: '22-09-2993', dono: 'Gabriel'}   
          ]
      }
  }
}
</script>
