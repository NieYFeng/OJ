<template>
  <div class="exampleView">
    <MdEditor :value="mdValue" :handle-change="onMdChange" />
    <CodeEditor :value="codeValue" :handle-change="onCodeChange" />
  </div>
</template>

<script setup lang="ts">
import { defineComponent, ref } from "vue";

import MdEditor from "@/components/MdEditor.vue";
import CodeEditor from "@/components/CodeEditor.vue";

const mdValue = ref();
const codeValue = ref();
const onMdChange = (v: string) => {
  mdValue.value = v;
  console.log(mdValue);
};
const onCodeChange = (v: string) => {
  codeValue.value = v;
  console.log(codeValue);
};
</script>
