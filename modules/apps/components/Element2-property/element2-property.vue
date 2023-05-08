<template>
  <a-row class="mb-2">
    <a-col
      class="mb-2"
      :span="24"
    >
      <a-form-item label="sectionTitle">
        <a-input
          v-model:value="component.sectionTitle"
          size="small"
        />
      </a-form-item>
    </a-col>
  </a-row>
  <a-row class="mb-2">
    <a-col
      class="mb-2"
      :span="24"
    >
      <a-form-item label="title">
        <a-input
          v-model:value="component.items.title"
          size="small"
        />
      </a-form-item>
    </a-col>
  </a-row>
       
  <a-row class="mb-2">
    <a-col
      class="mb-2"
      :span="24"
    >
      <a-form-item label="subtitle">
        <a-input
          v-model:value="component.items.subtitle"
          size="small"
        />
      </a-form-item>
    </a-col>
  </a-row>
  <a-upload
    v-model:file-list="fileList"
    name="avatar"
    list-type="picture-card"
    class="avatar-uploader"
    :show-upload-list="false"
    action="http://localhost:8081/assets/svg"
    :before-upload="beforeUpload"
    @change="handleChange"
  >
    <img
      v-if="coverImageUrl"
      :src="component.items.coverImageUrl"
    >
    <div v-else>
      <loading-outlined v-if="loading" />
      <plus-outlined v-else />
      <div class="ant-upload-text">
        Upload
      </div>
    </div>
  </a-upload>
</template>

<script lang="ts">
import nav from '~~/assets/data/nav.json';
import { PlusOutlined, LoadingOutlined } from '@ant-design/icons-vue';
import { message } from 'ant-design-vue';
import { defineComponent, ref } from 'vue';
import  type { UploadChangeParam, UploadProps } from 'ant-design-vue';

function getBase64(img: Blob, callback: (base64Url: string) => void) {
  const reader = new FileReader();
  reader.addEventListener('load', () => callback(reader.result as string));
  reader.readAsDataURL(img);
}

export default defineComponent({
    components: {
    LoadingOutlined,
    PlusOutlined,
   
  },
 
  props: {
    block: {
      type: Object,
      default: () => ({}),
      required: true
    }
  },
  emits: ['update:block'],

  
    


  setup(props) {
      const component = computed({
          get: () => props.block,
          set: () =>"",
          
      });
      const fileList = ref([]);
    const loading = ref<boolean>(false);
    const coverImageUrl = ref<string>('');

    const handleChange = (info: UploadChangeParam) => {
      if (info.file.status === 'uploading') {
        loading.value = true;
        return;
      }
      if (info.file.status === 'done') {
        // Get this url from response in real world.
        getBase64(info.file.originFileObj, (base64Url: string) => {
          coverImageUrl.value = base64Url;
          loading.value = false;
        });
      }
      if (info.file.status === 'error') {
        loading.value = false;
        message.error('upload error');
      }
    };

    const beforeUpload = (file: UploadProps['fileList'][number]) => {
      const isJpgOrPng = file.type === 'image/jpeg' || file.type === 'image/png';
      if (!isJpgOrPng) {
        message.error('You can only upload JPG file!');
      }
      const isLt2M = file.size / 1024 / 1024 < 2;
      if (!isLt2M) {
        message.error('Image must smaller than 2MB!');
      }
      return isJpgOrPng && isLt2M;
    };
      return { component,nav,fileList,
      loading,
      coverImageUrl,
      handleChange,
      beforeUpload,}
    

  }
    


});
</script> 
<style scoped>
.avatar-uploader > .ant-upload {
  width: 50px;
  height: 50px;
}
.ant-upload-select-picture-card i {
  font-size: 32px;
  color: #999;
}

.ant-upload-select-picture-card .ant-upload-text {
  margin-top: 8px;
  color: #666;
}
</style>