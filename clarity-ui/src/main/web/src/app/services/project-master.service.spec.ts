import { TestBed } from '@angular/core/testing';

import { ProjectMasterService } from './project-master.service';

describe('ProjectMasterService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ProjectMasterService = TestBed.get(ProjectMasterService);
    expect(service).toBeTruthy();
  });
});
