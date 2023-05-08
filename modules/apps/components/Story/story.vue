
 

<template>
  <div class="cards-container">
    <div class="container">
      <img
        class="thumbnail"
        src="https://play-lh.googleusercontent.com/0rgPYj0GwZ6txpYZrzoMdhwzqg7vY6C9B-Ol7jlaz-Ox2rgpD4Tr82ZgDqkirrEohbGm"
      >
      <div class="headings">
        <span class="title">Netflix</span>
      </div>
    </div>
    <div class="container">
      <img
        class="thumbnail"
        src="https://play-lh.googleusercontent.com/0rgPYj0GwZ6txpYZrzoMdhwzqg7vY6C9B-Ol7jlaz-Ox2rgpD4Tr82ZgDqkirrEohbGm"
      >
      <div class="headings">
        <span class="title">Netflix</span>
      </div>
    </div>
    <div class="container">
      <img
        class="thumbnail"
        src="https://play-lh.googleusercontent.com/0rgPYj0GwZ6txpYZrzoMdhwzqg7vY6C9B-Ol7jlaz-Ox2rgpD4Tr82ZgDqkirrEohbGm"
      >
      <div class="headings">
        <span class="title">Netflix</span>
      </div>
    </div>
    <div class="container">
      <img
        class="thumbnail"
        src="https://play-lh.googleusercontent.com/0rgPYj0GwZ6txpYZrzoMdhwzqg7vY6C9B-Ol7jlaz-Ox2rgpD4Tr82ZgDqkirrEohbGm"
      >
      <div class="headings">
        <span class="title">Netflix</span>
      </div>
    </div>
    <div class="container">
      <img
        class="thumbnail"
        src="https://play-lh.googleusercontent.com/0rgPYj0GwZ6txpYZrzoMdhwzqg7vY6C9B-Ol7jlaz-Ox2rgpD4Tr82ZgDqkirrEohbGm"
      >
      <div class="headings">
        <span class="title">Netflix</span>
      </div>
    </div>
    <div class="container">
      <img
        class="thumbnail"
        src="https://play-lh.googleusercontent.com/0rgPYj0GwZ6txpYZrzoMdhwzqg7vY6C9B-Ol7jlaz-Ox2rgpD4Tr82ZgDqkirrEohbGm"
      >
      <div class="headings">
        <span class="title">Netflix</span>
      </div>
    </div>
    <div class="container">
      <img
        class="thumbnail"
        src="https://play-lh.googleusercontent.com/0rgPYj0GwZ6txpYZrzoMdhwzqg7vY6C9B-Ol7jlaz-Ox2rgpD4Tr82ZgDqkirrEohbGm"
      >
      <div class="headings">
        <span class="title">Netflix</span>
      </div>
    </div>
    <div class="container">
      <img
        class="thumbnail"
        src="https://play-lh.googleusercontent.com/0rgPYj0GwZ6txpYZrzoMdhwzqg7vY6C9B-Ol7jlaz-Ox2rgpD4Tr82ZgDqkirrEohbGm"
      >
      <div class="headings">
        <span class="title">Netflix</span>
      </div>
    </div>
    <div class="container">
      <img
        class="thumbnail"
        src="https://play-lh.googleusercontent.com/0rgPYj0GwZ6txpYZrzoMdhwzqg7vY6C9B-Ol7jlaz-Ox2rgpD4Tr82ZgDqkirrEohbGm"
      >
      <div class="headings">
        <span class="title">Netflix</span>
      </div>
    </div>
    <div class="container">
      <img
        class="thumbnail"
        src="https://play-lh.googleusercontent.com/0rgPYj0GwZ6txpYZrzoMdhwzqg7vY6C9B-Ol7jlaz-Ox2rgpD4Tr82ZgDqkirrEohbGm"
      >
      <div class="headings">
        <span class="title">Netflix</span>
      </div>
    </div>
    <div class="container">
      <img
        class="thumbnail"
        src="https://play-lh.googleusercontent.com/0rgPYj0GwZ6txpYZrzoMdhwzqg7vY6C9B-Ol7jlaz-Ox2rgpD4Tr82ZgDqkirrEohbGm"
      >
      <div class="headings">
        <span class="title">Netflix</span>
      </div>
    </div>
  </div>
</template>




  <script>
    export default {
    name: 'Story',
  
    props: {
    component: {
    type: Object,
    required: true
    }
    },

    }
  </script>
      <style lang="scss" scoped>
        .title {
 padding: 0.9VW;
 font-size: 1VW;
 margin-bottom:VW;
} 
 
  .container {
 
 padding: 0.6VW;
    .thumbnail {
 width: 5vw;
 height: 5vw;
 padding: 0.1VW;
 border-radius: 80%;
 border: 1.5px solid rgb(151, 146, 196);

    }}
    .cards-container {
    display: flex;
    gap: 0.4vw;
    margin-left: 10px;
    margin: auto;
    overflow: auto;
    scroll-snap-type: x mandatory;
    scroll-snap-align: start;
    }

    ::-webkit-scrollbar {
    width: 1em;
    height: 0.4em;
   
    }



  </style>
  
