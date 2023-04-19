<template>
    <v-app>
        <v-card class="rounded-0">
            <v-toolbar color="primary" flat>
                <v-btn icon="mdi-menu"></v-btn>
                    社員一覧
            </v-toolbar>
            <v-data-table
                :headers="headers"
                :items="people"
                >
    </v-data-table>
        </v-card>
    </v-app>
</template>

<script>
import axios from 'axios'
export default{
    data () {
        return {
        people: [],
        singleSelect: false,
            selected: [],
            headers: [
            {
                align: 'start',
                sortable: false,
            },
            { title: 'ID', value: 'id' },
            { title: '氏名', value: 'name' },
            { title: '社員コード', value: 'code' },
            { title: '所属名', value: 'belong_nm' },
            ],
        }
    },
    methods:{
        getPeople(){
            const url = axios.get("http://localhost:8080/home")
                .then(response => {this.people = response.data})
                .catch(error => {console.log(error)})
        }
    },
    created(){this.getPeople()}
}
</script>