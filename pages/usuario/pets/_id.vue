<template>
  <div>
    <HeaderUsuario/>
    <div class="container pt-5" >
        <h4 class="mt-4 mb-2"><nuxt-link to="/usuario/pets/">Voltar aos pets</nuxt-link></h4>
        <div class="mt-3 mb-5 ml-2 mr-2">
            <b-row>
                <b-col>
                    <b-row class="mt-2">
                        <h1 class="pt-2">Baby</h1>
                    </b-row>
                    <b-row class="mt-2">
                        <span>Data de Nascimento: 21-01-2011</span>
                    </b-row>
                    <b-row class="mt-2">
                        <span>Dono: Gabriel Martins</span>
                    </b-row>
                    <b-row>
                        <b-button size="sm" class="mr-2" to="/consulta/1">Solicitar consulta</b-button>
                        <b-button size="sm" variant="warning" class="mr-2" to="/usuario/pets/edit/1">Editar</b-button>
                        <b-button size="sm" variant="danger" class="mr-2" @click="excluir">Solicitar consulta</b-button>
                    </b-row>
                </b-col>
            </b-row>
        </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'Pets_id',
  data(){
      return{
      }
  },
  methods:{
     excluir(){
        console.log("Pet excluido");
     } 
  }
}
</script>
