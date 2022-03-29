<template>
  <div>
    <div class="container pt-5" >
      <div class="mx-auto mt-5" >
        <h1 class="text-center">Pets</h1>
        <b-table striped hover :items="pets" :fields="campos">
            <template #cell(Ações)="row">
                <b-button size="sm" class="mr-2" :to="`/usuario/pets/${row.item.id}`">
                    Ver detalhes
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
            'nome', 'dono', 'Ações'
          ],
          pets: [
              {id: 1, nome: 'Baby', dono: 'Gabriel'},
              {id: 2, nome: 'Lily', dono: 'Luciara'},
              {id: 3, nome: 'Leite', dono: 'Luciara'},
              {id: 4, nome: 'Micheullon', dono: 'Gabriel'}   
          ]
      }
  }
}
</script>
