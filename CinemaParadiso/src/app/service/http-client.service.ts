import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Movie, GenreInterface } from '../model';
// import { of } from 'rxjs/observable/of';
// import { _throw } from 'rxjs/observable/throw';


@Injectable({
  providedIn: 'root'
})
export class HttpClientService {

  constructor(private http: HttpClient) { }

  public getMovies(title?: string, genre?: string): Observable<Movie[]> {
    console.log('servis pozvan');
    let params: HttpParams = new HttpParams();
    if (title !== '') {
      params = params.append('title', title.toString());
    }
    if (genre !== '') {
      params = params.append('genre', genre.toString());
    }
    console.log(title);
    console.log(genre);
    return  this.http.get<Movie[]>('/api/movies', {params});

    }
/*return this.http.get<Record[]>(this.path, {params})
			.catch((error: any) =>
				Observable.throw(error.message || 'Server error')
			);
*/
  public getMovie(id: number): Observable<Movie> {
    return this.http.get<Movie>(`/api/movies/${id}`);
  }

  public getGenres(): Observable<GenreInterface[]> {
    return this.http.get<GenreInterface[]>('/api/genres');
  }
  public saveMovie(movie: Movie) {
    const httpOptions = {
      headers: new HttpHeaders({ 'Content-Type':  'application/json'})};
    return this.http.post('/api/movies', JSON.stringify(movie), httpOptions);
  }
}
