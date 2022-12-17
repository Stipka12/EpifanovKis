<template>
  <TR>
    <TD>{{optionData.optionName}}</TD>
    <TD>{{optionData.optionValue}}</TD>
  </TR>
</template>

<script>
export default {
  name: "OptionRow",
  props: {
    optionData: Object
  }
}
</script>

<style scoped>
TR{
  background: #FFFFC7;
  font-size: 20px;
  font-weight: bold;
  text-align: left;
}
TR:hover{
  background-color: #473335;
}
TD{
  border-radius: 5px;
  padding-left: 5px;
  width: 50%;
}

</style>