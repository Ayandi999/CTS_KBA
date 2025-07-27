import React from 'react';
class Posts extends React.Component{
     constructor(props){
          super(props);
          this.state = {
               posts: []
          };
          
     }
     loadPosts(){
           fetch('https://jsonplaceholder.typicode.com/posts')
    .then(response => response.json())
    .then(data => {
      this.setState({ posts: data });  // update state with fetched posts
    })
    .catch(error => {
      console.error('Error fetching posts:', error);
    });
     }
     componentsDidMount(){
          this.loadPosts();
     }
     render(){
          return (
      <div>
        <h1>Posts</h1>
        <ul>
          {this.state.posts.map(post => (
            <li key={post.id}>{post.title}</li>
          ))}
        </ul>
      </div>
    );
     }
     componentDidCatch(error,info){
          console.error("Error in Posts component:", error, info);
     }
}
export default Posts;