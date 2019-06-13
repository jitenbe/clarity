import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ConsutantMasterComponent } from './consutant-master.component';

describe('ConsutantMasterComponent', () => {
  let component: ConsutantMasterComponent;
  let fixture: ComponentFixture<ConsutantMasterComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ConsutantMasterComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ConsutantMasterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
