import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';


import { AppComponent } from './app.component';
import { MainComponent } from './main/main.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { MovieShwotimeComponent } from './movie-shwotime/movie-shwotime.component';
import { AddMovieComponent } from './add-movie/add-movie.component';
import { MovieListComponent } from './movie-list/movie-list.component';
import { FilterMoviesComponent } from './filter-movies/filter-movies.component';
import { LoginComponent } from './login/login.component';
import { AuthenticationService } from './security/authentication.service';
import {CanActivateAdminService } from './security/can-activate-admin.service';




const appRoutes: Routes = [
  {path: 'main', component: MainComponent},
  {path: '', redirectTo: 'main', pathMatch: 'full'},
  {path: 'movie-showtime/:id', component: MovieShwotimeComponent},
  {path: 'add-movie', component: AddMovieComponent},
  {path: '**', component: PageNotFoundComponent}

];

@NgModule({
  declarations: [
    AppComponent,
    MainComponent,
    PageNotFoundComponent,
    MovieShwotimeComponent,
    AddMovieComponent,
    MovieListComponent,
    FilterMoviesComponent,
    LoginComponent,
    AuthenticationService,
   ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule.forRoot(
      appRoutes,
      { enableTracing: true }
    )
  ],
  providers: [
    AuthenticationService,
    CanActivateAdminService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
