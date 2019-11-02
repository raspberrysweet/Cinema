import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MovieShwotimeComponent } from './movie-shwotime.component';

describe('MovieShwotimeComponent', () => {
  let component: MovieShwotimeComponent;
  let fixture: ComponentFixture<MovieShwotimeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MovieShwotimeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MovieShwotimeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
