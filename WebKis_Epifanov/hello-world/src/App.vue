<template>
  <div id="app">
    <hello-world>
    </hello-world>
    <option-list>
    </option-list>
  </div>
</template>

<script>
import HelloWorld from "@/components/HelloWorld";
import OptionList from "@/components/OptionList";

export default {
  components:{
    HelloWorld,
    OptionList
  },
  async mounted(){
    await this.$store.dispatch('loadOptionList')

  }
}
</script>

<style lang="less">
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

nav {
  padding: 30px;

  a {
    font-weight: bold;
    color: #2c3e50;
    background: #FCAA67;
    &.router-link-exact-active {
      color: #42b983;
    }
  }
}
</style>
