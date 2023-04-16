// import { createApp } from 'vue'
// import App from './App.vue'
// import vuetify from './plugins/vuetify'
// import { loadFonts } from './plugins/webfontloader'

// loadFonts()

// createApp(App)
//   .use(vuetify)
//   .mount('#app')

import { createApp } from 'vue'
import Home from './Home.vue'
import vuetify from './plugins/vuetify'
import { loadFonts } from './plugins/webfontloader'

loadFonts()

createApp(Home)
  .use(vuetify)
  .mount('#app')