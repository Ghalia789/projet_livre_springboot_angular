import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListeGenresComponent } from './liste-genres.component';

describe('ListeGenresComponent', () => {
  let component: ListeGenresComponent;
  let fixture: ComponentFixture<ListeGenresComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ListeGenresComponent]
    });
    fixture = TestBed.createComponent(ListeGenresComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
