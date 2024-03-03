<template>
  <div id="app">
    <template v-if="route.path.startsWith('/user')">
      <router-view />
    </template>
    <template v-else>
      <BaiscLayouts />
    </template>
  </div>
</template>

<style>
#app {
}
</style>
<script setup lang="ts">
import BaiscLayouts from "@/layouts/BaiscLayouts.vue";
import { useRoute } from "vue-router";
import { useStore } from "vuex";
import { onMounted } from "vue";

const route = useRoute();

const doInit = () => {
  console.log("hello");
};

onMounted(() => {
  doInit();
});
</script>
