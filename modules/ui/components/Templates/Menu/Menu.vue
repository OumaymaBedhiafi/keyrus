<template>
  <div class="drag">
    <draggable
      :clone="clone"
      
      :list="navTree"
      :sort="false"
      :group="{ name: 'oum', pull: 'clone', put: false }"
      item-key="id"
    >
      <template
        #item="{ element: nav }"
      >
        <div
          v-if="nav.organismName !=='section'"
        >
          <a-popover placement="right">
            <template #content>
              <div
         
          
                class="icon-container" 
              >
                <img
                  :src="navIcons[nav.image]"
                  class="nav__icon"
                >

                <span class="label-class"> {{ $t(nav.organismName) }} </span>
              </div>
            </template>
          </a-popover>
        </div>
              
         
       











        <div v-if="nav.organismName === 'section'">
          <a-popover placement="right">
            <template #content>
              <draggable
                :clone="clone"
                 
                :list="nav.sections"
                :sort="false"
                :group="{ name: 'oum', pull: 'clone', put: false }"
                item-key="id1"
              >
                <template #item="{ element }">
                  <div class="nav-sections">
                    <div class="nav-sections__item">
                      <img
                        :src="navIcons[element.image]"
                        class="nav-sections__icon"
                      >
                    </div>
                  </div>
                </template>
              </draggable>
            </template>
            <template #title>
              <span>Add New Section</span>
            </template>
            <div class="icon-container">
              <img
                :src="navIcons[nav.image]"
                class="nav__icon"
              >
              <span class="label-class">{{ $t(nav.organismName) }}</span>
            </div>
          </a-popover>
        </div>
      </template>
    </draggable>
  </div>
</template>
    </draggable>
  </div>
</template>

<script lang="ts" setup>
import { v4 as uuidv4 } from 'uuid';
import { cloneDeep } from 'lodash';
import nav from '~~/assets/data/nav.json';

console.log('helldddddddddddo');

defineProps({
  collapsed: {
    type: Boolean,
  },
  navTree: {
    type: Array,
    default: () => {
      return [];
    },
  },
});

const clone = (component) => {
  component.uuid = uuidv4();
  return cloneDeep(component);
};

function onDragOver(event): void {
  event.target.classList.add('dndPlaceholder');
}

function onDragStart(event: DragEvent) {
  // event.dataTransfer.dropEffect = 'move';
  //event.dataTransfer.effectAllowed = "move";
  //event.dataTransfer?.setData('component', JSON.stringify(component))
  //  this.$emit('onDragstart', 'bg-light');
  //},
  //onDragEnd(event: DragEvent) {
  //this.$emit('onDragEnd');
}
</script>

<style lang="less" scoped>
@import 'ant-design-vue/lib/menu/style/index.less';
</style>

<style lang="scss" scoped>
@import '@UI/assets/scss/variable';

.icon-container {
  border: 1px solid rgb(255, 255, 225);
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  background: rgb(255, 255, 255);
  padding: 50px 10px 60px 10px;
}

.nav-sections {
  display: grid;
  grid-template-columns: repeat(auto-fit, minmax(50px, 1fr));
  grid-gap: 10px;
  justify-items: center;
  align-items: center;
  margin-top: 10px;
}

.nav-sections__item {
  display: flex;
  justify-content: center;
}

.nav-sections__icon {
  width: 60px;
  height: 30px;
}
.nav__icon {
  width: 80px;
  height: 40px;
  line-height: 1;
}

.label-class {
  font-size: 11px;
  color: #595c5f;
  line-height: 1;
}

.menu.ant-menu-gray {
  background-color: #f7f7f7;
}
.menu-item {
  display: inline-block;
  margin-right: 10px; /* vous pouvez ajuster ce nombre pour définir l'espace entre les éléments de menu */
  height: 80px !important;
}

// .email-structure {
//   min-height: 100%;
// }
.drag{
  display:flex;
  flex-direction: column;
  overflow-y: scroll;
  height: 100vh;
}
</style>
