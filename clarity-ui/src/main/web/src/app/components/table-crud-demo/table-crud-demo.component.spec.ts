import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TableCrudDemoComponent } from './table-crud-demo.component';

describe('TableCrudDemoComponent', () => {
  let component: TableCrudDemoComponent;
  let fixture: ComponentFixture<TableCrudDemoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TableCrudDemoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TableCrudDemoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
