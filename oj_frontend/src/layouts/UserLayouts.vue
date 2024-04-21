<template>
  <div id="userlayout">
    <a-layout style="min-height: 100vh">
      <a-layout-header class="header">
        <a-space>
          <img src="../assets/logo.png" class="logo" />
          <div>枫 OJ</div>
        </a-space>
      </a-layout-header>
      <a-layout-content class="content">
        <router-view />
      </a-layout-content>
      <a-layout-footer class="footer">Footer</a-layout-footer>
    </a-layout>
  </div>
</template>

<style scoped>
#userlayout {
  background: url("../assets/background.jpeg");
}

#userlayout .logo {
  width: 64px;
  height: 64px;
}

#userlayout .header {
  margin-bottom: 16px;
  margin-box: 16px;
}

#userlayout .content {
  margin-bottom: 16px;
  padding: 20px;
}

#userlayout .footer {
  background: #efefef;
  padding: 16px;
  position: sticky;
  bottom: 0;
  left: 0;
  right: 0;
  text-align: center;
}
</style>
<script></script>
