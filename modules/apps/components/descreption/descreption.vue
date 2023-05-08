<template>
  <div class="headings">
    <img
      class="cover"
      src="https://data.pixiz.com/output/user/frame/preview/api/big/8/1/9/1/621918_2adbf.jpg"
    >
    <span class="title">John Doe</span>
    <div class="section">
      <a-rate
        class="rate "
        :value="5"
        disabled
      />

      <span class="value"> 01 April 2021</span>
    </div>
  </div>

  <div>
    <div
      class="card-text"
      :class="{ 'expanded': isExpanded }"
    >
      {{ isExpanded ? text : truncatedText }}
      <div>
        <span
          v-if="!isExpanded"
          class="read-more"
          @click="expandText"
        >Read more</span>
      </div>
    </div>
  </div>
</template>
<script lang="ts">
export default {
  name: 'Descreption',
  
  props: {
  component: {
  type: Object,
  required: true
  }
  },
  data() {
    return {
      isExpanded: false,
      text: "Lorem ipsum dolor sit amet consectetur adipisicing elit. Similique rem nulla delectus",
                            
      truncatedText: "Lorem ipsum dolor sit"
    };
  },
  methods: {
    expandText() {
      this.isExpanded = true;
    }
  }
};


</script>
<style lang="scss" scoped>

    .card-text {
  font-size: 1rem;
  line-height: 1.25rem;
  font-stretch: normal;
  font-style: normal;
  letter-spacing: -.01rem;
  overflow: hidden;
  text-overflow: ellipsis;
  word-break: break-word;
  max-height: 2.5rem; /* Hauteur maximale de deux lignes */
  position: relative;
  color: grey;
}

.card-text.expanded {
  max-height: none; /* Affiche le texte complet lorsque la classe 'expanded' est présente */
}

.read-more {
  color: rgb(0, 0, 0);
  cursor: pointer;
/* Pour que l'image de couverture se positionne par-dessus les autres éléments */
             
}
.cover {
    width: 2vw;
    height: 2vw;
    border-radius: 50%;
    margin-right:1vw;
}

.rate  {
    margin-bottom:0.1vw;
    padding-top: 0.1vw;
    margin-left: 3vw;
  font-size: 12px; /* Modifier la taille de la police pour ajuster la taille des étoiles */
}
.value{
    font-size: 12px;
    color: grey;
}

</style>