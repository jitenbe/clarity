import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SowMasterComponent } from './sow-master.component';

describe('SowMasterComponent', () => {
  let component: SowMasterComponent;
  let fixture: ComponentFixture<SowMasterComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SowMasterComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SowMasterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
