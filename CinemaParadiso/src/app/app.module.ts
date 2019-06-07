import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';


import { AppComponent } from './app.component';
import { MainComponent } from './main/main.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { MovieTableComponent } from './movie-table/movie-table.component';


const appRoutes: Routes = [
  {path: 'main', component: MainComponent},
  {path: '', redirectTo: 'main', pathMatch: 'full'},
  {path: '**', component: PageNotFoundComponent}

];

@NgModule({
  declarations: [
    AppComponent,
    MainComponent,
    PageNotFoundComponent,
    MovieTableComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule.forRoot(
      appRoutes,
      { enableTracing: true } // <-- debugging purposes only
    )
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
