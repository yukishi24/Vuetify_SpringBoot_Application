<template>
    <v-app>
        <v-card class="rounded-0">
            <v-toolbar color="primary" flat>
                <v-btn icon="mdi-menu" @click="getPeople()"></v-btn>
                    社員一覧
            </v-toolbar>
            <div>{{ people }}</div>
        </v-card>
    </v-app>
</template>

<script>
import axios from 'axios'
export default{
    data(){
        return{
            people: []
        }
    },
    methods:{
        getPeople(){
            const url = "http://localhost:8080/home"
            axios.get(url)
                .then(response => {this.people = response.data})
                .catch(error => {console.log(error)})
        }
    },
}
</script>