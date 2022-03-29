<template>
  <div>
    <div class="container pt-5" >
        <h4 class="mt-4 mb-2"><nuxt-link to="/usuario/pets/">Voltar aos pets</nuxt-link></h4>
        <div class="mt-3 mb-5 ml-2 mr-2">
            <b-row>
                <b-col>
                    <b-row class="mt-2">
                        <h1 class="pt-2">Baby</h1>
                    </b-row>
                    <b-row class="mt-2">
                        <h1 class="pt-2">Baby</h1>
                    </b-row>
                    <b-row class="mt-2">
                        <h1 class="pt-2">Baby</h1>
                    </b-row>
                </b-col>
            </b-row>
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
