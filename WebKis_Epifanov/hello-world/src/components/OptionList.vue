<template>
  <div style="text-align: center">
    <button class="btn1" v-on:click="appendRow">Добавить</button>
    <button class="btn2" v-on:click="appendRow">Удалить</button>
    <button class="btn3" v-on:click="appendRow">Изменить</button>
    <TABLE>
      <TR>
        <TH>Имя</TH>
        <TH>Значение</TH>
      </TR>
      <option-row v-for="option in optionList" v-bind:key="option.optionName" :option-data="option">
      </option-row>
    </TABLE>
  </div>
</template>

<script>
import OptionRow from "./OptionRow";

export default {

  name: "OptionList",
  components: {
    OptionRow
 },
  computed:{
    optionList(){
      return this.$store.getters.getOptionList
    },
  },
  methods: {
    appendRow(){
      alert('Сообщение')
    }
  }
}
</script>

<style scoped>

TABLE{
  background: #B0413E;
  width: 50%;
  margin-left: auto;
  margin-right: auto;
  border-radius: 5px;
}
TH{
  color: #FFFFC7;
}
TR{
  color: #473335;
}
TR:hover{
  color: #FFFFC7;
}
TH{
  font-size: 20px;
}

.btn1{
  display: inline-block;
  box-sizing: border-box;
  margin: 0 15px 0 0;
  height: 46px;
  width: 100px;
  border: none;
  border-radius: 15px;
  font-size: 14px;
  font-weight: bold;
  background-color: #2c3e50;
  color: #42b983;
}
.btn1:hover{
  transition: all 0.2s;
  background-color: #42b983;
  color: #2c3e50;
}
.btn1:active{
  background-color: #308864;
}
.btn2{
  display: inline-block;
  box-sizing: border-box;
  margin: 0 15px 15px 0;
  height: 46px;
  width: 100px;
  border: none;
  border-radius: 15px;
  font-size: 14px;
  font-weight: bold;
  background-color: #2c3e50;
  color: #42b983;
}
.btn2:hover{
  transition: all 0.2s;
  background-color: #42b983;
  color: #2c3e50;
}
.btn2:active{
  background-color: #308864;
}
.btn3{
  display: inline-block;
  box-sizing: border-box;
  margin: 0 0 15px 0;
  height: 46px;
  width: 100px;
  border: none;
  border-radius: 15px;
  font-size: 14px;
  font-weight: bold;
  background-color: #2c3e50;
  color: #42b983;
}
.btn3:hover{
  transition: all 0.2s;
  background-color: #42b983;
  color: #2c3e50;
}
.btn3:active{
  background-color: #308864;
}
</style>