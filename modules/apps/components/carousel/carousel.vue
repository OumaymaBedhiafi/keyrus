
<template>
  <div>
    <h2 class="sectionTitle">
      {{ component.sectionTitle }}
    </h2>
    <div class="col-md-12">
      <div class="cards-container">
        <div class="card">
          <img
            src="https://imgproxy.apps.fr01.paas.diod.orange.com/1e4483006c56f05f1b42af2f2b61765f64b8a074bf993922dd5b4bca78f49280683beb368308b7f76d522027b071a25e6d4b26138686b43e1faa4be4c9b674ea/fill/340/147/sm/0/plain/https://mobile-digistore.apps.fr01.paas.diod.orange.com/digistore/assets/medias/tn/service/image/jpeg/tn-tpay-shahid-ca640256-4bec-4914-aa14-bfcecafe7b6a.jpeg"
            class="card-img-top"
            alt="..."
          >
        </div>
      
        <div class="card">
          <img
            src="https://imgproxy.apps.fr01.paas.diod.orange.com/1e4483006c56f05f1b42af2f2b61765f64b8a074bf993922dd5b4bca78f49280683beb368308b7f76d522027b071a25e6d4b26138686b43e1faa4be4c9b674ea/fill/340/147/sm/0/plain/https://mobile-digistore.apps.fr01.paas.diod.orange.com/digistore/assets/medias/tn/service/image/png/tn-tpay-jawwytv-d6f71922-3b1e-4cbf-8546-ba3a5943e0d9.png"
            class="card-img-top"
            alt="..."
          >
        </div>
        <div class="card">
          <img
            src="https://imgproxy.apps.fr01.paas.diod.orange.com/1e4483006c56f05f1b42af2f2b61765f64b8a074bf993922dd5b4bca78f49280683beb368308b7f76d522027b071a25e6d4b26138686b43e1faa4be4c9b674ea/fill/340/147/sm/0/plain/https://mobile-digistore.apps.fr01.paas.diod.orange.com/digistore/assets/medias/cm/service/image/jpeg/63693c86-399c-40d0-969a-04aef5801a8a.jpeg"
            class="card-img-top"
            alt="..."
          >
        </div>
        <div class="card">
          <img
            src="https://imgproxy.apps.fr01.paas.diod.orange.com/1e4483006c56f05f1b42af2f2b61765f64b8a074bf993922dd5b4bca78f49280683beb368308b7f76d522027b071a25e6d4b26138686b43e1faa4be4c9b674ea/fill/340/147/sm/0/plain/https://mobile-digistore.apps.fr01.paas.diod.orange.com/digistore/assets/medias/cm/service/image/jpeg/3e0a5c31-59b4-476f-915d-9a5f83726cd0.jpeg"
            class="card-img-top"
            alt="..."
          >
        </div>
        <div class="card">
          <img
            src="https://imgproxy.apps.fr01.paas.diod.orange.com/1e4483006c56f05f1b42af2f2b61765f64b8a074bf993922dd5b4bca78f49280683beb368308b7f76d522027b071a25e6d4b26138686b43e1faa4be4c9b674ea/fill/340/147/sm/0/plain/https://mobile-digistore.apps.fr01.paas.diod.orange.com/digistore/assets/medias/cm/service/image/jpeg/cm-digitalvirgo_ocm-youscribeproposeparorange-7c8a9841-84ca-4267-afff-fbbd57432683.jpeg"
            class="card-img-top"
            alt="..."
          >
        </div>
      </div>
    </div>
  </div>
</template>
  
<script>
export default {
  name: 'Carousel',
  
  props: {
  component: {
  type: Object,
  required: true
  }
  },

}
</script>
  
  <style scoped>
   .sectionTitle {
    
     font-size: 1.5vw;
     font-weight: bold;
    margin-bottom:1vw ;
     margin-left:1Vw ;
      }
.card {
    padding: 0;
    min-width: 17rem;
    width: 17rem;
    height: 14rem;
}

.card-img-top {
    width: 100%;
    height: 65%;
}






.cards-container {
    display: flex;
    gap: 20px;
    margin-left: 10px;
    overflow: hidden;
    overflow-x: scroll;
}

::-webkit-scrollbar {
    width: 1em;
    height: 0.4em;
}




  


  </style>
  