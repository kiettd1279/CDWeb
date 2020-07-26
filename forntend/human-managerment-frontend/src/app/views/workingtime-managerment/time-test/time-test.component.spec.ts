import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TimeTestComponent } from './time-test.component';

describe('TimeTestComponent', () => {
  let component: TimeTestComponent;
  let fixture: ComponentFixture<TimeTestComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TimeTestComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TimeTestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
