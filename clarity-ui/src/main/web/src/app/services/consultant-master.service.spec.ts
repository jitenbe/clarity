import { TestBed } from '@angular/core/testing';

import { ConsultantMasterService } from './consultant-master.service';

describe('ConsultantMasterService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ConsultantMasterService = TestBed.get(ConsultantMasterService);
    expect(service).toBeTruthy();
  });
});
