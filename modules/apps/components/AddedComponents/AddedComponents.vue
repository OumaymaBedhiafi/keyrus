<template>
  <draggable
    class="dragArea list-group"
    :list="addedComponents"
    group="oum"
  >
    <template #item="{ element }">
      <div
        class="list-group-item selected-component"
        :class="{ 'is-selected': element.isSelected }"
      >
        <component
          :is="element.organismName"
          v-if="element.organismName !== 'section'"
          :component="element"
          item-key="element.uuid"
          @click="setSelectedComponent(element)"
        />

        <a-row
          v-if="element.column === '2-1-3' && element.organismName === 'section'"
          :gutter="0"
          type="flex"
          justify="start"
        >
          <a-col
            :span="4"
            class="border border-primary border-dashed section-area not-added-component"
          >
            hello
            <AddedComponents
              :added-components="element.addedComponents[0]"
              @setSelectedComponent="setSelectedComponent"
            />
          </a-col>

          <a-col
            :span="8"
            class="border border-primary border-dashed section-area not-added-component"
          >
            <AddedComponents
              :added-components="element.addedComponents[1]"
              @setSelectedComponent="setSelectedComponent"
            />
          </a-col>
        </a-row>

        <a-row
          v-else-if="element.column === '2-3-1' && element.organismName === 'section'"
          :gutter="0"
          type="flex"
          justify="start"
        >
          <a-col
            :span="8"
            class="border border-primary border-dashed section-area not-added-component"
          >
            <AddedComponents
              :added-components="element.addedComponents[0]"
              @setSelectedComponent="setSelectedComponent"
            />
          </a-col>

          <a-col
            :span="4"
            class="border border-primary border-dashed section-area not-added-component"
          >
            <AddedComponents
              :added-components="element.addedComponents[1]"
              @setSelectedComponent="setSelectedComponent"
            />
          </a-col>
        </a-row>

        <a-row
          v-else
          :gutter="0"
          type="flex"
        >
          <a-col
            v-for="(addedComponent, i) in element.addedComponents"
            :key="i"
            :span="element.span"
            :flex="element.flex"
            class="border border-primary border-dashed section-area not-added-component"
          >
            hello
            <AddedComponents
              :added-components="addedComponent"
              @setSelectedComponent="setSelectedComponent"
            />
          </a-col>
        </a-row>

        <UiModalConfirmationModal
          :content="'Are you sure, that you want to delete this element?'"
          :is-visible="modalConfirm"
        />

        <div class="container-action-wrapper">
          <a-tooltip placement="bottom">
            <button
              class="btn btn-sm btn-danger"
              @click="deleteComponent"
            >
              <font-awesome-icon :icon="['fas', 'trash']" />
            </button>
          </a-tooltip>
        </div>
      </div>
    </template>
    {{}}
  </draggable>
</template>

<script lang="ts">
import section from '../Section/section.vue';
import Button from '../Button/Button.vue';
import card from '../Card/card.vue';
import templ from '../Templ/templ.vue';
import element1 from '../Element1/element1.vue';
import ratings from '../ratings/ratings.vue';
import carousel from '../carousel/carousel.vue';
import story from '../Story/story.vue';
import carousel1 from '../carousel1/carousel1.vue';
import element2 from '../Element2/element2.vue';
import carousel2 from '../carousel2/carousel2.vue';

import descreption from '../descreption/descreption.vue';
export default {
  components: { section, Button, card, templ, element1, story, element2,ratings,carousel,carousel1,carousel2, descreption },

  props: {
    addedComponents: {
      type: Object,
      required: true,
    },
  },

  emits: ['setSelectedComponent'],

  setup() {
    const modalConfirm = ref(false);

    return { modalConfirm };
  },

  onMounted() {
    return {};
  },

  methods: {
    setSelectedComponent(component) {
      this.$emit('setSelectedComponent', component);
    },

    deleteComponent(event) {
      console.log('******************************');
      this.modalConfirm = true;
    },
  },
};
</script>
<style scoped>
.border-dashed {
  border-style: dashed !important;
  min-height: 50px;
}

.property-column,
.content-droppable-zone {
  box-shadow: 0 0px 8px -6px #000;
}
.section-area.not-added-component:before {
  content: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABQAAAAUCAYAAACNiR0NAAABeElEQVQ4T6XUMUhWYRTG8Z80CkIULbqJBO4OQkFt0ZZrYhKuIYqIDjkIBZFRQxAEohA0CJpCg6ASRejgGJlBQZNDJDjZFMiB86ldv8970TPde99z/u/zPue8t8lRLKAb3/AB69jA/rGc0semQsZlDOEmvqIDa3hWFVwE1vhtGMETtOMR7uFXmcRGwFrdbIL/4BXmsXoatAzYiVH0J+Q53mKzEbQMGHWD2MIKmvE+Pa7LrAK8gdupNCDj+I6YihNRBRhFccSurL6UzRo4D/A1XuTRg7OMu9gtQqsqjDlcwqcETOcGX84KDN+28S4Bk3mTQul/0Uhha/oUNyfiYt6guI4R1/EUe/n+G2PYOe3IDyMBi1lU9CuaE3EHV/A4Xso8jCGewI96HcVVxMa9tfUyYNkgf8Qt/K0KjLxr6MFwQWWM0Vw253CpTGEt8UE24E1+6EMLXlbtcj3LZjCVvofa+/WSqiqM2gv4nJCw4d95gVEfP9uInw267gCfPEIV39dUhAAAAABJRU5ErkJggg==);
  display: block;
  text-align: center;
  margin-top: 20px;
}

.section-area.not-added-component:after {
  content: 'Drop Content Here';
  display: block;

  color: #666;
  text-align: center;
}
.property-column {
  padding: 10px 15px;
  font-size: 14px;
  background: #fff;
}

.not-selected-component {
  text-align: center;
  font-size: 12px;
  color: #ddd;
}
</style>
