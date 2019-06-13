import { TestBed } from '@angular/core/testing';

import { SowMasterService } from './sow-master.service';

describe('SowMasterService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: SowMasterService = TestBed.get(SowMasterService);
    expect(service).toBeTruthy();
  });
});
