<template>
  <div id="userLoginView">
    <h2 style="text-align: center">用户登录</h2>
    <a-form
      style="max-width: 480px; margin: 0 auto"
      label-align="left"
      auto-label-width
      :model="form"
      @submit="handleSubmit"
    >
      <a-form-item field="userAccount" label="账号">
        <a-input
          v-model="form.userAccount"
          placeholder="请输入账号"
          class="rounded-input"
        />
      </a-form-item>
      <a-form-item field="userPassword" tooltip="密码不少于 8 位" label="密码">
        <a-input-password
          v-model="form.userPassword"
          placeholder="请输入密码"
          class="rounded-input"
        />
      </a-form-item>
      <a-form-item>
        <a-button
          type="primary"
          html-type="submit"
          style="width: 120px"
          class="rounded-input"
        >
          登录
        </a-button>
      </a-form-item>
    </a-form>
  </div>
</template>

<style scoped>
.rounded-input {
  border-radius: 8px; /* 调整圆角大小，根据需要修改 */
  /* 可选：增加一些其他样式 */
  padding: 10px;
  border: 1px solid #ccc;
  transition: border-color 0.3s;
}

.rounded-input:focus {
  border-color: #1890ff; /* 聚焦时的边框颜色，根据需要修改 */
}
</style>

<script setup lang="ts">
import { reactive } from "vue";
import { UserControllerService, UserLoginRequest } from "../../../generated";
import message from "@arco-design/web-vue/es/message";
import { useRouter } from "vue-router";
import { useStore } from "vuex";

/**
 * 表单信息
 */
const form = reactive({
  userAccount: "",
  userPassword: "",
} as UserLoginRequest);

const router = useRouter();
const store = useStore();

/**
 * 提交表单
 * @param data
 */
const handleSubmit = async () => {
  const res = await UserControllerService.userLoginUsingPost(form);
  // 登录成功，跳转到主页
  if (res.code === 0) {
    await store.dispatch("user/getLoginUser");
    router.push({
      path: "/",
      replace: true,
    });
  } else {
    message.error("登陆失败，" + res.message);
  }
};
</script>
