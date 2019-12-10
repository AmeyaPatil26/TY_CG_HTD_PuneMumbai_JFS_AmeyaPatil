import { Component, OnInit } from '@angular/core';
import { Movie } from '../movie';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {
  movies: Movie[]=[
    {
      name:'Captain America',
      imgURL:'https://cdn.pixabay.com/photo/2019/03/07/14/59/captain-4040351__340.jpg',
      rating:4.5,
      spec:'Horror Movie'
    },{
      name:'Joker',
      imgURL:'https://cdn.pixabay.com/photo/2017/08/28/00/01/thejoker-2688077__340.jpg',
      rating:4.5,
      spec:'Horror Movie'
  },
  {
    name:'War of WorldZ',
    imgURL:'https://cdn.pixabay.com/photo/2016/11/15/07/09/photo-manipulation-1825450__340.jpg',
    rating:4.5,
    spec:'Entertainment Movie'
    },
    {
      name:'Power',
      imgURL:'https://image.shutterstock.com/image-photo/silhouette-military-soldier-officer-weapons-260nw-282908756.jpg',
      rating:4.5,
      spec:'Vampire Movie'
      },

    { name:'Spider-Man',
    imgURL:'https://cdn.pixabay.com/photo/2019/04/08/16/27/spiderman-4112322__340.jpg',
    rating:4.5,
    spec:'Family Entertainment Movie'
    },
    {
      name:'Iron-Man',
      imgURL:'https://cdn.pixabay.com/photo/2019/05/31/02/08/iron-man-4241268__340.jpg',
      rating:4.5,
      spec:'Com-Movie'
    },
    {
      name:'Thor',
      imgURL:'https://cdn.pixabay.com/photo/2019/05/24/10/09/thor-4225949__340.jpg',
      rating:4.5,
      spec:'Action Movie'
    },
    {
      name:'Avenger EndGame',
      imgURL:'https://cdn.pixabay.com/photo/2019/05/10/18/21/thanos-4194122__340.png',
      rating:4.5,
      spec:'Comedy Movie'
    },
    {
      name:'Twilight',
      imgURL:'https://cdn.pixabay.com/photo/2016/07/02/12/21/eclipse-1492818__340.jpg',
      rating:4.5,
      spec:'Horror Movie'
    },
    {
      name:'Stree',
      imgURL:'https://cdn.pixabay.com/photo/2017/06/29/00/10/movie-poster-2452656__340.jpg',
      rating:4.5,
      spec:'Horror Comedy Movie'
    }];
    selectedMovie: Movie = this.movies[0];
  constructor() {}
  selectMovie(movie){
    this.selectedMovie=movie;
  }

  ngOnInit() {
  }

}
