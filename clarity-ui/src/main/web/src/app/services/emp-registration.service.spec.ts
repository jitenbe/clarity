import { TestBed } from '@angular/core/testing';

import { EmpRegistrationService } from './emp-registration.service';

describe('EmpRegistrationService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: EmpRegistrationService = TestBed.get(EmpRegistrationService);
    expect(service).toBeTruthy();
  });
});
