
<template>
  <a-layout>
    <a-layout-header :style="{ background: 'linear-gradient(135deg, #0143a3, #0273d4)'}">
      <a-row class="oum">
        <a-col
        >
          <font-awesome-icon
            :icon="['fass', 'cubes']"
            size="2xl"
            style="color: #07090d;"
          />
          <span :style=" { color: '#ffffff'}">  APP BUILDER </span>
        </a-col>
       
        <a-col
         
          class="text-end p-0"
        >
          <a-button
            class="btn-fix"
            @click="onPreview"
          >
            <font-awesome-icon
              :icon="['fas', 'eye']"
              size="lg"
              style="color: #000000;"
            />
            <span>Preview</span>
          </a-button>
          <a-button
            class="btn-fix ms-2"
            @click="generatemustach"
          >
            <a-icon
              type="file-code"
              class="me-2"
            />
            <span>generatemustach</span>
          </a-button>
          <a-button
            class="btn-fix ms-2 me-2"
            @click="generateJson"
          >
            <a-icon
              type="code"
              class="me-2"
            />
            <span>Generate JSON</span>
          </a-button>
        </a-col>
      </a-row>
    </a-layout-header>
    <a-layout>
      
      <UiTemplatesMenu :nav-tree="nav">
        <slot />
      </UiTemplatesMenu>
      <a-layout-content :style="{ margin: '10px 16px', padding: '10px', background: '#fff', minHeight: '280px', width: '430px' }">
        <UiModalConfirmationModal
          :content="'Are you sure, that you want to delete this element?'"
          :is-visible="modalConfirm"
        />
        <UiModalConfirmationModal
          :content="jsoncontent"
          :is-visible="generatejson"
        />
        
       
    
        
        <div class="form-body flex-grow-1">
          <div
            :class="[
              'email-body',
              'd-flex',
              'content-droppable-zone',
              'dndList',
              //dragStartClass,
              'align-items-start'
            ]"
            :style="{
              'font-family': 'Helvetica, sans-serif',
              'font-size': '16px',
              'background-color': '#f5f5f5',
              'padding': '15px'
        
            }"
          >
            <div
              class="form-container mx-auto"
              :style="{
                width: '600px',
                'background-color': '#ffffff',
                'border-radius': '8px',
                padding: '15px',
                border: 'solid 1px #ced4da'
              }"
            >
              <AddedComponents
                :added-components="added_components"
                @setSelectedComponent="setSelectedComponent"
              />
            </div>
          </div>
        </div>
      </a-layout-content>




      <a-layout-sider :style="{ background:'#fff',position: 'static', padding: '0'}">
        <div
          class="panel-options property-column"
        >
          <div class="property-column-inner" />
         

          <component
            :is="selectedComponent.componentProperty"
            v-if="selectedComponent"
            v-model:block="selectedComponent"
          />
        </div>
      </a-layout-sider>
    </a-layout>
  </a-layout>
</template>

<script lang="ts">

import nav from '~~/assets/data/nav.json';
import Button from '../components/Button/Button.vue';
import ButtonProperty from '../components/Button-property/Button-property.vue';
import AddedComponents from '../components/AddedComponents/AddedComponents.vue';
import element2 from '../components/Element2/element2.vue';
import element2Property from '../components/Element2-property/element2-property.vue';
import card from '../components/Card/card.vue';
import cardProperty from '../components/Card-property/card-property.vue';
import mustache from '~~/assets/data/mustache.json';
import ratings from '../components/ratings/ratings.vue';

    export default {
  components: { Button, ButtonProperty, AddedComponents,element2Property,element2,card ,cardProperty, ratings  },
  setup(){

    const added_components = ref([])
    
    const modal = ref(false)
    const modalConfirm = ref(false)
    const generatejson = ref(false)
    const jsoncontent = ref("")
   

    return {nav, added_components, modalConfirm , modal, generatejson, jsoncontent, mustache}

      
  }, 
  data() {
  return {
    selectedComponent : ref(null)
    
  };
},

  onMounted () {
    return {
      
    };
  },

  
methods: {


  onDragOver(event) {
    event.target.classList.add('dndPlaceholder');
  },

  setSelectedComponent(component) {
      
      this.resetAllSelectedState();
      component.isSelected = true;
      this.selectedComponent = component;
      console.log(this.added_components)

      
    },

  resetAllSelectedState() {
    // reset isSelected property of all components
  },

  generateJson(event) {
  const organisms = {};
  
  for (let index = 0; index < this.added_components.length; index++) {
    const org = this.added_components[index];
    const resultat = mustache.filter(mustache => mustache.organismName === org.organismName);

    organisms[`org${index + 1}`] = {
      sectionTitle: org.sectionTitle,
      organismName: org.organismName,
      items: [`{{#organisms.org${index + 1}.items}}`, resultat,
       `{{^comma}},{{/comma}} {{/organisms.org${index + 1}.items}}`]
    };
  }
  
  this.generatejson = true;
  this.jsoncontent = JSON.stringify({ screenName: "SHOP_SERVICES", organisms });
},
  
generatemustache(event) {
  const organisms = this.added_components.map((org,index) => {
    return {
      [ ` "items":[{{#organisms.org${index+1}.items}}` ]:org }  })
   
  },
  
  deleteComponent(event) {
    this.modalConfirm = true
  }
},

};




// /selectedComponent!: null | ElementInterface;


/*public activeTab = 2;

 function onDrop(e: DragEvent, list){
   
  component = JSON.parse(e.dataTransfer!.getData('component'))
 

    if (!['copy', 'move'].includes(e.dataTransfer!.dropEffect)) {
      return false;
    }

  let index = e..index;

  if (typeof index === 'undefined') {
    index = list.length;
  }

  // Reset selected state
  this.resetAllSelectedState();
  component = JSON.parse(event.data)
  const component = _.cloneDeep(event.data);
  component.isSelected = true;
  component.id = UUID.UUID();

  if (
    [
      'radios',
      'dropdown',
      'input',
      'checkbox',
      'textarea',
      'uploader',
    ].includes(component.machineName)
  ) {
    component.element.field_name = ${component.machineName}-${component.id.split('-').shift()};
  }

  if (
    component.machineName === 'radios' ||
    component.machineName === 'dropdown'
  ) {
    for (let option of component.element.options) {
      option.id = UUID.UUID();
    }
  }

  if (!component.hasOwnProperty('componentSettings')) {
    component.componentSettings = {...this.componentSettings};
  }

  this.selectedComponent = component;
  list.splice(index, 0, component);

  this.activeTab = 1;

  return true;
},

resetAllSelectedState() {
  this.subscriptionForm.content_dnd.added_components.forEach((c) => {
    c.isSelected = false;
  });
}

*/

</script>



  
<style scoped>
.oum {
row-gap: 0px;
    display: flex;
    justify-content: space-between;
  }
  .email-body {
  height: calc(100vh - 100px) !important;
  overflow-y: auto;
  overflow-y: overlay;
}

.property-column {
  padding: 10px 15px;
  font-size: 14px;
  background: #fff;
}
.subscription-form-content-nav {
background: linear-gradient(135deg, #0143a3, #0273d4);
height: 64px;
}

.subscription-form-content-nav a {
color: #fff !important;
text-decoration: none;
transition: all 0.2s;
}

.subscription-form-content-nav a:hover {
color: #fff;
}

.subscription-form-content-nav .btn-fix {
background: #fff;
font-size: px2Rem(14);
 margin-top: -7px;
}

.subscription-form-content-nav .btn-fix:hover {
color: #000;
}

.subscription-form-content-nav .btn-fix.disabled,
.subscription-form-content-nav .btn-fix:disabled {
color: #000;
background: #e9e9e9;
opacity: 1;
}


</style>

